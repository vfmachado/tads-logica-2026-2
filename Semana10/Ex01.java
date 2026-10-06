import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int valor;
        float somaPares = 0, somaImpares = 0;
        int quantPares = 0, quantImpares = 0;
        int maiorPar = -1;
        int menorImpar = Integer.MAX_VALUE;

        while (true) {

            System.out.println("informe um valor");
            valor = sc.nextInt();

            if (valor < 0) break;

            if (valor % 2 == 0) {
                somaPares = somaPares + valor;
                quantPares++;

                if (valor > maiorPar) {
                    maiorPar = valor;
                }
            } else {
                somaImpares = somaImpares + valor;
                quantImpares++;

                if (valor < 0) {
                    menorImpar = valor;
                }
            }

        }

        if (quantPares > 0) {
            float mediaPares = somaPares/quantPares;
            System.out.println("Media pares " + mediaPares);
            System.out.println("MAIOR PAR " + maiorPar);
        }

        if (quantImpares > 0) {
            float mediaImpares = somaImpares/quantImpares;
            System.out.println("Media impares " + mediaImpares);
            System.out.println("MENOR IMPAR " + menorImpar);
        }
    }
}
