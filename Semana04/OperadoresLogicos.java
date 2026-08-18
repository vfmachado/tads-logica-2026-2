public class OperadoresLogicos {
    public static void main(String[] args) {
        /*
            instrucao / algoritmo
            variavel
            tipos de dados
            scanner
            print
            operadores arimeticos (+ - * / %)
        */

        int valorInteiro; // -2.15b +2.15
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        
        // Float.MIN_VALUE ... Double.MIN_VALUE
        /*
            os tipos primitivos sao os tipos de dados mais basicos que temos em qualquer linguagem, eles ocupam só a memoria necessaria para guardar o seu valor

            Integer, Float, Double, ou qualquer outro em java que comeca com letra maiuscula significa que estou instanciando (criando) uma variavel NAO PRIMITIVA, literalmente uma instancia de uma Classe

            Se eu posso usar o tipo primitivo, eu uso APENAS o tipo primitivo.

        */

        int a, b;
        a = 17;
        b = 4;
        
        // a operacao entre dois valores inteiros retorna um valor inteiro
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.printf("DIVISAO %d / %d = %d\n", a, b, divisao );
        float divFloat = a / b; // tbm deve ser 4  - primeiro acontece a divisao e depois a associacao
        // cast - forcar um tipo
        divFloat = (float) a / b; // divisao entre float e inteiro e o resultado vai FLOAT
                                    // primeiro o a é convertido (cast acontece antes das outras operacoes) 
        System.out.printf("DIVISAO %d / %d = %f\n", a, b, divFloat );
        
        // SEGUNDO COJUNTO DE OPERACOES
        // OPERACOES RELACIONAIS OU LOGICOS
        /*
            &&  E 
            ||  OU
            !=  DIFERENTE
            ==  IGUAL
            >
            >=
            <
            <=

            
            SEMPRE LEIAM OS OPERADORES LOGICOS COMO SE FOSSE UMA PERGUNTA. SEMPRE EXISTE UM RESULTADO TRUE / FALSE
            
            !   NAO
            
        */

        boolean resultado;
        a = 5;
        b = 3;

        resultado = a > b;  // true
        System.out.println("RESULTADO A > B = " + resultado);

        resultado = a == b; // sao necessarios dois iguais para comparar
        System.out.println("RESULTADO A == B = " + resultado);

        resultado = a != b;
        System.out.println("RESULTADO A != B = " + resultado);


    }    
}
