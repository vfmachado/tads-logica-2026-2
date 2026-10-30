import java.util.Scanner;

public class JogoDaVelha {
    
    public static void main(String[] args) {
        
        char [] tabuleiro = {
            ' ', ' ', ' ',
            ' ', ' ', ' ',
            ' ', ' ', ' '
        };

        for (int i = 0; i < 9; i++) {
            System.out.print(i + "  ");
            if ((i+1)%3 == 0) {
                System.out.println();
            }
        }
        
        Scanner sc = new Scanner(System.in);
        char jogador = 'O';
        int colocados = 0;
        boolean ganhou = false;
        while (true) {
            System.out.println();
            for (int i = 0; i < tabuleiro.length; i++) {
                System.out.print(tabuleiro[i]);
                if ((i+1) % 3 != 0) {
                    System.out.print(" | ");
                }
                if ((i+1)%3 == 0 && i != tabuleiro.length-1) {
                    System.out.println("\n---------");
                } 
            }

            
            // linhas
            for (int linha = 0; linha < 9; linha = linha +3) {

                if (tabuleiro[linha] != ' ' && tabuleiro[linha + 0] == tabuleiro[linha+1] && tabuleiro[linha+1] == tabuleiro[linha+2]) {
                    ganhou = true;
                }

            }
            // colunas
            for (int coluna = 0; coluna < 3; coluna = coluna+1) {

                if (tabuleiro[coluna] != ' ' && tabuleiro[coluna + 0] == tabuleiro[coluna+3] && tabuleiro[coluna+3] == tabuleiro[coluna+6]) {
                    ganhou = true;
                }
            }
            // diagonal principal
            if (tabuleiro[0] != ' ' && tabuleiro[0] == tabuleiro[4] && tabuleiro[4] == tabuleiro[8]) {
                ganhou = true;
            }
            // diagonal secundaria
            if (tabuleiro[2] != ' ' && tabuleiro[2] == tabuleiro[4] && tabuleiro[4] == tabuleiro[6]) {
                ganhou = true;
            }

            if (ganhou) break;
            if (colocados == 9) {
                break;
            }

            System.out.println("\n posicao: ");
            int op = sc.nextInt();
            tabuleiro[op] = jogador;
            colocados++;

            if (jogador == 'O') jogador = 'X';
            else jogador = 'O';
        }

        if (ganhou) System.out.println("GANHOU!");
        else System.out.println("Empate");
    }
}
