import java.util.Scanner;

public class AteN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, contador;
        
        System.out.println("MSG TEXTO nao tem relacao com a linha de baixo");
        n = sc.nextInt();

        // do 0 até n
        contador = 0;
        while (contador <= n) {
            System.out.println(contador);
            contador++; // contador = contador+1
        }

    }
}
