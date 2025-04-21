package Lista4;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[A.length + B.length];
        int tamanhoC = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor da Coluna A: ");
            A[i] = leitor.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor da Coluna B: ");
            B[i] = leitor.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            C[tamanhoC] = A[i];
            tamanhoC++;
        }
        for (int i = 0; i < A.length; i++) {
            C[tamanhoC] = B[i];
            tamanhoC++;
        }

        for(int i=0; i < C.length; i++){
            for(int j =i + 1; j < C.length; j++){
                if (C[i] < C[j]) {
                    int temp = C[i];
                    C[i] = C[j];
                    C[j] = temp;
                }
            }
        }
        System.out.println("\nVetor em ordem decrescente:");
        for (int i = 0; i < C.length; i++) {
            System.out.println("C[" + i + "]: " + C[i]);
        }

        leitor.close();
    }
}
