/*
Leia:
salário mensal;
valor solicitado de empréstimo;
quantidade de parcelas.
Nenhum valor pode ser zero ou negativo. Se os dados forem válidos, calcule o valor da parcela.

O empréstimo será aprovado somente se:
a parcela não ultrapassar 30% do salário;
o valor solicitado não ultrapassar 10 vezes o salário.
Informe o motivo da reprovação quando alguma condição não for atendida.
*/

import java.util.Scanner;

public class L02Ex21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float salario, valorEmprestimo, valorParcela;
        int quantidadeParcelas;
        String saida;

        System.out.println("TEXTO BLA BLA BLA");

        // entrada
        salario = sc.nextFloat();
        valorEmprestimo = sc.nextFloat();
        quantidadeParcelas = sc.nextInt();


        if (salario <= 0 ||  valorEmprestimo <= 0 || quantidadeParcelas <= 0) {
            saida = "Entrada invalida";
        } else {

            valorParcela = valorEmprestimo / quantidadeParcelas;
            // System.out.println("VALOR PARCELA " + valorParcela);

            if (valorParcela > 0.3f * salario) {
                saida = "Valor da parcela ultrapassa 30% do salario";
            } else if (valorEmprestimo > 10 * salario) {
                saida = "Valor do emprestimo é alto demais";
            } else {
                saida = "Emprestimo aprovado";
            }
        }

        System.out.println(saida);
    }
}
