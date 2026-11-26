import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        
        int TAM = 3;
        int [][] m = {
            {1, 0, 5},
            {0, 1, 1},
            {5, 0, 1}
        };

        // Random r = new Random();
        // for (int i = 0; i < TAM; i++) {
        //     for (int j = 0; j < TAM; j++) {
        //         m[i][j] = r.nextInt(5);
        //         System.out.print(m[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("\n");

        boolean simetrica = true;
        
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (m[i][j] != m[j][i]) {
                    simetrica = false;
                    System.out.println("ASSIMETRIA EM " + i + ", " + j);
                    break;
                }
            }
            if (!simetrica) break;
        }

        if (simetrica) {
            System.out.println("MATRIZ SIMETRICA");
        }
    }
}
