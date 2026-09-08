import java.util.Scanner;

public class ExN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SAIDA DE TEXTO");
        int inteiro = sc.nextInt();
        String texto = sc.next();   // uma palavra
        float decimal = sc.nextFloat();

        System.out.println(inteiro); // saida de variavel

        if (inteiro == 10) { /*bloco*/}
        if (texto.equals("SIM")) { /*bloco*/}
        
        if (decimal >= 7.4f) {
            System.out.printf("%.2f\n", decimal);
        } else { // else nao tem condicao

        }
    }
}
