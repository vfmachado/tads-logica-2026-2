import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        final int N = aleatorio.nextInt(100)+1; // 1 e 100
        int valor = 0;
        int tentativas = 0;
        // System.out.println(N);

        while (valor != N) {
            System.out.println("informe um valor");
            valor = sc.nextInt();
            tentativas++;

            System.out.println("VC TENTOU " + tentativas + " VEZES");

            if (tentativas >= 3 && valor != N) {
                // if (valor < N) {
                //     System.out.println("TENTE MAIOR");
                // } else if (valor > N) {
                //     System.out.println("TENTE MENOR");
                // }

                int distancia = valor - N;
                if (distancia < 0) { 
                    distancia *= -1;  // distancia = distancia * -1
                }

                if (distancia < 10) {
                    System.out.println("TA BEM QUENTE");
                } else if (distancia < 20) {
                    System.out.println("TA QUENTE");
                } else if (distancia < 30) {
                    System.out.println("MORNO");
                } else {
                    System.out.println("FRIO");
                }
            }
        }
        

    }
}
