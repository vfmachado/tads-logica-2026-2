import java.io.File;
import java.util.Scanner;

public class Idioma {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(new File("config.txt"));

        String linha = sc.nextLine();
        String idioma = linha.split("=")[1];

        System.out.println("IDIOMA CARREGADO");
        System.out.println(idioma);

        String fala1 = "BEM VINDO AO IFRS";

        if (idioma.equals("PT")) {

        } else if (idioma.equals("EN")) {
            fala1 = "WELCOME TO IFRS";
        }

        System.out.println(fala1);

    }
}
