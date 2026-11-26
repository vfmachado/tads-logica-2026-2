public class Ex7 {
    public static void main(String[] args) {
        
        int [][] m = {
            {1000, 7, 9, 0},
            {1001, 6, 9, 0},
            {1002, 8, 7, 0},
            {3000, 10, 10, 0},
            {1003, 9, 9, 0},
            {1004, 9, 10, 0}, 
            {1005, 7, 10, 0},
            {1006, 7, 5, 0}
        };

        for (int i = 0; i < m.length; i++) {
            m[i][3] = m[i][1] + m[i][2];
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < 4; j++) { 
                System.out.printf("%d\t", m[i][j]);
            }
            System.out.println();
        }


        // matricula da maior nota
        int idxMaior = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i][3] > m[idxMaior][3]) {
                idxMaior = i;
            }
        }

        System.out.println("ALUNO " + m[idxMaior][0]);
    }
}
