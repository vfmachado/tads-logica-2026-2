public class VetorDeVetor {

    public static void main(String[] args) {
        
        int [] vetor = { 1, 2, 3, 4, 5}; 

        int [][] m = new int[8][8];

        int [][] m2 = {
            {10, 20, 30, 40},
            {35, 2, 4, 8},
            {1, 3, 5, 7}
        };

        // NO NOSSO CASO A LEITURA SEMPRE SERÁ LINHAS E DEPOIS COLUNAS

        int linhas = m.length;
        int colunas = m[0].length;
        // PARA MOSTRAR UMA MATRIZ
        // for que percorre as linhas
        for (int i = 0; i < m.length; i++) {    // m.length => quantidades de linhas
            // para cada linha, um for para mostrar as colunas
            for (int j = 0; j < m[i].length; j++) { // m[i].length  => quantidade de colunas da linha i
                System.out.printf("%d,%d = %d  ", i, j, m[i][j]);
            }
            System.out.println();
        }

        // FAÇA UM PROGRAMA QUE LEIA DO SCANNER UMA MATRIZ 3X4 E DEPOIS MOSTRE ELA
        // FAÇA O PROGRAMA INDICAR QUANTOS ELEMENTOS DA MATRIZ SAO PARES OU IMPARES
    }

}