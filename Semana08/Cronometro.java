import java.awt.Toolkit;
import java.util.Scanner;

public class Cronometro {
    public static void main(String[] args) throws Exception {
        
        // dado dois valores inteiros, minutos e segundos.
        // fazer um cronometro decrescente
        int minutos, segundos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe minutos e segundos do cronometro");
        minutos = sc.nextInt();
        segundos = sc.nextInt();

        for (int min = minutos; min >= 0; min--) {
            
            for (int seg = segundos; seg >= 0; seg--) {
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println(min + ":" + seg );


                if (seg <= 10 && minutos == 0) {
                    Toolkit.getDefaultToolkit().beep();
                }

                Thread.sleep(1000); // faz o programa esperar 1s

            }
            segundos = 59;
        }

        for (int i = 0; i < 5; i++) {
            Toolkit.getDefaultToolkit().beep();
            Thread.sleep(150);
        }        
    }
}
