import java.util.Random;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        
        /*
         Linhas com soma X
        Leia uma matriz 5 x 5 de números inteiros.

        Em seguida, solicite repetidamente ao usuário um valor X e informe quais linhas da matriz possuem soma de elementos igual a X. Caso nenhuma linha atenda à condição, apresente uma mensagem apropriada.

        O programa deverá encerrar quando o usuário informar -999.

        Exemplo:

        Matriz:
        2  4  6 -4  3
        4  9 -8  2  4
        1  5  0  7 -6
        3  9  3 -5 -3
        -4  2  3 -1  1

        X = 11
        Linha 0
        Linha 1

        X = 7
        Linha 2
        Linha 3

        X = 0
        Nenhuma linha soma o valor informado.
        
        */

        int N = 5;
        int [][] m = new int[N][N];
        Random aleatorio = new Random();

        // preenchimento com valores aleatorios
        for (int i = 0; i < N; i++) { // linhas
            for (int j = 0; j < N; j++) { // colunas
                m[i][j] = aleatorio.nextInt(10);
            }
        }

        // saida - mostra a matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        int x;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("X = ");
            x = sc.nextInt();

            if (x == -999) break;

            boolean entrou = false;
            for (int i = 0; i < 5; i++) {
                int soma = 0;
                for (int j = 0; j < 5; j++) {
                    soma = soma + m[i][j];
                }
                if (soma == x) {
                    System.out.println("LINHA " + i);
                    entrou = true;
                }
            }

            if (!entrou) {
                System.out.println("SOMA NAO ENCONTRADA");
            }
        }
    }
}
