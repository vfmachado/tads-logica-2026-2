import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        /*
            25 = 5x5
            81 = 9x9
            225 = 15x15
            400 = 20x20
            12 =  3x3 = 9   4x4 16
        */
        Scanner sc = new Scanner(System.in);

        int valor;
        int mult;
        
        while (true) {

            System.out.println("informe um valor");
            valor = sc.nextInt();

            if (valor <= 0) break;

            mult = 1;
            while (mult * mult < valor) {
                mult++;
            }

            if (mult * mult == valor)
                System.out.println("QUADRADO PERFEITO");
            else
                System.out.println("NAO EH QUAD PERF");
        }

    }
}
