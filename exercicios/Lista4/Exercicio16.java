package Lista4;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] C = new int[4][4];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print("Digite o valor para posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = leitor.nextInt();
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.print("Digite o valor para posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                B[i][j] = leitor.nextInt();
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {

                C[i][j] = A[i][j] * B[i][j];
            }
        }
        System.out.println("C:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.print(C[i][j]);
            }
        }
        leitor.close();
    }
}
