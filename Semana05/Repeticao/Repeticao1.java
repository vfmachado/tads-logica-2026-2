public class Repeticao1 {
    public static void main(String[] args) {
        

        // enquanto
        /*
        enquanto (valor logico) {
            // bloco que sera repetido
        }
        */
        int contador = 0;
        // o valor logico comece inicialmente true, mas em algum momento se torne false para PARAR o meu laco de repeticao
        while (contador < 10) {
            System.out.println("JAVAAAAA " + contador);
            contador = contador + 1;     // contador recebe o valor que tem + 1
        }
        System.out.println("SEGUE EXECUTANDO AQUI");
        System.out.println("CONTADOR FORA DO LACO " + contador);

        // EX 1. COMECE O CONTADOR COM 10 E FAÇA MOSTRAR OS VALORES EM ORDEM DECRESCENTE ATÉ 0
        int c = 10;
        while (c >= 0) {
            System.out.println(c);
            c--;    // c = c - 1;       i++;    i = i + 1;  
        }

        // EX 2. COMECE O CONTADOR EM 0 E MOSTRE ATÉ UM VALOR N ESCOLHIDO PELO USUARIO

        // EX 3. RECEBA DOIS VALORES DO USUARIO A E B E MOSTRE OS VALORES DE A ATÉ B, CONSIDERE A < B

        // EX 4. RECEBA 10 VALORES DO USUARIO (DENTRO DO WHILE) E CONTE QUANTOS SÁO MAIORES OU IGUAIS A 7

        // EX 5. CALCULE O SOMATORIO DO INTERVALO [X, Y] ONDE X E Y SAO INFORMADOS PELO USUARIO

        // EX 6. FAÇA UM PROGRAMA QUE SOLCIITE A SENHA CERTA (USE INT) ATÉ QUE O USUARIO ACERTE

        // EX 7. FAÇA UM PROGRAMA QUE LEIA 10 VALORES E CONTE QUANTOS SAO PARES E QUANTOS SAO IMPARES

        // EX 8. FACA UM PROGRAMA QUE MOSTRE TODOS OS DIVISORES DE UM NUMERO
    }
}