public class Ex18 {
    public static void main(String[] args) {

        /*
             *          1   
           * * *        3   
         * * * * *      5
       * * * * * * *    7    
        
        */

        int n = 5;
        int asteriscos = n * 2 - 1;


        /*
                    M
            * * * * # * * * *   linha 0
            * * * # # # * * *   linha 1
            * * # # # # # * *   linha 2
            * * * * # * * * * 
            * * * * # * * * * 
        */
        for (int linha = 0; linha < n; linha++) {
            for (int i = 1; i <= asteriscos; i++) {
                if (i == n) {
                    System.out.print("# ");
                } else if (n - i <= linha) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
                
            }
            System.out.println();
        }
    }
}
