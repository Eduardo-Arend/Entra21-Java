package lista3;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero de valor inteiro: ");
        int numero = leitor.nextInt();
        leitor.close();
        int perfeito = numero + 1;

        while (true) {
            int numPerfeito = 0;

            for (int i = 1; i <= perfeito / 2; i++) {
                if (perfeito % i == 0) {
                    numPerfeito += i;
                }
                 
            }
            if (numPerfeito == perfeito) {
                System.out.println("numero perfeito após a " + numero + " é : " + numPerfeito);
                break;
            }
            perfeito++;
        }
    }
}
