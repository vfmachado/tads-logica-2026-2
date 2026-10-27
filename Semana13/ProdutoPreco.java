import java.util.Scanner;

public class ProdutoPreco {
    public static void main(String[] args) {
        
        String [] produtos = {
            "Hamburguer da Casa",
            "Duplo Cheddar",
            "Hamburguer Vegano",
            "Batata frita",
            "Refrigerante",
            "Cerveja"

        };

        float [] precos = {
            25.90f,
            34.90f,
            29.90f,
            14.90f,
            7.90f,
            16.90f
        };

        String pedido = "";
        float total = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("informe a quantidade e o numero do item");
            int quantidade = sc.nextInt();
            int opcao = sc.nextInt();

            if (opcao < 0 || opcao > produtos.length) break;
            if (quantidade <= 0) break;

            total = total + precos[opcao] * quantidade;
            pedido = pedido + quantidade + " x " + produtos[opcao] + "\n";
            
        } while(true);
 
        System.out.println(pedido);
        System.out.println("TOTAL " + total);


    }
}
