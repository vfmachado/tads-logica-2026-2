public class AproximacaoPI {
    public static void main(String[] args) {
        
        float numerador = 1;
        float denominador = 1;
        float soma = 0;

        for (int i = 0; i < 10000000; i++) {
            soma = soma + numerador / denominador;

            numerador *= -1;
            denominador += + 2;
     
        }
        
        soma *= 4;
        System.out.println(soma);



    }   
}
