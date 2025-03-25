package Lista1;

import java.util.Scanner;

public class exercicio10 {

    public static void main (String [] args){
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o valor de carros vendidos pelo funcionário: ");
        int carrosVendidos = leitor.nextInt();

        System.out.println("Informe o valor total das vendas do funcionário: ");
        double valorVendas = leitor.nextDouble();

        System.out.println("Informe o valor do salario fixo do funcionario: ");
        double salario = leitor.nextDouble();
        
        System.out.println("Informe o valor da comissão do funcionário: ");
        double comissao = leitor.nextInt();

        double bonus = 5 * valorVendas;
        double salarioFinal = salario + (comissao * carrosVendidos) + bonus;

        System.out.println("O salário final do funcionário é: " + salarioFinal);



        leitor.close();
    }

}
