import java.util.Scanner;

public class ExemploBreak2 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("MAIOR NOTA DA PROVA");
        
        float maior = 0;

        for (int i = 0; i < 10; i++) {
            float nota = sc.nextFloat();
            if (nota > maior) {
                System.out.println("SUBSTIUI A MAIOR");
                maior = nota;
            }  
            
            if (maior == 10) break;
        }

        System.out.println("MAIOR " + maior);


    }
}
