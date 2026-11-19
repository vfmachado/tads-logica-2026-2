import java.util.Random;

public class Ex06 {
    public static void main(String[] args) {
        
        int N = 4;
        int [][] m = new int[N][N];
        Random aleatorio = new Random();

        // preenchimento com valores aleatorios
        for (int i = 0; i < N; i++) { // linhas
            for (int j = 0; j < N; j++) { // colunas
                m[i][j] = aleatorio.nextInt(31) - 10;    // -10 e 20
            }
        }

        // Determine e apresente:
        // A quantidade de valores maiores que 10.
        // A quantidade de valores pares e de valores ímpares.
        // A quantidade de valores negativos.

        int maior10 = 0;
        int pares = 0;
        int impares = 0;
        int negativos = 0;
        for (int i = 0; i < N; i++) { // linhas
            for (int j = 0; j < N; j++) { // colunas
                if (m[i][j] > 10) maior10++;

                if (m[i][j] % 2 == 0) pares++;
                else impares++;

                if (m[i][j] < 0) negativos++;
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
        System.out.println("maior10 = " + maior10);
        System.out.println("pares = " + pares);
        System.out.println("impares = " + impares);
        System.out.println("negativos = " + negativos);
    }
}
