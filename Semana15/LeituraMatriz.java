import java.util.Scanner;

public class LeituraMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int LINHAS = 3;
        final int COLUNAS = 4;
        int [][] m = new int[LINHAS][COLUNAS];

        // m.length != m[i].length
        // linhas != colunas

        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                System.out.println("informe o valor para a posicao " + i + ", " + j);
                m[i][j] = sc.nextInt();
            }
        }

        // for (int lin = 0; lin < LINHAS; lin++) {
        //     for (int col = 0; col < COLUNAS; col++) {
        //         System.out.println("informe o valor para a posicao " + lin + ", " + col);
        //         m[lin][col] = sc.nextInt();
        //     }
        // }

        for (int i = 0; i < LINHAS; i++) {
            // System.out.println("MATRIZ NO VETOR " + i);
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print(m[i][j] + "  ");;
            }
            System.out.println();
            // 1System.out.println();
        }


    }
}
