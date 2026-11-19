public class Ex20 {
    public static void main(String[] args) {
        
        int [][] m = {
          { 1, 7, 3 },
          { 7, 4, 5 },
          { 4, 5, 6 }
        };

        boolean simetrica = true;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != m[j][i]) {
                    simetrica = false;
                }
            }
        }

        // int contIguais = 0;
        // for (int i = 0; i < m.length; i++) {
        //     for (int j = 0; j < m.length; j++) {
        //         if (m[i][j] == m[j][i]) {
        //             contIguais++;
        //         }
        //     }
        // }
        // if (contIguais == 9) {

        // }

        if (simetrica) System.out.println("SIMETRICA");
        else System.out.println("NAO SIMETRICA");
    }
}
