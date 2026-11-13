public class ValidandoLinhas {
    public static void main(String[] args) {
        
        int [][] m = {
            {1, 0, 0, -1},
            {1, 0, 1, 0},
            {-1, 0, 0, 1, 1, 0},
            {1, 1, 0},
            {1, 0, 0, -1}
        };

        // FAÇA UM PROGRAMA QUE INDIQUE QUAIS LINHAS DA MATRIZ NAO TEM VALORES NEGATIVOS

        // m.length = quantidade de linhas
        // m[i].length = tamanho daquela linha
        for (int i = 0; i < m.length; i++) {
            
            boolean valida = true;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0) valida = false;
            }

            if (valida) {
                System.out.println("LINHA VALIDA " + i);
            }
        }

        // FAÇA UM PROGRAMA QUE INDIQUE QUAIS LINHAS DE UMA MATRIZ SAO IGUAIS
        for (int lin1 = 0; lin1 < m.length; lin1++) {
            for (int lin2 = lin1+1; lin2 < m.length; lin2++) {
                System.out.println("A IDEIA EH COMPARAR A " + lin1 + " COM A " + lin2);
                int [] v1 = m[lin1];
                int [] v2 = m[lin2];

                if (v1.length != v2.length) continue;

                System.out.println("TAMANHOS IGUAIS VOU COMPARAR...");
                boolean iguais = true;
                for (int i = 0; i < v1.length; i++) {
                    if (v1[i] != v2[i]) iguais = false;
                }
                if (iguais) {
                    System.out.println("\t ==> SAO IGUAIS");
                }
            }
        }
    }
}
