public class Ex05 {
    public static void main(String[] args) {
        
        float numerador = 1;
        float denominador = 1;
        float soma = 1;

        int n = 7;
        int i = 1;
        while(i <= n) {

            denominador = denominador * i;
            soma = soma + numerador/denominador;

            System.out.println(numerador);
            System.out.println(denominador);
            System.out.println("SOMA PARCIAL " + soma);
            System.out.println();
            
            i++;
        }

        System.out.println("E = " + soma);

    }
}
