package Lista4;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [] A = new int[15];



        for(int i = 0; i < A.length; i++){
            System.out.print("Digite o " + (i + 1) + "º valor de A: ");
            A[i] = leitor.nextInt();
        }

        for(int i=0; i < A.length; i++){
            if (A[i] % 2 == 0) {
                System.out.println("A[" + i + "]: "  + A[i]);
            }
        }
        leitor.close();
    }
}
