package Lista2;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o codigo de identificação do aluno:");
        int codigo = leitor.nextInt();

        System.out.print("Digite a primeira nota :");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda  nota :");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira noota :");
        double nota3 = leitor.nextDouble();

        leitor.close();

        double media = (nota1 + nota2 + nota3) / 3;

        double MA = (nota1 + nota2 * 2 + nota3 * 3 + media) / 7;

        if (MA >= 9.0) {
            System.out.printf("MA :" + MA + " A");
        }
        if (MA < 9.0 && MA >= 7.5) {
            System.out.printf("MA :" + MA + "B");
        }

        if (MA < 7.5 && MA >= 6.0) {
            System.out.printf("MA :" + MA + " C");
        }

        if (MA < 6.0 && MA >= 4.0) {
            System.out.printf("MA :" + MA + " D");
        }

        if (MA < 4) {
            System.out.printf("MA :" + MA+ " E");

        }

        System.out.printf("\nCodigo do Aluno :"+ codigo);
        System.out.printf("\nNotas do aluno:" + nota1, nota2, nota3);
        System.out.printf("\nMedia: "+ media);
    }
}
