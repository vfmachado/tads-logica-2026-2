import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        float [][] m = new float[6][4];
        Random r = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i][0] = r.nextFloat(2000) + 5000; /// primeira semana algo entre 5 e 7 mil 
            m[i][1] = r.nextFloat(2000) + 3000;
            m[i][2] = r.nextFloat(2000) + 3000;
            m[i][3] = r.nextFloat(5000) + 4000;
        }

        for (int i = 0; i < m.length; i++) {
            float soma =  0;
            for (int j = 0; j < 4; j++) { 
                soma = soma + m[i][j];
                System.out.printf("%.1f\t", m[i][j]);
            }
            System.out.println(soma);
        }

        // somar colunas ao inves de linhas
        for (int j = 0; j < 4; j++) {
            float somaSemana = 0;
            for (int i = 0; i < m.length; i++) {
                somaSemana = somaSemana + m[i][j];
            }
            System.out.println("SEMANA " + j + " => " + somaSemana);
        }

        // mes com maior total de vendas
        float somaMaiorMes = 0;
        int maiorMes = 0;

        for (int i = 0; i < m.length; i++) {
            float somaMes = 0;
            for (int j = 0; j < m[0].length; j++) {
                somaMes = somaMes + m[i][j];
            }
            if (somaMes > somaMaiorMes) {
                somaMaiorMes = somaMes;
                maiorMes = i;
            }
        }

        System.out.println("MAIOR MES " + maiorMes);
    }
}
