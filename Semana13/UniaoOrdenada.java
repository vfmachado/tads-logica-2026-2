public class UniaoOrdenada {
    
    // DADO DOIS VETORES ORDENADOS
    // CRIAR UM UNICO VETOR ORDENADO

    /*
        v1 = [1, 4, 6];
        v2 = [2, 4, 5];

        saida = [1, 2, 4, 4, 5, 6];

        regras:
            NAO PODE TER FOR DENTRO DE FOR
            NAO PODE ORDENAR O VETOR RESULTANTE DEPOIS
    */

    public static void main(String[] args) {
        
        int [] v1 = {1, 2, 6};
        int [] v2 = {3, 4, 5};

        int [] res = new int[v1.length + v2.length];

        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < res.length; i++) {

            if (p1 == v1.length) {
                res[i] = v2[p2];
                p2++;
            } else if (p2 == v2.length) {
                res[i] = v1[p1];
                p1++;
            } else if (v1[p1] < v2[p2]) {
                res[i] = v1[p1];
                p1++;
            } else {
                res[i] = v2[p2];
                p2++;
            }

            System.out.println("p1 = " + p1);
            System.out.println("p2 = " + p2);
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[j] + "  ");
            }
            System.out.println("\n");
        }


    }

}
