package Lista5;
 import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o salario fixo do funcionario: ");
        float salarioFixo = leitor.nextFloat();

        System.out.print("Digite a quantidade de caroos vendido por esse funcionario: ");
        int quantCarros = leitor.nextInt();

        System.out.print("Valor de comissão por carro vendido: ");
        float comissao = leitor.nextFloat();

        System.out.println("Valor total das vendas: ");
        float vendasTotal = leitor.nextFloat();

        float resulado = salarioFinal(salarioFixo, quantCarros, comissao, vendasTotal);
        System.out.print("Salario Final: " + resulado);
        
        leitor.close();
    }

    public static float salarioFinal(float salarioFixo, int quantCarros, float comissao, float vendasTotal){

        
        float resulado = quantCarros *comissao + vendasTotal*5 + salarioFixo;



        return resulado;

    }
}
