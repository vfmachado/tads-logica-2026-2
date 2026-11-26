import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        int [][] m = new int[5][5];
        Random r = new Random();
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = r.nextInt(10);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        do {

            int x = sc.nextInt();
            if (x == -1) break;

            // a soma de alguma linha resulta em x ?

            boolean encontrei = false;
            for (int i = 0; i < m.length; i++) {
                int soma = 0;
                for (int j = 0; j < m.length; j++) {
                    soma = soma + m[i][j];
                }
                // soma da linha i foi calculada na variavel soma
                if (soma == x) {
                    encontrei = true;
                    System.out.println("Soma encontrada na linha " + i);
                }
            }

            if (!encontrei) {
                System.out.println("Soma nao encontrada");
            }

        } while (true);

    }
}
