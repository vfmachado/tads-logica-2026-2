import java.util.Scanner;

public class Recapitulacao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // repeticao determinada
        int cont = 1;
        while (cont < 10) {
            System.out.println(cont);
            cont++; // incrementar
        }

        // repeticao inderteminada - nao sei quantas vezes vai executar
        int op = 0;
        while (op != -1) {
            System.out.println("Digite um número (-1 para sair): ");
            op = sc.nextInt();
        }

        /*
            for (1 ; 2 ; 4) {   // depois do 4 volta para o 2
                3
            }
        */
        for (int i = 0; i < 10; i++) {
            System.out.println("logica com i " + i);   
        }

        int a = 10;
        for ( ; a > 0; a--) {
            System.out.println("logica com a " + a);
        }
        

        // DEFEITO É FORÇAR UM VALOR INICIAL PARA OP2 SEM NENHUMA SEMANTICA ASSOCIADA
        // a solucao é utilizar um do .. while

        // DO .. WHILE GARANTE A EXECUÇÃO DO BLOCO PELO MENOS UMA VEZ, POIS A CONDIÇÃO É VERIFICADA APÓS A EXECUÇÃO DO BLOCO
        int op2;    
        do {
            System.out.println("Digite um número (-1 para sair): ");
            op2 = sc.nextInt();
        } while (op2 != -1);
    

        sc.close();
    }
}
