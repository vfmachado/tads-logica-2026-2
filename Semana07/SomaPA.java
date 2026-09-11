public class SomaPA {
    public static void main(String[] args) {
        
        int soma = 0;
        int inicial = 0;
        int razao = 2;

        // laço que repete 10x
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " => " + inicial);
            soma = soma + inicial;  // soma esta aqui e nao embaixo?
            inicial = inicial + razao;
        }

        System.out.println(soma);

    }
}
