import java.util.Scanner;

public class Ex02 {
/*
Exercício 7 — Exibição em ordem inversa
Leia 10 números inteiros e armazene-os em um vetor.

Apresente os valores na ordem inversa à leitura, sem modificar o conteúdo do vetor original e sem criar outro vetor.

Determine o maior e o menor valor armazenado, apresentando também o índice da primeira ocorrência de cada um. 
*/
    public static void main(String[] args) {
        // VETOR COM VALORES DECLARADOS
        int [] vetor = { 72, 33, 16, 8, 1, 12, 20, 11, 32, 1, 52 };

        int posMenor = 0;

        // MOSTRAR EM ORDEM INVERSA
        for (int i = vetor.length -1; i >= 0; i--) {
            System.out.print(vetor[i] + "  ");
        }
        System.out.println();


        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < vetor[posMenor]) {
                posMenor = i;   // salvo a posicao
            }
        }
        System.out.println("POSICAO DO MENOR " + posMenor);
        System.out.println("VALOR DO MENOR " + vetor[posMenor]);
    }
}
