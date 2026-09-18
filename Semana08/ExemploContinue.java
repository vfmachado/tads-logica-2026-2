import java.util.Scanner;

public class ExemploContinue {
    public static void main(String[] args) {
        
        // MEDIA DE 5 VALORES VALIDOS
        Scanner sc = new Scanner(System.in);
        float media = 0;
        int quantidade = 0;

        while (quantidade < 5) {
            System.out.println("informe um valor");
            float valor = sc.nextFloat();
            
            if (valor < 0) continue;    // VOLTA NO MOMENTO DO TESTE LOGICO DA REPETICAO

            media = media + valor;
            quantidade++;
        

        }



    }
}
