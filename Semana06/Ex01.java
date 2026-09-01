public class Ex01 {
    public static void main(String[] args) {
        
        int cont = 1; // INICIALIZACAO - variavel que sera utilizada no controle do laco de repeticao.

        // WHILE = ENQUANTO
        // A CONDICAO DEVE SER INICIALMENTE VERDADEIRA (TRUE)
        // LEIAM A EXP LOGICA COMO UMA PERGUNTA .... RESPOSTA: TRUE / FALSE
        while (cont <= 10) {
            // BLOCO DE CODIGO
            System.out.println(cont);

            // ALGUMA INSTRUCAO QUE TORNE A EXPRESSAO LOGICA FALSE EM ALGUM MOMENTO
            cont = cont + 1;    // cont++
        }

        int n = 12;
        int mult = 1;
        int res;

        while (mult <= 10) {
            res = mult * n;
            System.out.println(mult + " x " + n + " = " + res);
            mult++; // mult = mult + 1;
        }
  
    }
}