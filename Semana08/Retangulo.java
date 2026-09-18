import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        
        // dado dois valores x e y inteiros e, um tercerio valor boolean (preenchido/vazado)
        // desenhar um retangulo de asteriscos com x linhas e y colunas, preenchido ou vazado de acordo com a variavel boolean
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("informe x e y");
        x = sc.nextInt();
        y = sc.nextInt();
        
        // para cada linha
        for (int lin = 0; lin < x; lin++) {
            // desenha todas as colunas
            for (int col = 0; col < y; col++) {
                // como deixar vazado? na borda desenha o asterisco
                if (col == 0 || col == y-1 || lin == 0 || lin == x-1) {
                    System.out.print("* ");

                    // fora da borda um espaco
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
