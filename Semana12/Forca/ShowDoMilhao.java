import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class ShowDoMilhao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("200_perguntas_conhecimentos_gerais.txt"));
        String[] perguntas = new String[1200];

        // ref posicional
        // 0 -> pergunta
        // 1 até 4 -> alternativas
        // 5 -> resposta
        // 6 -> comeca a proxima pergunta

        int idx = 0;    // index
        while (sc.hasNextLine()) {
            perguntas[idx] = sc.nextLine();
            idx++;
        }
        System.out.println("linhas carregadas " + idx);

        int marco = 0;
        int [] marcos = {1000, 2000, 3000, 4000, 5000, 10000, 20000, 30000, 40000, 50000, 100_000, 200_000, 300_000, 400_000, 500_000, 1_000_000};

        Random random = new Random();
        int sequencia = 0; 
        sc = new Scanner(System.in);
        char [] alternativas = {'P', 'A', 'B', 'C', 'D'};

        while (true) {

            System.out.println("PERGUNTA VALENDO " + marcos[marco]);
            sequencia = sequencia + random.nextInt(14) + 1;

            int perguntaIdx = sequencia * 6;    // ja que ta tudo num vetor
            int respostaIdx = perguntaIdx + 5;
            int a = 0;
            for (int i = perguntaIdx; i < perguntaIdx+5; i++) {
                System.out.println(alternativas[a] + " - "+  perguntas[i]);
                a++;
            }

            System.out.print("RESPOSTA: ");
            char resposta = sc.next().toUpperCase().charAt(0); // A = 65
         
            if (perguntas[respostaIdx].charAt(0) == resposta) {
                System.out.println("CERTA RESPOSTA");
                marco++;
                if (marco >= marcos.length) {
                    System.out.println("VC ACABOU DE GANHAR 1.000.000 de edinhos");
                    break;
                }
            } else {
                System.out.println("VC PERDEU, RECEBE " + marcos[marco]/2);
                break;
            }
            
        }
    }
}
