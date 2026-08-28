import java.util.Scanner;

public class Indeterminada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        // sabemos que esse laco vai executar 10x
        while (cont < 10) {
            cont++;
        }

        int senha = 1234;
        // REPETICAO INDETERMINADA = NAO SABEMOS QUANTAS VEZES VAI EXECUTAR
        cont = sc.nextInt();
        while (cont != senha) {
            System.out.println("VC ERROU ... tente novamente");
            if (cont < senha) {
                System.out.println("CHUTE MAIOR");
            } else {
                System.out.println("CHUTE MENOR");
            }
            
            cont = sc.nextInt();

           
        }

        System.out.println("SENHA ACEITA");
    }
}
