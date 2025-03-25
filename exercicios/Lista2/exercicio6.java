package Lista2;

import java.util.Scanner;

public class exercicio6 {
    public static void main (String []args){

        Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o valor da base:");
		int base = leitor.nextInt();
		
		System.out.print("Informe o valor da Reta Esquerda:");
		int esquerda = leitor.nextInt();
		
		System.out.print("Infome o valor da Reta Direita:");
		int direita = leitor.nextInt();

        leitor.close();

        if (base == esquerda && esquerda == direita) {
            System.out.println("Triângulo Equilátero: possui os 3 lados iguais.");
        }else{
            if (esquerda == direita) {
                System.out.print("Triângulo Isósceles: possui 2 lados iguais.");
            }else{
                System.out.print("Triângulo Escaleno: possui 3 lados diferentes.");
            }
        }

    }

}
