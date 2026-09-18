import java.util.Scanner;

public class ExemploBreak3 {
    public static void main(String[] args) {
        // USUARIO DIGITA N VALORES E  UM VALOR NEGATIVO PARA PARAR 
        Scanner sc = new Scanner(System.in);
        float media = 0;
        int quantidade = 0;
        float valor;

        while (true) {
            valor = sc.nextFloat();

            if (valor < 0) break;    // testa primeiro

            // logica depois
            media = media + valor;
            quantidade++;
        
        }


    }
}
