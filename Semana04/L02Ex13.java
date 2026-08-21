import java.util.Scanner;

public class L02Ex13 {
    /*
    Leia três números inteiros e informe qual é o maior. O programa também deve identificar o caso em que os três valores são iguais
    */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        // entrada
        System.out.println("informe 3 valores");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        // SE N1 FOR MAIOR QUE N2 EEEEEEEE N1 FOR MAIOR QUE N3 
        if (n1 > n2 && n1 > n3) {   
            // n1 é o maior
            System.out.println("maior = " + n1);
        }

        if (n2 >  n1) {
            if (n2 >  n3) {
                System.out.println("maior = " + n2);
            }
        }

        // n3 > n1     n3 > n2   logo n3 é o maior
        if (n3 > n1 && n3 > n2) {
            System.out.println("maior = " + n3);
        }


        if (n1 == n2 && n2 == n3) {
            System.out.println("Sao iguais");
        }

    }
}
