package lista3;

import java.util.Scanner;
public class Exercicio6 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero positivo: ");
        int n = leitor.nextInt();
        leitor.close();

        int fatorial = 1;
        for (int i = n; i >= 1; --i){

            fatorial *= i;
        }
        System.out.println("Valor :" + fatorial);

    }
    
}