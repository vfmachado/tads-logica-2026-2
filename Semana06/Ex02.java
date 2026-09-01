public class Ex02 {
    public static void main(String[] args) {
        
        // os candidatos a divisores sao todos os numeros 1 ... n
        int n = 120;

        // mostrar todos os canditados
        int candidato = 1;
        while (candidato <= n) {        // n >= candidato
            // System.out.println("Candidato "  + candidato);

            // candidato é um divisor de N ? se sim... diz
            
            // 7 % 4 => 3  7/4 da 1 e sobra 3
            // se um numero é divsivel por 4, n % 4 == 0
            int resto = n % candidato;
            if (resto == 0) {
                System.out.println(candidato);
            }

            candidato++;
        }

    }
}
