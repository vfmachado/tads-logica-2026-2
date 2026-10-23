import java.io.File;
import java.util.Scanner;

public class ExemploLeituraVetor {
        public static void main(String[] args) throws Exception {
        int [] v = new int[10];
        Scanner sc = new Scanner(new File("vetor.txt"));
        
        int idx = 0;
        while (sc.hasNext()) {
            v[idx] = sc.nextInt();
            idx++;
        }

        char [] letras = new char[5];
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        
    }
}
