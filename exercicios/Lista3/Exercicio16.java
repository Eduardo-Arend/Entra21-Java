package Lista3;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a Numero do termo: ");
        int n = leitor.nextInt();

        System.out.print("Digite o primeiro termo: ");
        int a1 = leitor.nextInt();

        System.out.print("Digite o valor da Razão: ");
        int r = leitor.nextInt();

        int soma = 0;

        for (int i = 0; i < n; i++) {
            int termo = a1 + i * r;
            System.out.print(termo + "");

            soma += termo;

        }
        System.out.println("\n\nSoma dos termos: " + soma);

        leitor.close();
    }
}
