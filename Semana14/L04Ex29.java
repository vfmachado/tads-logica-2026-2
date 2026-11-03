public class L04Ex29 {
    public static void main(String[] args) {

        // BUBBLE SORT
        int [] v = { 2, 5, 3, 1, 7, 4};
        while (true) {
            int trocas = 0;
            for (int i = 0; i < v.length -1; i++) {
                // comaparar i com i+1
                if (v[i+1] < v[i]) {
                    int a = v[i];
                    v[i] = v[i+1];
                    v[i+1] = a;
                    trocas++;
                }
            }

            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "  ");  
            }
            System.out.println();

            if (trocas == 0) break;
        }
    }
}
