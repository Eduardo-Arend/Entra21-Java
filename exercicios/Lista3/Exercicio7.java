package Lista3;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero positivo: ");
        int n = leitor.nextInt();

        System.out.print("Digite o segundo numero:");
        int m = leitor.nextInt();

        int fatorial = 1;
        for (int i = n; i >= 1; --i) {

            fatorial *= i;
        }

        if (fatorial == m) {
            System.out.println("O segundo número corresponde ao fatorial do primeiro.");

        } else {
            System.out.println("O segundo número NÃO corresponde ao fatorial do primeiro.");
        }
        leitor.close();
    }
}
