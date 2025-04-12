package Lista4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] fatoriais = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            numeros[i] = leitor.nextInt();
        }

        for(int i = 0; i< 10 ; i++){

            int n = numeros[i];
            int fatorial = 1;
            
        for(int j = 1; j < n; j++){
            fatorial *= j;
        }
        fatoriais[i] = fatorial;

        }
        for(int i = 0; i < 10 ; i++){
            System.out.println(numeros[i] + "! = " + fatoriais[i]);

        }
        leitor.close();
    }
}
