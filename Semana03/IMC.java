import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float altura, peso, imc;

        System.out.println("Informe sua altura");
        altura = sc.nextFloat();

        System.out.println("Informe seu peso");
        peso = sc.nextFloat();

        imc = peso / (altura * altura);
        System.out.printf("SEU \n\tIMC E: %.2f\n", imc);
        /*
            printf => print formatado
            nao tem quebra de linha no final

            \n => da uma quebra de linha no texto
            \t => tabulacao (tab)
            %f => para mostrar um float
            %d => para mostrar um inteiro
            %.2f => para mostrar um float com 2 casas
            
        */


    }
}
