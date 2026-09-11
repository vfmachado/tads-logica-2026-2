import java.util.Scanner;

public class MediaValidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // media de 5 valores validos (0 <= x <= 10)
        int validos = 0;
        float soma = 0;
        float valor;

        while (validos < 5) {
            valor = sc.nextFloat();
            if (valor >= 0 && valor <= 10) {
                soma = soma + valor;
                validos++;
            }
        }
        System.out.println("SOMA " + soma);

        soma = 0;
        for (validos = 0; validos < 5; /*passo dentro do for */ ) {
            valor = sc.nextFloat();
            if (valor >= 0 && valor <= 10) {
                soma = soma + valor;
                validos++;
            }
        }
        System.out.println("SOMA " + soma);

        soma = 0;
        for (validos = 0; validos < 5; validos++ ) {
            valor = sc.nextFloat();
            if (valor >= 0 && valor <= 10) {
                soma = soma + valor;
            } else {
                validos--;
            }
        }
        System.out.println("SOMA " + soma);

    }
}
