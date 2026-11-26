import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        // matriz ja declarada
        int [][] m = {
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 0},
            {1, 2, 3, 4}
        };

        // Scanner sc = new Scanner(System.in);
        // // linhas
        // for (int i = 0; i < m.length; i++) {
        //     // colunas
        //     for (int j = 0; j < m.length; j++) {
        //         m[i][j] = sc.nextInt();
        //     }
        // }

        // int [][] n;
        // // linhas e colunas dinamicos (escolhidos pelo usuario)
        // int linhas = sc.nextInt();
        // int colunas = sc.nextInt();
        // n = new int[linhas][colunas];
        // Random aleatorio = new Random();
        // for (int i = 0; i < linhas; i++) {
        //     // colunas
        //     for (int j = 0; j < colunas; j++) {
        //         n[i][j] = aleatorio.nextInt(20) -10;
        //     }
        // }

        /*
        somas
        a. na linha 2 da matriz. 
        b.  na coluna 1 da matriz. 
        c.  na diagonal principal da matriz. 
        d.  em toda matriz
        */
        int somaLinha2 = 0;
        for (int col = 0; col < m.length; col++) {
                somaLinha2 = somaLinha2 + m[2][col];
        }
        System.out.println("SOMA LINHA 2 = " + somaLinha2);

        somaLinha2 = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == 2) {
                    somaLinha2 = somaLinha2 + m[i][j];
                }
            }
        }
        System.out.println("SOMA LINHA 2 = " + somaLinha2);

    }
}