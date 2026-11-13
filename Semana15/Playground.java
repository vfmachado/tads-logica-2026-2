import java.io.IOException;
import java.util.Random;

public class Playground {

    private static volatile char direcao = 'D';
    private static volatile boolean rodando = true;

    public static void main(String[] args) throws Exception {
        // 1. Configura o terminal para modo raw (sem precisar de Enter)
        ativarModoRaw();

        // Thread dedicada para ler os bytes direto do System.in
        // O SCANNER TRAVA A ENTRADA, POR ISSO A MODIFICAÇÃO NA LEITURA
        // como o jogo roda a uma velocidade diferente do teclado, vamos fazer isso em uma thread separada
        Thread threadTeclado = new Thread(() -> {
            try {
                while (rodando) {
                    // System.in.available() verifica se há tecla pressionada sem travar o loop
                    if (System.in.available() > 0) {
                        int tecla = System.in.read();
                        char c = Character.toUpperCase((char) tecla);

                        if (c == 'W' && direcao != 'B') direcao = 'C';
                        else if (c == 'S' && direcao != 'C') direcao = 'B';
                        else if (c == 'A' && direcao != 'D') direcao = 'E';
                        else if (c == 'D' && direcao != 'E') direcao = 'D';
                        else if (c == 'Q') rodando = false;
                    }
                    Thread.sleep(10); // Evita uso excessivo de CPU
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        threadTeclado.start();      // isso roda em paralelo

        char [][] m = new char[20][30];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = ' ';
            }
        }

        // Game Loop principal
        int x = 10, y = 10;
        int comidaX, comidaY;
        int pontuacao = 0;
        Random aleatorio = new Random();

        comidaX = aleatorio.nextInt(30);
        comidaY = aleatorio.nextInt(20);
        m[comidaY][comidaX] = '$';

        while (rodando) {

            if (y == comidaY && x == comidaX) {
                pontuacao++;
                comidaX = aleatorio.nextInt(30);
                comidaY = aleatorio.nextInt(20);
                m[comidaY][comidaX] = '$';
            } 
            m[y][x] = ' ';

            switch (direcao) {
                case 'C' -> y--;
                case 'B' -> y++;
                case 'E' -> x--;
                case 'D' -> x++;
            }

            if (y < 0) y = m.length - 1;
            if (y >= m.length) y = 0;
            
            if (x < 0) x = m[0].length - 1;
            if (x >= m[0].length) x = 0;

            m[y][x] = 'X';

            // Limpa a tela usando códigos ANSI
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Use W, A, S, D para mover | Q para sair");
            System.out.println("Direção: " + direcao + " | Posição: (" + x + ", " + y + ")");
            System.out.println("PONTUACAO " + pontuacao);
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                   System.out.print(m[i][j]);;
                }
                System.out.println();
            }

            Thread.sleep(200);
        }
    }

    private static void ativarModoRaw() throws IOException, InterruptedException {
        String os = System.getProperty("os.name").toLowerCase();
        if (!os.contains("win")) {
            // -icanon: lê caractere por caractere sem esperar Enter
            // -echo: não imprime a tecla digitada no console
            new ProcessBuilder("sh", "-c", "stty -icanon -echo </dev/tty").inheritIO().start().waitFor();
        }
    }
}
