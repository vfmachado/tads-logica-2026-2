import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 1;
        float saldo = 0;

        while (opcao != 4) {
            System.out.print("""
                1. ver saldo
                2. depositar
                3. sacar    
                4. sair

                opcao: """
            );
            opcao = sc.nextInt();

            // 1. mostre o saldo
            // 2. receba um valor a ser depositado (> 0)
            // 3. receba um valor a ser sacado (> 0)
            // 4. encerre o laço
            if (opcao == 1) {
                System.out.printf("SALDO R$ %.2f\n", saldo);
            } else if (opcao == 2) {

                System.out.println("Informe o valor que deseja depositar");
                float valor = sc.nextFloat();
                if (valor > 0) {
                    saldo = saldo + valor;
                } else {
                    System.out.println("Valor incorreto, voltando ao menu");
                }

            } else if (opcao == 3) {

                System.out.println("Informe o valor que deseja sacar");
                float valor = sc.nextFloat();
                if (valor > 0 && valor <= saldo) {
                    saldo = saldo - valor;
                } else if (valor > saldo) {
                    System.out.println("SALDO INDISPONIVEL");  
                } else {
                    System.out.println("Valor incorreto, voltando ao menu");
                }


            } else if (opcao != 4) {
                System.out.println("OPCAO INVALIDA");
            }
        
        }
    }
}