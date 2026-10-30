public class TrianguloPascal {
    public static void main(String[] args) {
        
        // mostrar N andares de uma torre com o seguinte padrao
        /*
            1 1
            1 2 1       (1 + 1) = 2
            1 3 3 1     (1 + 2) = 3  (2 + 1) = 3
            1 4 6  4  1
            1 5 10 10 5 1
        
        */

        int [] v = {1};

        for (int n = 0; n < 10; n++) {
            int [] prox = new int[v.length + 1];
            prox[0] = 1;
            prox[prox.length -1] = 1;

            for (int i = 1; i < prox.length-1; i++) {
                prox[i] = v[i] + v[i-1];
            }
            
            for (int i = 0; i < prox.length; i++) {
                System.out.print(prox[i] + " ");
            }
            System.out.println();
            v = prox;
        }
    }
}
