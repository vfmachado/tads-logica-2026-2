import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        
        Random r = new Random();
        int L = 6;
        int C = 8;

        int [][] m = new int[L][C];

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                m[i][j] = r.nextInt(100);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int [] resposta  = new int[L];

        for (int i = 0; i < L; i++) {
            // maior valor da linha i
            int maior = m[i][0];
            for (int j = 0; j < C; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
            // System.out.println(maior);
            resposta[i] = maior;
        }

        System.out.println("SAIDA");
        for (int i = 0; i < resposta.length; i++) {
            System.out.println("LINHA " + i + " => " + resposta[i]);
        }
        
    }
}
