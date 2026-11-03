public class Sort {
    public static void main(String[] args) {
        int [] v = { 2, 5, 3, 1, 7, 4};
        
        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < v.length; j++) {
                if (v[j] < v[i]) {
                    int a = v[i];
                    v[i] = v[j];
                    v[j] = a;
                }
            }
        }

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "  ");  
        }
        System.out.println();

    }
}
