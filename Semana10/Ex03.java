public class Ex03 {
    public static void main(String[] args) {
        
        for (int i = 100; i < 1000; i++) {
            
            int unidade, dezena, centena;

            unidade = i % 10;
            centena = i / 100;
            dezena = (i / 10) % 10;

            if ( (centena + 1 == dezena && dezena +1 == unidade) || // crescentes
                 (centena - 1 == dezena && dezena -1 == unidade)
            ) {
                int produto = centena * dezena * unidade;
                System.out.printf("%d ->  %d * %d * %d = %d\n", i, centena, dezena, unidade, produto);
            }
        }

    }
}
