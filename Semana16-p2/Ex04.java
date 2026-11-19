public class Ex04 {
    public static void main(String[] args) {
        
        int N = 10;
        int [][] m = new int[N][N];

        for (int i = 0; i < N; i++) { // elementos da diagonal principal tem linha = coluna
            m[i][i] = 1;
        }
        // diagonal secundaria  (linha + coluna) = tamanho -1 

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
