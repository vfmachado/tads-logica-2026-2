public class Revisao {

    public static void main(String[] args) {
        
        int [] v = { 2, 5, 3, 1, 7, 4};
        
        // MOSTRAR O VETOR
        // ENTENDER A DIFERENCA DE POSICAO E VALOR
        // ORDENACAO
        // CONTAR ELEMENTOS
            // PARES, MULTIPLOS, MAIOR, MENOR, ETC
        // PROCURAR E INFORMAR EM QUAIS POSICOES APARECEM
        // BUSCAR DOIS ELEMENTOS QUE SOMADOS RESULTEM UM VALOR N
        // SOMATORIOS  / MEDIA / MEDIANA /  DESVIO PADRAO / SEQUENCIAS
        // CRIACAO DINAMICA DE VETORES (DETERMINANDO O TAMANHO EM TEMPO DE EXECUCAO)
            // COPIAR OS VALORES DE UM VETOR PARA O OUTRO
        // SUBCONJUNTO, UNIAO, INTERSECCAO
        // IDENTIFICAR REPETICOES NO VETOR

        int [] v1 = { 2, 5, 3, 1, 7, 4};
        int [] v2 = new int[v1.length + 5];

        // v1 = v2;     // TROCANDO O PONTEIRO DE V1 PARA V2
        
        // copia de v1 para v2
        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[i];   
        }
        v1 = v2;
    }

}
