import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        int cont = 1; // INICIALIZACAO - variavel que sera utilizada no controle do laco de repeticao.
        int pares = 0;
        int impares = 0;
        float soma = 0;

        int maior = 0;
        int menor = Integer.MAX_VALUE;

       while (cont <= 10) {
            // BLOCO DE CODIGO
            // 1
            // System.out.println(cont);

            System.out.println("informe um valor");
            valor = sc.nextInt();

            soma = soma + valor;    // soma += valor;

            if (valor % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor || cont == 1) {
                menor = valor;
            }

            // ALGUMA INSTRUCAO QUE TORNE A EXPRESSAO LOGICA FALSE EM ALGUM MOMENTO
            cont = cont + 1;    // cont++
        }

        System.out.println("PARES " + pares);
        System.out.println("IMPARES " + impares);
        System.out.println("MAIOR " + maior);
        System.out.println("Menor " + menor);
        
        float media = soma / 10;
        System.out.println("MEDIA " + media );
       
    }
}