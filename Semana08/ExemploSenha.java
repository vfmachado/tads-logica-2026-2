import java.util.Scanner;

public class ExemploSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String senha = "SENHA";
        String digitado;

        // do ... while executa SEMPRE PELO MENOS 1X
        do {
            System.out.println("INFORME A SENHA");
            digitado = sc.next();
        } while (!digitado.equals(senha));
                // equals para comparar texto e ! para negar a igualdade


        // validando input
        int idade;
        do {
            System.out.println("informe a idade");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 120);
    }    
}
