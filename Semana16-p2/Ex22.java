import java.util.Random;

public class Ex22 {
    public static void main(String[] args) {
        /*
        Troca de linhas, colunas e diagonais
Preencha uma matriz M de inteiros 10 x 10 com valores aleatórios entre 0 e 99 e apresente-a.

Realize as trocas abaixo, nesta ordem, apresentando a matriz após cada uma delas:

A segunda linha pela oitava linha.
A quarta coluna pela décima coluna.
A diagonal principal pela diagonal secundária, ou seja, em cada linha, o elemento da diagonal principal troca de lugar com o elemento da diagonal secundária.
        */

        int N = 10;
        int [][] m = new int[N][N];
        Random aleatorio = new Random();

        // preenchimento com valores aleatorios
        for (int i = 0; i < N; i++) { // linhas
            for (int j = 0; j < N; j++) { // colunas
                m[i][j] = aleatorio.nextInt(100);
            }
        }

        // saida - mostra a matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        
        // trocaremos a linha 0 com a linha 9
        for (int j = 0; j < m.length; j++) {
            int a = m[0][j];
            int b = m[9][j];

            m[9][j]  = a;
            m[0][j] = b;
        }
        
         // saida - mostra a matriz
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
    }
}
