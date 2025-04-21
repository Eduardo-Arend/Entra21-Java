package Lista4;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] A = new int[5][5];
        int somaColuna = 0;
        int somaLinha =0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print("Digite o valor para posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = leitor.nextInt();
            }
        }
        for(int i =0; i < A.length; i++){
                somaLinha += A[4][i];
        }
        for(int i =0; i < A.length; i++){
            somaColuna += A[i][2];
        }
        System.out.println("\nSoma da linha 5: " + somaLinha);
        System.out.println("Soma da coluna 3: " + somaColuna);
        leitor.close();
    }
}
