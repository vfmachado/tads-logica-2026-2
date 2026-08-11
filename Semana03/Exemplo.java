import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        // Scaner com S maiusculo é o tipo
        // depois vem o nome da variavel do tipo Scanner
        Scanner sc = new Scanner(System.in);
        /*
            sc => nome da variavel
            new Scanner();   => nova instancia (por ser uma variavel de tipo nao primitivo precisa do new)
            System.in => de onde o Scanner vai ler (entrada padrao, terminal)
        
        */
        System.out.println("FUNCIONA!");

        // VARIAVEL
        // tipo nome;  => declarar a variavel
        int numero;
        String html;
        String nome;

        /*
            tipo => indica o formato de dado, numero inteiro, decimal, texto, etc..

            nome => é o apelido que damos para chamar a variavel (alterar valor, avaliar, etc)
        */

        System.out.println("Digite um numero"); // printa um texto tela

        // atribuicao - colocar um valor na variavel
        // nome da variavel =  valor a ser atribuido
        numero = sc.nextInt();
        
        // print
        System.out.println(numero);  // avaliacao
        int dobro; // declaracao
        // dobro recebe (atribuicao) 
        dobro = numero * 2;
                    // avaliacao da variavel numero * 2

                    // concatenacao do texto "O numero " com o valor da variavel
        System.out.println("O numero " + numero);
        System.out.println("Tem como dobro: " + dobro) ;

        System.out.println("O dobro do numero");
    }
}
