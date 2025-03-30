package Lista2;

import java.util.Scanner;

/*Escreva um algoritmo para ler um conjunto de quatro valores I, A, B, C, onde I é um valor inteiro e positivo e A, B, C, são quaisquer valores reais. A seguir: 

    a) Se I = 1 escrever os três valores A, B, C em ordem crescente.
    b) Se I = 2 escrever os três valores A, B, C em ordem decrescente. */

public class exercicio12 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nInforme o 1º valor :");
        int a = leitor.nextInt();

        System.out.print("\nInforme o 2º valor :");
        int b = leitor.nextInt();

        System.out.print("\nInforme o 3º valor :");
        int c = leitor.nextInt();

        System.out.print("Escolha a ordem:" + "\n1 = Crescente" + "\n2 = Decrescente");

        int i = leitor.nextInt();
        int menor, maior, meio;

        leitor.close();

        if (a >= b && a >= c) {
            maior = a;
            if (b >= c) {
                meio = b;
                menor = c;
            } else {
                meio = c;
                menor = b;
            }
        } else {
            if (b >= a && b >= c) {
                maior = b;
                if (a >= c) {
                    meio = a;
                    menor = c;

                } else {
                    meio = c;
                    menor = a;
                }

            } else {
                maior = c;
                if (a >= b) {
                    meio = a;
                    menor = b;

                } else {
                    meio = b;
                    menor = a;
                }
            }
        }

        switch (i) {
            case 1:
                System.out.println("Ordem Crescente: " + menor + ", " + meio + ", " + maior);
                break;

            case 2:
                System.out.println("Ordem Decrescente: " + maior + ", " + meio + ", " + menor);

                break;

            default:
                System.out.println("Valor invalido.");
                break;
        }
    }
}