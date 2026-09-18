import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class SalvaSenha {
    public static void main(String[] args) throws Exception  {
        
        Scanner sc = new Scanner(System.in);
        Scanner arq = new Scanner(new File("./senha.txt"));

        String senha = arq.next();
        if (senha.equals("NAO_CADASTRADA")) {
            System.out.println("SENHA NAO CADASTRADA");
            System.out.println("informe uma senha");
            String digitado = sc.next();
            
            FileWriter myWriter = new FileWriter("./senha.txt");
            myWriter.write(digitado);
            myWriter.close();  // must close manually
        } else {
            System.out.println("SENHA CARREGADA " + senha);
        }


    }
}
