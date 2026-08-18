import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        float n1, n2, media;
        Scanner in = new Scanner(System.in);

        // entrada
        System.out.println("Informe as notas");
        n1 = in.nextFloat();
        n2 = in.nextFloat();

        // processamento
        media = (n1 + n2) / 2;

        // saida
        System.out.println("MEDIA " + media);
        if (media >= 7) {
            System.out.println("aprovado");
        } else if (media > 3 /* && media < 7 */) {  // se esta no else automaticamente a media é menor que 7 pois este é o teste do if
            System.out.println("recuperacao");
        } else  {   // senao - é o complemento do if e NUNCA TEM CONDICAO
            System.out.println("reprovado");
        }

    }
}
