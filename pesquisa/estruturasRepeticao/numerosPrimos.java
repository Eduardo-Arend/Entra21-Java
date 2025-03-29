package estruturasRepeticao;

import java.util.Scanner;

public class numerosPrimos {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		int num = leitor.nextInt();
		leitor.close();
		
		boolean ehprimo = true;		
		
		for(int j = num; j > num; ++j) {
			
			for (int i = 2; i < j; i++) {

				if (num % i == 0) {
					ehprimo = false;
					break;
				}
				if (ehprimo && num != 1) {
					System.out.print("\nO numero" + num + " é primo.");
				} else {
					System.out.print("\nO numero" + num + " não é primo.");
				}
			}
		}	
			
}
}
