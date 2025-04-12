package chat;

import java.util.Scanner;

public class UniaoDeVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];
        int tamanhoC = 0;

        System.out.println("Digite os 10 elementos do vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite os 10 elementos do vetor B:");
        for (int i = 0; i < 10; i++) {
            B[i] = scanner.nextInt();
        }

        // Adiciona elementos de A ao vetor C
        for (int i = 0; i < 10; i++) {
            boolean existe = false;
            for (int j = 0; j < tamanhoC; j++) {
                if (C[j] == A[i]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                C[tamanhoC] = A[i];
                tamanhoC++;
            }
        }

        // Adiciona elementos de B ao vetor C
        for (int i = 0; i < 10; i++) {
            boolean existe = false;
            for (int j = 0; j < tamanhoC; j++) {
                if (C[j] == B[i]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                C[tamanhoC] = B[i];
                tamanhoC++;
            }
        }

        System.out.println("Vetor C (união de A e B sem repetição):");
        for (int i = 0; i < tamanhoC; i++) {
            System.out.print(C[i] + " ");
        }

        scanner.close();
    }
}
