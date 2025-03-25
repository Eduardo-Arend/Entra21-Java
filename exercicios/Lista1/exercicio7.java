package Lista1;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String [] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o Seu salario atual: ");
        double salario = leitor.nextDouble();

        System.out.println("Digite a porcentagem de aumento: ");
        double aumento = leitor.nextDouble();

        leitor.close();
        double salarioAumentado = salario + (aumento * salario / 100);

        System.out.println("Seu salario com aumento é de: R$" + salarioAumentado);
        

    }
    
}
