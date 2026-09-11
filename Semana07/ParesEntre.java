public class ParesEntre {
    public static void main(String[] args) {
        
        int N = 10;

        System.out.println("Pares entre 1 " + N);

        int i = 0;
        String saida = "";

        while (i <= N) {

            if (i % 2 == 0) {
                // System.out.println(i);
                saida = saida + " " + i;
            }
            i++;
        }

        System.out.println(saida);
    }
}
