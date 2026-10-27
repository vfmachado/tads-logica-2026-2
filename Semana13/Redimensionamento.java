import java.util.Scanner;

public class Redimensionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] v1 = new int[5];

        while (true) {
            System.out.println("""
                1. VER VETOR
                2. REDIMENSIONAR
                3. COLOCAR VALOR EM POSICAO
                4. SAIR
            """);

            int opcao = sc.nextInt();
            if (opcao == 4) break;

            switch (opcao) {
                case 1:
                    // MOSTRAR O VETOR
                    System.out.print("[");
                    for (int i = 0; i < v1.length; i++) {
                        System.out.print(v1[i]);
                        if (i < v1.length-1) System.out.print(", ");
                    }
                    System.out.println("]");
                    break;
                case 2:
                    // REDIMENSIONAR O VETOR MANTENDO OS VALORES ATUAIS
                    int tamanho = sc.nextInt();
                    int [] v2 = new int[tamanho];

                    // copia os valores de v1 para v2
                    for (int i = 0; i < v1.length && i < v2.length; i++) {
                        v2[i] = v1[i];
                    }

                    // troca o ponteiro de v1 para v2
                    v1 = v2;
                    break;
                case 3:
                    // PERGUNTAR A POSICAO E O VALOR E COLOCAR NO VETOR
                    int posicao = sc.nextInt();
                    if (posicao < 0 || posicao > v1.length-1) {
                        System.out.println("Posicao invalida"); continue;
                    }
                    int valor = sc.nextInt();
                    v1[posicao] = valor;
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
            }
        }

    }
}
