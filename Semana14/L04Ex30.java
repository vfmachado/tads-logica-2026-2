public class L04Ex30 {
    public static void main(String[] args) {
        int [] v1 = {2, 5, 8, 12, 20};
        int [] v2 = new int[v1.length+1];
        int valor = 10;
       
        int i = 0;
        for (int j = 0; j < v2.length; j++) {
            if (valor < v1[i] && j <= i) {
                v2[j] = valor;
            } else  {
                v2[j] = v1[i];
                i++;
            }
        }

        for (int j = 0; j < v2.length; j++) {
            System.out.print(v2[j] + "  ");  
        }
        System.out.println();


    }
}
