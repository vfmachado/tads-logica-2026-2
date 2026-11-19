public class Ex26 {
    public static void main(String[] args) {
        
        /*
        Original:     Rotacionada:
        1 2 3         7 4 1
        4 5 6         8 5 2
        7 8 9         9 6 3
        */

        int [][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int [][] r = new int[3][3];

        /*
            posicoes da matriz ij
            00      01      02
            10      11      12
            20      21      22
        
            rotaciona
            20 -> 00       10 -> 01       00 -> 02
            21 -> 10       11 -> 11       01 -> 12
            22 -> 20       12 -> 21       02 -> 22
        */

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length; j++) {
             
                r[j][ 2 - i  ] = m[i][j];
                    // 2 = r.length -1 
            }
        }
        // i = 0, j = 0
        // r [ 0 ] [ 2 - 0 ]   =>   posicao 02
        //     j      

        // i = 2   j = 1
        // r [ 1 ]  [ 3-1-2]   -> posicao 10


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(r[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
