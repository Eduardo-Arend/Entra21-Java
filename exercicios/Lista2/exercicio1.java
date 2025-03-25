package Lista2;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main (String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o primeiro Valor: ");
		int a = leitor.nextInt();
		
		System.out.println("Informe o segundo Valor: ");
		int b = leitor.nextInt();

		
		float resto = a % b ;
		
		if (resto == 0) {
			System.out.println("são multiplos entre si");
		}
		else {
			System.out.println("não são multiplos entre si");
		}
	
		leitor.close();
	
	}

}
