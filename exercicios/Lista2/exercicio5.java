package Lista2;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o valor da base:");
		int base = leitor.nextInt();
		
		System.out.print("Informe o valor da Reta Esquerda:");
		int esquerda = leitor.nextInt();
		
		System.out.print("Infome o valor da Reta Direita:");
		int direita = leitor.nextInt();
		
        leitor.close();
		
		if(esquerda + direita > base) {
			System.out.print("Você formou um triangulo!!");
			
		}else {
			System.out.print("Você nao formou um triangulo.");
		}
		
		
	}
}


