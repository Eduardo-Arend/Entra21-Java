package Lista4;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] A = new int[20];
    

        for(int i = 0; i < A.length; i ++){
            System.out.println("Digite o " + (i+1) + "º valor de A");
            A[i] = leitor.nextInt();
        }
// selection sort.
        for(int i=0; i < A.length; i++){
            for(int j = i +1; j < A.length; j++){
                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }

            }
        }
        System.out.println("\nVetor em ordem crescente:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "]: " + A[i]);
        }
        leitor.close();
    }
}
