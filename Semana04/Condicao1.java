import java.util.Scanner;

public class Condicao1 {
    public static void main(String[] args) {
        
        /*
            Tudo que fizemos ate agora foi muito "reto".. uma linha depois da outra, sem mudancas no comportamento.

            mas existem cenarios que a gente precisa executar OU NAO determinado trecho de codigo.

        */

        // verificar se uma pessoa pode entrar em um local ou comprar bebida alcoolica dado a sua idade (+18)
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade");
        int idade = sc.nextInt(); 

        // se (valor logico) {}
        if (idade >= 18) {
            System.out.println("VOCE PODE COMPRAR BEBIDA ALC");
        }
        
        if (idade < 18) {
            System.out.println("APENAS BEBIDAS SEM ALCOOL");
        }

    }
}
