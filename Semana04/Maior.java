import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        // eh um programa que mostra qual o maior numero, no caso de serem iguais, mostra que sao iguais

        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("informe 2 valores");
        a = sc.nextInt();
        b = sc.nextInt();

        // // se isto acontecer
        // if ( a > b) { 
        //     System.out.println(a);
        // }
        
        // // nao existe possibilidade deste acontecer
        // if ( a < b) { 
        //     System.out.println(b);
        // }

        // // e esse tbm nao
        // if ( a == b) { 
        //     System.out.println("IGUAIS");
        // }

        // NAO PRECISO TESTAR UMA LOGICA QUE É EXATAMENTE OPOSTA A LOGICA ANTERIOR
        if ( a > b) { 
            System.out.println(a);
        } else { // senao
            // A <= B
            if (a < b) {
                System.out.println(b);
            } else {
                System.out.println("IGUAIS");
            }
        }

        // na maioria das linguagens as CHAVES determinam um bloco de codigo
        // if (valor) { bloco  }
        // quando o meu bloco contem dentro apenas uma instrucao OU um unico bloco, as chaves se tornam opcionais

        // apenas uma instrucao
        if (a > 5) System.out.println("A EH MAIOR QUE 5");

        if ( a > b) { 
            System.out.println(a);
        } else if (a < b) {
                System.out.println(b);
        } else {
            System.out.println("IGUAIS");
        }
        

        // C
        /*
            if () {
            }
            else {
            }
        
            O QUE NAO EXISTE EM NENHUMA DE LINGUAGEM É UM ELSE "SOLTO" .. QUE NAO ESTEJA COLADO EM UM IF
        */


    }
}
