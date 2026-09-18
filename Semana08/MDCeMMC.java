import java.util.Scanner;

public class MDCeMMC {
    public static void main(String[] args) {
        
        // 1. MMC entre dois valores x e y;
        // 2. MDC entre dois valores x e y
        // TESTANDO TODOS OS VALORES

        // 3. DECOMPOSICAO EM FATORES PRIMOS

        // 4. MMC UTILZANDO A TECNICA DE DECOMPOSICAO (pra casa)
        
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // MMC
        // x = 12;
        // y = 18;

        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14  ... 12 x 18
        // inicia o cont com o maior dos valores
        int cont;
        if (x > y) {
            cont = x;
        } else {
            cont = y;
        }
        // int cont = x > y ? x : y;    // operador ternario
        while (cont < x * y) {
            if (cont % x == 0 && cont % y == 0) {
                System.out.println("CONT " + cont + " EH MULTIPLO DE AMBOS");
                break;
            }
            cont++;
        }
        

        // MDC - MAXIMO DIVISOR COMUM, COMEÇA NO MENOR E VAI DIMINUINDO
        
        

    }
}
