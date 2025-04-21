package Lista4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[A.length + B.length];
        int tamanhoC = 0;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor da Coluna A: ");
            A[i] = leitor.nextInt();
        }
       for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor da Coluna B: ");
            B[i] = leitor.nextInt();
        }

        for(int i =0; i < A.length; i ++){
                C[tamanhoC] = A[i];
                tamanhoC++; 

        }

        for(int i =0; i < B.length; i++){
                C[tamanhoC] = B[i];
                tamanhoC++;     
        }

        System.out.println("\nVetor C (união de A e B sem repetição):");
        for (int i = 0; i < tamanhoC; i++) {
            System.out.println("C[" + i + "]: " + C[i]);
        }
        
            leitor.close();
        }
    }

