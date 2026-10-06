import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x, y, z;

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        int mdc = 1;
        int divisor = 1;
        while (divisor <= x && divisor <= y && divisor <= z) {

            if (x % divisor == 0 &&
                y % divisor == 0 &&
                z % divisor == 0
            ) {
                mdc = divisor;
            }

            divisor++;
        }

        int mmc = 1;
        while (true) {

            if (mmc % x == 0 &&
                mmc % y == 0 &&
                mmc % z == 0
            ) break;

            mmc++;
        }

        System.out.println("MDC = " + mdc);
        System.out.println("MMC = " + mmc);

    }

}
