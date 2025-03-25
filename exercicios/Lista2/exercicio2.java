package Lista2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[]args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o Primeiro numero:");
		int primeiro = leitor.nextInt();
		
		System.out.println("Informe o Segundo numero:");
		int segundo = leitor.nextInt();
		
		System.out.println("Informe o Terceiro numero:");
		int terceiro = leitor.nextInt();
		
		if(primeiro > segundo && primeiro > terceiro) {
			System.out.println("O maior numero entre os tres é :" + primeiro);
		}else {
			if(segundo > terceiro) {
				System.out.println("O maior numero é" + segundo);
			}else {
				System.out.println("O maior numero é:" + terceiro);
			}
		}
		
		leitor.close();
	}
}
