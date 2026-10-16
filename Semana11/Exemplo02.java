import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // apenas C é um vetor
        int a, b, c [];

        // TODOS sao vetores
        int [] d, e, f;

        // COLOCAR E MOSTRAR OS NOMES NO VETOR
        // EU QUERO SER CAPAZ DE PERGUNTAR 
        //  - QUAL O NOME DE UMA POSICAO
        //  - QUAL A POSICAO DE UM NOME

        String nomes [] = new String[10];
        // String [] nomes  = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            // NOMES NA POSICAO I RECEBE O VALOR LIDO PELO SCANNER
            nomes[i] = sc.next();
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(i + " -> " + nomes[i]);
        }

        while (true) {
            System.out.println("Informe uma posicao");
            int posicao = sc.nextInt();
            if (posicao < 0 || posicao > nomes.length-1) break;
            System.out.println("Na posicao " + posicao + " tem o nome " + nomes[posicao]);
        }

        while (true) {
            System.out.println("Informe um nome (sair para)");
            String procurado = sc.next();
            if (procurado.equals("sair")) break;
            
            int posicao = -1;
            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i].equals(procurado)) {
                    posicao = i;
                    break;
                }

            }
            if (posicao != -1)
                System.out.println("Na posicao " + posicao + " tem o nome " + nomes[posicao]);
            else
                System.out.println("NOME NAO ENCONTRADO");
        }

        // comparacao de texto é com texto1.equals(texto2)
    } 
}
