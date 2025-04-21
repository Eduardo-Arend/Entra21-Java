package Lista4;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double [][] A = new double [9][9];
       

        for(int i=0; i<A.length; i++){
            for(int j =0; j < A.length; j++){
                System.out.print("Digite o valor para posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j]= leitor.nextDouble();
            }
        }

        for(int i=0; i <A.length; i++){
            double somaLinha =0;
            for(int j=0; j < A.length; j++){
                somaLinha += A[i][j];
            }
            if (i % 2 == 0) {
                System.out.println("Linha " + i + ": "+ somaLinha);
            }
        }


        leitor.close();
    }
}
