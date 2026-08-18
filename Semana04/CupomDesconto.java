import java.util.Scanner;

public class CupomDesconto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float valor;
        String cupom;

        System.out.println("Informe o valor total e o seu cupom");
        valor = sc.nextFloat();
        cupom = sc.next();

        // comparacao de texto (String) precisamos utilizar o metodo .equals pq é um tipo NAO PRIMITIVO
        if (cupom.equals("VALE10")) {

            // 10% limitado a 10 reais em um pedido acima de 30 reais
            if (valor < 30) {
                System.out.println("CUPOM INVALIDO PARA VALORES ABAIXO DE 30");
            } else {

                float desconto = 0.1f * valor;  // 0.1f = 0.10 * valor => 10% de valor
                System.out.println("DESCONTO CALCULADO " + desconto);
                if (desconto > 10) {
                    System.out.println("Desconto acima de 10 ... fixando em 10");
                    desconto = 10;
                }

                valor = valor - desconto;

            }

        } else {
            System.out.println("SEM CUPOM / OU INVALIDO");
        }

        System.out.println("VALOR FINAL " + valor);

    }
}
