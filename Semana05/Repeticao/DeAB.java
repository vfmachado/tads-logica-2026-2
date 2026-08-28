import java.util.Scanner;

public class DeAB {
    public static void main(String[] args) {
        
        // dado dois valores, a e b, mostrar os numeros no intervalo
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("informe 2 valores");
        a = sc.nextInt();
        b = sc.nextInt();

        while (a <= b) {
            System.out.println(a);
            a++;
        }

    }
}
