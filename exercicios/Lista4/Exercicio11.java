package Lista4;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] A = new int[15];
        int maiorNumero = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor da Coluna A: ");
            A[i] = leitor.nextInt();
        }
        System.out.println("Maior Valor é : ");
        for (int i = 0; i < A.length; i++) {
            if (A[i] > maiorNumero) {
                maiorNumero = A[i];
            }
        }
        System.out.println(maiorNumero);
        leitor.close();
    }
}
