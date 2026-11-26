public class Ex4 {
    public static void main(String[] args) {
        int N = 10;
        char [][] m = new char[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { 
                if (i == 0 || i == N-1 || j == 0 || j == N-1 || i == j || i == N-1-j) {
                    m[i][j] = 'X';
                } else {
                    m[i][j] = 'O';
                }
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { 
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}
