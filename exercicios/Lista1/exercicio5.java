package Lista1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite quantos Anos você tem : ");
		
		int anos = leitor.nextInt();
		
		System.out.println("Digite os meses:");
		int mes = leitor.nextInt();
		
		System.out.println("Digite os dias:");
		int dias = leitor.nextInt();
		
		leitor.close();
		
		int resultadoEmDias = (anos * 365) + (mes * 30) + dias  ; 
	
		System.out.println("Você tem " + resultadoEmDias + " Dias.");

	}

}
