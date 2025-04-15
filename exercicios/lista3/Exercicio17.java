package Lista3;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o Numero : ");
        int numero = leitor.nextInt();

        System.out.println("Tabuada: ");
        for (int i = 1; i <= numero; i++) {
            System.out.println((i) + " X " + (numero) + " = " + i * numero);
        }
        leitor.close();
    }
}
