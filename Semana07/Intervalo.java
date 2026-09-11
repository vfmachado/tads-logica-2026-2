import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Digite x, y");
        x = sc.nextInt();
        y = sc.nextInt();

        // enquanto
        // int cont = x;
        // while (cont <= y) {
        //     System.out.println(cont);
        //     cont++;
        // }

        int soma = 0; // somas comecam com 0
        // outra estrutura de repeticao
        // para (for)
        //    inicio    boolean   passo
        //              condicao  incremento 
        for (int i = x; i <= y; i++) {
            System.out.println(i);
            soma = soma + i;
        }
        System.out.println("SOMA DO INTERVALO " + soma);
        

    }
}
