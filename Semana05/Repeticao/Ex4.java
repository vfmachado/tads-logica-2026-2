import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor, qtd = 0;

        int cont = 0;
        while (cont < 10) {
            System.out.println("informe um valor");
            valor = sc.nextInt();
            if (valor >= 7) {
                qtd = qtd + 1;  // qtd++;
            }
            cont++;
        }

        // cont = 10 , condicao false, encerra o laco
        System.out.println("QUANTIDADE >=7 : " + qtd);
    }
}
