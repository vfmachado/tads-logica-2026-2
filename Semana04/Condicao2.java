import java.util.Scanner;

public class Condicao2 {
    public static void main(String[] args) {
        
        int numero;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um numero");
        numero = in.nextInt();

        // numero é par?
        if (numero % 2 == 0) {
            System.out.println("Numero digitado e par");

            // numero é multiplo de 6
            if (numero % 3 == 0) {
                System.out.println("multiplo de 6");
            }
        }


    }
}
