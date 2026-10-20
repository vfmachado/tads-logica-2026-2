import java.util.Scanner;

public class Ex01 {
    // Lista 05 - ex 3, 4 e 5
    public static void main(String[] args) {
        // ler um vetor de 10 posicoes
        // 3. calcular a soma do elementos
        // 4. media do elementos
        // 5. contagem de pares e impares

        Scanner sc = new Scanner(System.in);

        float [] valores;   // uma variavel que cabem varios valores
        valores = new float[10];    // 10 floats acessando os valores pela posicao [i]

        // AS POSICOES SAO SEMPRE ACESSADAS INDIVIDUALMENTE, POR ISSO PRECISA DE LAÇO DE REPETICAO PARA ITERAR SOBRE AS POSICOES DO VETOR
        // leitura
        for (int i = 0; i < valores.length; i++) {
            valores[i]  = sc.nextFloat();
        }

        float soma = 0;
        int pares = 0;
        int impares = 0;
        // soma dos elementos
        for (int i = 0; i < valores.length; i++) {
            soma = soma + valores[i];

            // valores na posicao i 
            if (valores[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        float media = soma / valores.length;
        
        System.out.println("SOMA " + soma);
        System.out.println("MEDIA " + media);
        System.out.println("PARES " + pares);
        System.out.println("IMPARES " + impares);
        
    }
}