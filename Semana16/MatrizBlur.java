import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class MatrizBlur {
    public static void main(String[] args) throws Exception {

        // carregue a imagem passaro.png em uma matriz
        BufferedImage imagem = ImageIO.read(new File("passaro.png"));
        int linhas = imagem.getHeight();
        int colunas = imagem.getWidth();

        // cada posicao da matriz guarda o tom de cinza do pixel (0 = preto, 255 = branco)
        double[][] img = new double[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int rgb = imagem.getRGB(j, i);       // getRGB recebe (x, y) = (coluna, linha)
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = rgb & 0xFF;
                img[i][j] = (r + g + b) / 3.0;       // media das cores = cinza
            }
        }
        salvar(img, "cinza.png");
        System.out.println("Imagem carregada: " + linhas + " x " + colunas);

        // inicie uma matriz de deteccao de borda
        // (filtro Laplaciano: compara o pixel do meio com seus vizinhos;
        //  onde tudo eh parecido o resultado da ~0, onde muda muito eh borda)
        double[][] kernel = {
            {-1, -1, -1},
            {-1,  6, -1},
            {-1, -1, -1}
        };

        // aplique sobre a matriz da imagem o filtro de deteccao de borda utilizando a matriz de deteccao de borda gerando uma nova matriz e salve em borda.png
        double[][] borda = new double[linhas][colunas];
        for (int i = 1; i < linhas - 1; i++) {           // pula a primeira e a ultima linha
            for (int j = 1; j < colunas - 1; j++) {      // pula a primeira e a ultima coluna
                double soma = 0;
                // passa o kernel 3x3 por cima do pixel (i, j) e seus vizinhos
                for (int ki = 0; ki < 3; ki++) {
                    for (int kj = 0; kj < 3; kj++) {
                        soma += kernel[ki][kj] * img[i + ki - 1][j + kj - 1];
                    }
                }
                borda[i][j] = Math.abs(soma);
            }
        }
        salvar(borda, "borda.png");
        System.out.println("Salvo borda.png");

        // aplique um efeito de blur utilizando multipicacao de matrizes e salve em blur.png
        //
        // Ideia: uma matriz M "de media" com 1/(2r+1) perto da diagonal e 0 no resto.
        // Exemplo com r = 1 (cada pixel vira a media dele com os vizinhos):
        //   | 1/3 1/3  0   0  |
        //   | 1/3 1/3 1/3  0  |
        //   |  0  1/3 1/3 1/3 |
        //   |  0   0  1/3 1/3 |
        //
        //   M  x img  -> mistura cada pixel com os de cima e de baixo  (blur vertical)
        //   img x M   -> mistura cada pixel com os da esquerda e direita (blur horizontal)
        //   blur = M x img x M
        int r = 6; // raio do blur: quanto maior, mais borrado
        double[][] mVertical = matrizDeMedia(linhas, r);
        double[][] mHorizontal = matrizDeMedia(colunas, r);

        double[][] blur = multiplicar(multiplicar(mVertical, img), mHorizontal);
        salvar(blur, "blur.png");
        System.out.println("Salvo blur.png");
    }

    // multiplicacao de matrizes: C[i][j] = soma de A[i][k] * B[k][j]
    static double[][] multiplicar(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                double soma = 0;
                for (int k = 0; k < b.length; k++) {
                    soma += a[i][k] * b[k][j];
                }
                c[i][j] = soma;
            }
        }
        return c;
    }

    // matriz n x n com 1/(2r+1) nas posicoes ate r de distancia da diagonal
    static double[][] matrizDeMedia(int n, int r) {
        double[][] m = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= r) {
                    m[i][j] = 1.0 / (2 * r + 1);
                }
            }
        }
        return m;
    }

    // transforma a matriz de volta em imagem (cinza) e salva em PNG
    static void salvar(double[][] m, String arquivo) throws Exception {
        BufferedImage saida = new BufferedImage(m[0].length, m.length, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                int v = (int) Math.min(255, Math.max(0, m[i][j])); // garante 0..255
                saida.setRGB(j, i, (v << 16) | (v << 8) | v);
            }
        }
        ImageIO.write(saida, "png", new File(arquivo));
    }
}
