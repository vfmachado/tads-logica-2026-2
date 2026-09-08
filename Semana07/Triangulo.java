public class Triangulo {
    public static void main(String[] args) {
        // FAÇA UM PROGRAMA QUE DESENHE UM TRIANGULO DE ASTERISCOS DE ACORDO COM UM NUMERO N DE LINHAS INFORMADO PELO USUARIO
        /*
            N = 3
            *
            * *
            * * *
        */
        // 1 linha - 1 asterisco
        System.out.print("*");  
        System.out.println();

        // 2 linhas - 2 asteriscos
        System.out.print("* ");
        System.out.print("* ");
        System.out.println();

        // 3 linhas - 3 asteriscos
        System.out.print("* ");
        System.out.print("* ");
        System.out.print("* ");
        System.out.println();

        System.out.print("* ");
        System.out.print("* ");
        System.out.print("* ");
        System.out.print("* ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        

        int linha = 1;
        while (linha <= 10) {    // PARA CADA LINHA

            // PRINTAR A QUANTIDADE DE ASTERISCOS DESSA LINHA
            int cont = 0;
            while (cont < linha) {
                System.out.print("* ");
                cont++;
            }
            System.out.println();
            linha++;
        }

        // precisa de um while dentro de outro while    

        // FACA UM PRORGRAMA QUE LEIA 2 VARIAVEIS (LINHAS E COLUNAS) E DESENHE UM RETANGULO
        // 3  5
        // * * * * * 
        // * * * * * 
        // * * * * * 
    }
}
