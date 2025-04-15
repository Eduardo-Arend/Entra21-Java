package Lista3;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um Valor: ");
        int numero = leitor.nextInt();

        leitor.close();

        double E = 1;
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {

            fatorial *= i;
            E += 1.0 / fatorial;
        }

        System.out.println("O valor de E é: " + E);
    }
}
