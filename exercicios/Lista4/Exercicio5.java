package Lista4;

import java.util.Scanner;

public class Exercicio5 {
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
            boolean repetido = false;
            for (int j = 0; j < tamanhoC; j++) {
                if (C[j] == A[i]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                C[tamanhoC] = A[i];
                tamanhoC++;
            }
        }

        for (int i = 0; i < B.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < tamanhoC; j++) {
                if (C[j] == B[i]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                C[tamanhoC] = B[i];
                tamanhoC++;
            }
        }

        System.out.println("\nVetor C (Intersecção de A e B sem repetição):");
        for (int i = 0; i < tamanhoC; i++) {
            System.out.println("C[" + i + "]: " + C[i]);
        }
        leitor.close();
    }
}
