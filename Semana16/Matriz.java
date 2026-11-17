public class Matriz {
    public static void main(String[] args) {
        // inicia uma matriz matriz de qualquer tamanho retangular
        int [][] m = {
            {2, 4, 3, 4},       // linhas = m.length
            {1, 3, 3, 1},        // colunas = m[0].length
            {1, 1, 1, 1}
        };

        int linhas = m.length;
        int colunas = m[0].length;

        // calcule a matriz transposta e mostre (as linhas viram colunas)
        // m  tamanho 2x4
        // t  tamanho 4x2
        int [][] t = new int[m[0].length][m.length]; // indicar os tamanhos

        // calcula a matriz transposta
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                t[j][i] = m[i][j];
            }
        }

        // mostra a transposta
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        // MULTIPLICACAO DE MATRIZES
        int [][] mult = new int[m.length][t[0].length];


        for (int i = 0; i < mult.length; i++) {     // linhas
            for (int j = 0; j < mult[0].length; j++) {  // colunas

                // somatorio
                for (int k = 0; k < mult.length; k++) {
                    mult[i][j] = mult[i][j] + m[i][k] * t[j][j];
                }
                
            }
        }

        System.out.println("\n M x T\n");
        for (int i = 0; i < mult.length; i++) {
            for (int j = 0; j < mult[0].length; j++) {
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }
    }
}