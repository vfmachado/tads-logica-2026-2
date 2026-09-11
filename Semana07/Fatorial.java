public class Fatorial {
    public static void main(String[] args) {
        
        // dado um N, calcular seu fatorial

        // 4! = 4 x 3 x 2 x 1
        // 6! = 6 x 5 x 4 x 3 x 2 x 1

        int fatorial = 1;
        int n = 5;

        // 1 até n
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println();

        // n até 1
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
            fatorial = fatorial * i;
            System.out.println("FATORIAL ATE AQUI " + fatorial);
        }

        System.out.println("RESULTADO = " + fatorial);

    }    
}
