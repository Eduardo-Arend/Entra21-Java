package Lista4;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[A.length];
        int tamanhoB = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor da Coluna A: ");
            A[i] = leitor.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            boolean ehPrimo = true;

            for(int j =2; j < i; j ++){
                if (i % j ==0) {
                    ehPrimo = false;
                    break;
                }
            }
            if ( ehPrimo && i > 1 ) {
                B[tamanhoB] = A[i];
                tamanhoB++;
            }
           
        }
        System.out.println("Os valores primos encontrados são: ");
        for(int i=0; i < tamanhoB; i++){
            System.out.println("Primo :" + B[i]);
        }

        leitor.close();
    }
}
