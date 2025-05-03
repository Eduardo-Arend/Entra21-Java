package Lista3;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String [] args ) {
		
		Scanner leitor = new Scanner(System.in);
		
		int num = 0;
		int valores;
		int maior = 0;
		int menor= 0;
		double media = 0;
		
		for(int i = 0; i < 10 ; i++) {
			System.out.print("Digite um numero: " + (i+1) + ": ");
			valores = leitor.nextInt();
		
			num += valores;
		
			if(valores > maior) {
				maior = valores;
			}
			
			if(maior < menor && valores != 0) {
				menor = valores;
			}
			
			 media =  (num + valores) / 10;
			
			}
		

		leitor.close();
		
		System.out.println("Maior Valor :" + maior);
		System.out.println("Menor Valor :" + menor);
		System.out.println("Media :" + media);
		
	
		
	}
}
