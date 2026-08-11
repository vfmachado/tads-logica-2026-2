import java.util.Scanner;

public class ExOperacoes {
    public static void main(String[] args) { 
        // entrada
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        int soma, multiplicacao, subtracao, divisao, resto;

        System.out.println("Informe dois valores");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        // processamento
        soma = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;
        resto = n1 % n2;        // RESTO INTEIRO DA DIVISAO

        // saida
        System.out.println("SOMA: " + soma);
        System.out.println("SUBTRACAO: " + subtracao);
        System.out.println("DIVISAO: " + divisao);
        System.out.println("MULTIPLICACAO: " + multiplicacao);
        System.out.println("RESTO: " + resto);
    }
}