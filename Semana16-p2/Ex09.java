import java.util.Random;

public class Ex09 {
    public static void main(String[] args) {
        /*
        Somas selecionadas
        Leia uma matriz 4 x 4 de números inteiros. Calcule e apresente a soma dos elementos:

        Da linha de índice 2.
        Da coluna de índice 1.
        Da diagonal principal.
        Da diagonal secundária.
        De toda a matriz

        0       7       7       0
        6       0       9       5
        1       9       6       6       m[2][j]
        8       6       8       7
            

        */

        int N = 4;
        int [][] m = new int[N][N];
        Random aleatorio = new Random();

        // preenchimento com valores aleatorios
        for (int i = 0; i < N; i++) { // linhas
            for (int j = 0; j < N; j++) { // colunas
                m[i][j] = aleatorio.nextInt(10);
            }
        }

        int somaI2 = 0, colI1 = 0, diag = 0;
        for (int j = 0; j < 4; j++) {
            somaI2 = somaI2 + m[2][j];
            colI1 = colI1 + m[j][1];
            diag = diag + m[j][j];  // logica da diagonal principal
        }

        int diagSec = 0, somaTotal = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i + j == m.length -1) {
                    diagSec = diagSec + m[i][j];
                }
                somaTotal = somaTotal + m[i][j];
            }
        }

        // saida - mostra a matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("SOMA LINHA indice 2 " + somaI2);
        System.out.println("SOMA COLUNA indice 1 " + colI1);
        System.out.println("SOMA DIAG P " + diag);
        System.out.println("SOMA DIAG SEC " + diagSec);
        System.out.println("SOMA TOTAL " + somaTotal);
    }
}
