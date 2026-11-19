import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        
        /*
            Leia a quantidade L de linhas e C de colunas de uma matriz, ambas com no máximo 10. Em seguida, leia uma matriz L x C de números inteiros.

            Crie dois vetores:

            SL, em que cada posição armazena a soma de uma linha da matriz.
            SC, em que cada posição armazena a soma de uma coluna da matriz.
            Apresente a matriz e os dois vetores.

            Exemplo:

            Matriz:
            5 -8 10
            1  2 15
            25 10  7

            SL = [7, 18, 42]
            SC = [31, 4, 32]
        
        */

        Random aleatorio = new Random();
        int L = aleatorio.nextInt(10) + 1;
        int C = aleatorio.nextInt(10) + 1;
        int [][] m = new int[L][C];

        // preenchimento com valores aleatorios
        for (int i = 0; i < L; i++) { // linhas
            for (int j = 0; j < C; j++) { // colunas
                m[i][j] = aleatorio.nextInt(11);
            }
        }

        // SL, em que cada posição armazena a soma de uma linha da matriz.
        int [] SL = new int[L];
        int [] SC = new int[C];

        for (int i = 0; i < SL.length; i++) {
            int soma = 0;
            for (int j = 0; j < C; j++) {
                soma = soma + m[i][j];
            }
            SL[i] = soma;
        }

        for (int j = 0; j < SC.length; j++) {
            int soma = 0;
            for (int i = 0; i < L; i++) {
                soma = soma + m[i][j];
            }
            SC[j] = soma;
        }

        // saida - mostra a matriz
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("SL = ");
        for (int i = 0; i < SL.length; i++) {
            System.out.print(SL[i] + "  ");
        }
        System.out.println();

        System.out.print("SC = ");
        for (int i = 0; i < SC.length; i++) {
            System.out.print(SC[i] + "  ");
        }
        System.out.println();
    }
}
