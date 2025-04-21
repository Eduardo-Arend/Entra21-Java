package Lista4;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[] C = new int[4];
        int tamanhoC = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print("Digite o valor para posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = leitor.nextInt();
            }
        }
        System.out.print("Multiplicar por quanto ?:");
        int B = leitor.nextInt();

        for(int i =0; i <A.length; i++){
            for(int j =0; j <A.length; j++){
                C[tamanhoC] = A[i][j] * B;
                tamanhoC++;
            }
        }
        System.out.print("\nValor do Vetor C =");
        for(int i=0; i < C.length; i++){
            System.out.println("C :" + C[i]);
        }

        leitor.close();
    }
}
