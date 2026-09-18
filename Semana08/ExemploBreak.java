public class ExemploBreak {
    public static void main(String[] args) {
        

        int n = 39;
        int divisores = 0;

        for (int i = 2; i < n/2; i++) {
            // System.out.println(i);
            if (n % i == 0) {   // encontrei um divisor, logo nao é primo
                System.out.println(i);
                divisores = 1;
                System.out.println("NAO EH PRIMO");
                break;  // parar o laco
            }
        }

        if (divisores == 0) {
            System.out.println("EH PRIMO");
        }
        // INFORME SE UM NUMERO NAO É PRIMO



    }
}
