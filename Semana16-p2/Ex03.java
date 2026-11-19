public class Ex03 {
    public static void main(String[] args) {
        
        int N = 10;
        int [][] m = new int[N][N];

        for (int i = 0; i < N; i++) { // linhas
            for (int j = 0; j < N; j++) { // colunas
                m[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
