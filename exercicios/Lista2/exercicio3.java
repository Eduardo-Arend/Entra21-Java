package Lista2;

import java.util.Scanner;
	
public class exercicio3 {
	
	public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor:");
		int valor = leitor.nextInt();
	
		int divisao =  valor / 2;
		
		if (divisao == 0 ) {
			System.out.println("Este numero "+ valor + " é par");
		}else {
			System.out.println("Este numero "+ valor + " é impar");
		}
		if(divisao < 0) {
			System.out.println("e é negativo");
		}else {
			System.out.println("e é positivo");
		}
		leitor.close();
	}
}
