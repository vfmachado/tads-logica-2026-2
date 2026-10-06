public class Ex07 {
    public static void main(String[] args) {
        
        final int LINHAS = 8;
        final int COLUNAS = 20;
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                if (i == 0 || j == 0 || i == LINHAS-1 || j == COLUNAS-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }        

    }
}
