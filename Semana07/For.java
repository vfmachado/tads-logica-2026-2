import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // quando utilizar?

        // se tivermos as 3 respostas
        // inicio, condicao e passo

        // ir de 10 a 20
        for (int i = 10; i <= 20; i++) {}

        // ir de 20 a 10
        for (int i = 20; i >= 10; i--) {}

        // pares entre 1 e 20
        for (int p = 2; p <= 20; p = p + 2) {}

        // ** se o "passo" for muito complexo, possivelmente o for ficara dificil de ler

        /*
        for (inicio ;  condicao; passo) {
            bloco de codigo
        }

        TODOS OS MEMBROS SAO OPCIONAIS, OS PONTO-E-VIRGULA NAO
        FOR (;;) {}   <=>  WHILE(TRUE)
        */


        int c = 0;
        while (c <= 10) {
            c++;
        }

        c = 10;
        for ( ; c <= 10; ) {
            c++;
        }

        // a. MULTIPLOS DE 3 DO 3 ATÉ 30
        int m = 3;
        while (m <= 30) {
            System.out.println(m);
            m = m + 3;
        }

        for (int n = 3; n <= 30; n = n + 3) {
            System.out.println(n);
        }

        // b. CONTAGEM REGRESSIVA DE N ATÉ 0
        int numero = sc.nextInt();
        for (int n = numero; n >= 0; n--) {
            System.out.println(n);
        }

        int a = numero;
        while (a >= 0) {
            System.out.println(a);
            a--;
        }

        // c. SOMA DOS NUMEROS DE UM INTERVALO X, Y

    }
}
