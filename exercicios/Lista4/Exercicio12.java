package Lista4;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] A = new int[5][5];
        int somaTotal = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print("Digite o valor para posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = leitor.nextInt();
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                somaTotal += A[i][j];
            }
        }

        leitor.close();
        System.out.println(somaTotal);
    }
}
