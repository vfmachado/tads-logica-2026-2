import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) throws Exception {
        String [] palavras = new String[1000];
        Scanner sc = new Scanner(new File("palavras.txt"));
        
        int [] vidas = {3, 5, 7};

        int idx = 0;    // index
        while (sc.hasNext()) {
            palavras[idx] = sc.next();
            idx++;
        }
        System.out.println("palavras carregadas " + idx);

        // for (int i = 0; i < palavras.length; i++) {
        //     System.out.println(palavras[i]);
        // }

        Random randomizador = new Random();
        int posicaoSorteada = randomizador.nextInt(1000);    // entre 0 e 999
        String sorteada = palavras[posicaoSorteada];
        System.out.println(sorteada.length());

        int tamanho = sorteada.length();
        int vidaIdx = 0;
        if (tamanho >=5 && tamanho < 7) {
            vidaIdx = 1;
        } else if (tamanho < 5) {
            vidaIdx = 2;
        }

        System.out.println("VIDAS " + vidas[vidaIdx]);

        // procurando na lista
        // String procura = "CAVALO";
        // for (int i = 0; i < palavras.length; i++) {
        //     if (palavras[i].equals(procura)) {
        //         System.out.println(procura + " esta na posicao " + i);
        //         break;
        //     }
        // }

        // TODA STRING É NA VERDADE UM VETOR DE LETRAS
        char [] letras = sorteada.toCharArray();    // transforma uma String em um vetor de caracteres
        char [] mostraPalavra = new char[letras.length];
        sc = new Scanner(System.in);    // reiniciar o scanner agora para o teclado
        int tentativas = 0;
        while (true) {

            char letra = sc.next().toUpperCase().charAt(0);
            
            boolean acertou = false;
            for (int i = 0; i < letras.length; i++) {
                if (letra == letras[i]) {
                    mostraPalavra[i] = letra;
                    acertou = true;
                }
                    // System.out.println("letras[" + i + "] = " + letras[i]);
            }
            if (!acertou) tentativas++;

            boolean completo = true;
            for (int i = 0; i < mostraPalavra.length; i++) {
                if ((int) mostraPalavra[i] == 0) {
                    System.out.print("__ ");
                    completo = false;
                } else {
                    System.out.print(" "+ mostraPalavra[i] + " ");
                }
            }
            System.out.println();

            if (completo) break;
            if (tentativas >= vidas[vidaIdx]) {
                System.out.println("NAO FOI DESSA VEZ .. a palavra era " + sorteada);
                break;
            }
        }

        System.out.println("LETRAS ERRADAS " + tentativas );
    }
}
