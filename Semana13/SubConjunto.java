public class SubConjunto {
    public static void main(String[] args) {
        
        int [] v1 = { 2, 1, 3};
        int [] v2 = { 2, 3, 4, 5, 1};

        int cont = 0;

        // para cada posicao de v1
        for (int i = 0; i < v1.length; i++) {
            // para cada posicao de v2
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    cont++;
                    break;
                }
            }
        }

        if (cont == v1.length) {
            System.out.println("V1 é subconjunto de v2");
        } else {
            System.out.println("V1 nao eh subconjunto de v2");
        }

    }
}