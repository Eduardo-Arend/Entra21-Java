package estruturasRepeticao;

import java.util.Scanner;

public class exponenciacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int resultado = 0;
		System.out.print("Digite o valor de A: ");
		int a = leitor.nextInt();
		
		System.out.print("Digite o valir de B: ");
		int b = leitor.nextInt();
		
		leitor.close();
		
		for(int i = a; i <= b ; i++ ) {
			
		
			System.out.print("\nResultado " + resultado);
		}
		
	}

}
