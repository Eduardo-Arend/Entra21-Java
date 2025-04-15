package Lista3;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int maiorIdade = Integer.MIN_VALUE;
        int ehFeminina = 0;
        int idade;
        String sexo;
        String olhos;
        String cabelo;

        while (true) {
            System.out.print("\nDigite uma Idade (Idade negativa para fechar o codigo) : ");
            idade = leitor.nextInt();
            if (idade < 0) {
                System.out.println("End ....");
                break;
            }

            if(idade > maiorIdade) maiorIdade = idade;

            System.out.print("\nDigite se é (M/F):");
            sexo = leitor.next().toLowerCase();

            System.out.print("\nCor dos Olhos:");
            olhos = leitor.next().toLowerCase();

            System.out.print("\nCor do cabelo:");
            cabelo = leitor.next().toLowerCase();

            if (sexo.equals("f") && olhos.equals("verde") && cabelo.equals("loiro")) { 
                if (idade >= 18 || idade <= 35) {
                    ehFeminina++; 
                }
            }
            System.out.print("\nMaior idade informada: " + maiorIdade);
            System.out.print("quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos e que tenham olhos verdes e cabelos loiros : "+ehFeminina);
        }
        leitor.close();
    }
}
