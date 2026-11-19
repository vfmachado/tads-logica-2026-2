public class Ex02 {
    public static void main(String[] args) {
        
        // crie 2 matrizes e percorra preenchendo por linha e outra por coluna
        // Exemplo para L = 3 e C = 4:

        // Por linhas:        Por colunas:
        // 1  2  3  4         1  4  7 10
        // 5  6  7  8         2  5  8 11
        // 9 10 11 12         3  6  9 12

        int L = 6;
        int C = 4;
        
        int [][] m1 = new int[L][C];
        int [][] m2 = new int[L][C];


        // logica
        int cont = 1;
        for (int i = 0; i < m1.length; i++) { // linhas
            for (int j = 0; j < m1[0].length; j++) { // colunas
                m1[i][j] = cont;
                cont++;
            }
        }

        cont = 1;
        for (int j = 0; j < m1[0].length; j++) { // colunas
            for (int i = 0; i < m1.length; i++) { // linhas
                m2[i][j] = cont;
                cont++;
            }
        }

        // resultado
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n\n");
          // resultado
          for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}