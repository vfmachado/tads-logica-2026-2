import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] m = new int[10][10];
        int soma = 0;
        while (true) {
            System.out.print("\033[H\033[2J");

            // quantas vezes as linhas de codigo abaixo sao executadas
            for (int i = 0; i < m.length; i++) {        // 10
                
                // CALCULE A SOMA DE CADA LINHA E MOSTRE O VALOR AO LADO DA LINHA
                for (int j = 0; j < m[i].length; j++) {    // 100
                    System.out.print(m[i][j] + " ");    // 100
                    soma = soma + m[i][j];
                }   
                System.out.println("  S = " + soma);                   // 10
                soma = 0;
            }

            System.out.println("Informe uma linha, coluna e valor");
            int linha = sc.nextInt();
            
            // COLUNA DEVE SER LIDA COMO A, B, C, D, E, F...
            int coluna;
            char letra = sc.next().toUpperCase().charAt(0);
            coluna = (int) letra  - 65;
            
            int valor = sc.nextInt();
            m[linha][coluna] = valor;

        }


    }
}
