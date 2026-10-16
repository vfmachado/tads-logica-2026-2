import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // leia 5 nomes de pessoas
        // qual foi o primeiro nome? segundo? ou o N nome?

        // array <=> vetor
        System.out.println("TEXTO");
        
        // DECLARACAO DE UM VETOR
        int [] valores;

        // INICIALIZAÇÃO
        valores = new int[10];  // tamanho 10

        int [] v2 = new int[10];    // tbm é um vetor de tamanho 10

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }

        // podemos acessar quaisquer um dos 10 valores digitados pela posicao
        for (int i = 0; i < valores.length; i++) {
            System.out.println("POSICAO " + i + " TEM O VALOR " + valores[i]);
        }

        int valor = 0;
        for (int i = 0; i < valores.length; i++) {
            valor = sc.nextInt();
        }
    
        System.out.println(valor);  // eu tenho ao acesso SOMENTE AO ULTIMO valor digitado

        // NAO EXISTE
        // valores = sc.nextInt(); atribuicao CONJUNTA de valores
        // ENTENDA cada posicao como uma variavel isolada

        

    }
}
