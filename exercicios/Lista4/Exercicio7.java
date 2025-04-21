package Lista4;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] A = new int[20];


        for(int i = 0; i < A.length; i ++){
            System.out.println("Digite o " + (i+1) + "º valor de A");
            A[i] = leitor.nextInt();
        }
        for(int i = 0; i < A.length; i++){
            for(int j =1; i < i; j++){
                A[i] += A[j];
            }
        }
        System.out.println("Soma do vetor é :"+ A.length);
        leitor.close();
    }
}
