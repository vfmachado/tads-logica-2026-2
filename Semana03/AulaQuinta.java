// tem que importar para poder utilizar o Scanner
// necessario para input de dados do usuario
import java.util.Scanner;

// public class NomeDoArquivo igualzinho, letra maiuscula no incio.
// PRECISA PARA O JAVA ENTENDER A ESTRUTURA DO ARQUIVO
public class AulaQuinta {   // CHAVES DELIMITAM UM ESCOPO / PEDACO

    // main => principal onde  o MEU codigo será escrito
    public static void main(String[] args) {    // ASSINATURA DO METODO PRINCIPAL DO JAVA (ENTRY POINT)
        
        // DECLARACAO E INSTANCIACAO (CRIACAO DO SCANNER)
        // sc é o nome da variavel do tipo Scanner.
        // System.in -> entrada padrao, teclado e terminal
        Scanner sc = new Scanner(System.in);

        // DADO AS DIMENSOES DE UMA QUADRA RETANGULAR, LARGURA E ALTURA.
        // CALCULAR A AREA E O PERIMETRO DESTA QUADRA.

        // supondo que quero preencher toda a quadra com grama, e a grama é vendida em um tamanho quadrado NxN (é informado o lado para o usuario), com um valor por pedaco.
        // quantos pedaços de grama preciso comprar e qual o valor total?
        float largura, altura;
        float area, perimetro;
        float ladoG, torrao, quantTorroes, precoUnit, total;
        
        // entrada
        System.out.println("informe largura e altura da quadra");
        largura = sc.nextFloat();
        altura = sc.nextFloat();

        System.out.println("Informe o lado do peadaco de grama e o valor");
        ladoG = sc.nextFloat();
        precoUnit = sc.nextFloat();

        // processamento = LÓGICA!!!
        area = largura * altura;
        perimetro = 2 * (altura + largura);

        torrao = ladoG * ladoG;
        quantTorroes = area / torrao;

        total = quantTorroes * precoUnit;

        // saida
        //                               + => serve para concatenar (juntar)
        //                  texto          valor da variavel
        System.out.println("AREA TOTAL ......................: " + area);
        System.out.println("PERIMETRO TOTAL .................: " + perimetro);
        System.out.println("AREA DE COBERTURA DE CADA TORRAO.: " + torrao);
        System.out.println("QUANTIDADE  DE TORROES ..........: " + quantTorroes);
        System.out.println("VALOR TOTAL .....................: " + total);

        sc.close();
    }
}
