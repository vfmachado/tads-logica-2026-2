public class Decomposicao {
    public static void main(String[] args) {
        
        // DECOMPOR UM NUMERO EM FATORES PRIMOS

        /*
            90  2
            45  3
            15  3
            5   5
            1

            A DECOMPOSICAO DO 90 E 2 X 3 X 3 X 5
        */

        int n = 90;
        int divisor = 2;
        while (n != 1) {

            if (n % divisor == 0) {
                System.out.println(divisor);
                n = n / divisor;
            } else {
                divisor++;
            }

        }

    }
}
