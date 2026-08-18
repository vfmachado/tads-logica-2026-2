import java.util.Scanner;

public class PodeDirigir {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe sua e idade");
        int idade = in.nextInt();
        boolean temCarteira;

        if (idade >= 18) {
            System.out.println("Verificando se tem carteira");
            System.out.println("Tem? (true/false");
            temCarteira = in.nextBoolean();

            if (temCarteira) {
                System.out.println("Maior e habilidato");
            } else {
                System.out.println("Nao habilitado");
            }

        } else {
            System.out.println("Nao tem idade minima");
        }

    }
}
