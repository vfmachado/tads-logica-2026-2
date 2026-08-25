import java.util.Scanner;

public class ComparacaoTexto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // String é um tipo nao primitivo
        // vem da classe String
        String senha = "java123";
        String digitado;

        System.out.println("informe a senha");
        digitado = sc.next();

        // tipos nao primitivos devem ser comparados com .equals
        if (digitado.equals(senha)) {
            System.out.println("Senha CORRETA");
        } else {
            System.out.println("SENHA INVALIDA");
        }

        
    }
}
