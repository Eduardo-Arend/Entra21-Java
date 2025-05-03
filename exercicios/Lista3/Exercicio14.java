package Lista3;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int totalPessoas = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int idade = 0;
        int mulheresSalarioAbaixo = 0;
        double salario = 0;
        double somaSalario = 0;
        String sexo;

        while (true) {
        System.out.print("Digite a idade (negativa para sair): ");
            idade = leitor.nextInt();
            if (idade < 0) break;

            System.out.print("Digite o sexo (m/f): ");
            sexo = leitor.next().toLowerCase();

            System.out.print("Digite o salário: ");
            salario = leitor.nextDouble();

            somaSalario += salario;
            totalPessoas++;

            if(idade > maiorIdade) maiorIdade = idade;
            if(idade < menorIdade) menorIdade = idade;

            if (sexo.equals("f") && salario <= 100.0) {
                mulheresSalarioAbaixo++;
            }
        }
        if (totalPessoas > 0) {
            double mediaSalario = somaSalario / totalPessoas;
        System.out.printf("Média de salário: R$ %.2f\n", mediaSalario);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("   Menor idade: " + menorIdade);
        System.out.println("Mulheres com salário até R$ 100,00: " + mulheresSalarioAbaixo);
            
        }else{
            System.out.println("Nenhum dado foi inserido.");
        }   
        leitor.close();
    }
}
