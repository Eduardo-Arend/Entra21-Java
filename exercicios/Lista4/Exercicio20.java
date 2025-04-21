package Lista4;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] A = new int[12][12];
        int[] B = new int[12];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print("Digite o valor para posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = leitor.nextInt();
            }
        }

        for (int i = 0; i < A.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < A.length; j++) {
                somaLinha += A[i][j];
            }
            B[i] = somaLinha;
        }
        System.out.print("\nValor do Vetor B =");
        for (int i = 0; i < B.length; i++) {
            System.out.println("\naB :" + B[i]);
        }
        leitor.close();
    }
}