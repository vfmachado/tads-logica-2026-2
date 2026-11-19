import java.util.Random;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        
        int N = 5;
        int [][] m = new int[N][N];
        int [][] n = new int[N][N];
        int [][] soma = new int[N][N];
        int [][] diferenca = new int[N][N];

        Random aleatorio = new Random();

        // preenchimento com valores aleatorios
        for (int i = 0; i < N; i++) { // linhas
            for (int j = 0; j < N; j++) { // colunas
                m[i][j] = aleatorio.nextInt(10);
                n[i][j] = aleatorio.nextInt(10);
            }
        }

        // saida - mostra a matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        // saida - mostra a matriz
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                soma[i][j] = m[i][j] + n[i][j];
                diferenca[i][j] = m[i][j] - n[i][j];
            }
        }

        System.out.println();

        // saida - mostra a matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(soma[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        // saida - mostra a matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(diferenca[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
