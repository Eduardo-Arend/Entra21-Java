package Lista5;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: " );
        int valor1 = leitor.nextInt();

        System.out.print("Digite o segundo valor inteiro: " );
        int valor2 = leitor.nextInt();


        leitor.close();

        int fatorial = calculaFatorial(valor1);
        if (fatorial == valor2) {
            System.out.println("O segundo número corresponde ao fatorial do primeiro.");
            
        }else{
            System.out.println("O segundo número não corresponde ao fatorial do primeiro.");
        }

        System.out.println(fatorial);

    }

    public static int  calculaFatorial(int valor1){
        
        int fatorial = 1;
        for (int i = valor1; i >= 1; --i){
    
            fatorial *= i;
        }

        return fatorial;
    }
    
}
