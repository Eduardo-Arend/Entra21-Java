package Lista1;

import java.util.Scanner;

public class exercicio9 {
	
	public static void main (String [ ]args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o Valor de custo que a Fabrica teve :");
		double custoDeFabrica = leitor.nextDouble();
		
		leitor.close();
        
		double distribuidora = (28 * custoDeFabrica) / 100;
		
		double imposto = (45 * custoDeFabrica) / 100;
		
		double custoFinal = custoDeFabrica + distribuidora + imposto ;
		
		System.out.println("O valor final ao consumidor fica em: " + custoFinal);
		
	}

}