package Lista3;

import java.util.Scanner;

public class Exercicio3 {
		
		public static void main(String [] args) {
			
		Scanner leitor = new Scanner(System.in);
		int numero ;
		int num1 = 1;
			while(true) {
				System.out.print("Digite um numero ou digite 0 para parar:");
				numero = leitor.nextInt();
				if(numero == 0) {
					break;
				}
				
				if(numero % 2 == 0 && numero != 0) {
					num1 *= numero; 
					
					
				}
					
		}
			System.out.println("o Produto " + num1);
			leitor.close();
}
}