package Lista3;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (true) {
    
        System.out.print("Digite o codigo do aluno:");
        int aluno = leitor.nextInt();
        if (aluno < 0) {
            System.out.println("Encerrando.");
            break;
        }

        System.out.print("Digite o valor da 1º nota:");
        double nota1 = leitor.nextDouble();
        System.out.print("Digite o valor da 2º nota:");
        double nota2 = leitor.nextDouble();
        System.out.print("Digite o valor da 3º nota:");
        double nota3 = leitor.nextDouble();

        double maior = nota1;
        if (nota2 > maior) maior = nota2;
        if (nota3 > maior) maior = nota3;

        double menor = nota1;
        if (nota2 < menor) menor = nota2;
        if (nota3 < menor) menor = nota3;
        
        double intermediaria;
        if ((nota1 != maior && nota1 != menor)) {
            intermediaria = nota1;
        } else if ((nota2 != maior && nota2 != menor)) {
            intermediaria = nota2;
        } else {
            intermediaria = nota3;
        }
         double ponderada = maior *4 + intermediaria * 3 + menor * 3;

        double media = nota1 + nota2 + nota3 / 3;

        System.out.println("Codigo Aluno: " + aluno);
        System.out.println("As 3 notas foram :" +"\n1º"+ nota1 +"\n2º"+ nota2 +"\n3º"+ nota3);
        System.out.println("Media Ponderada: "+ ponderada);
        if (media >= 50.0 ) {
            System.out.println("APROVADO!");
        }else{
            System.out.println("REPROVADO!");
        }
    }
    leitor.close();
    }
}