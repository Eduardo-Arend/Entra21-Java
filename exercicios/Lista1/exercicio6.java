package Lista1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a Temperatura em Fahrenheit: ");
		
		double fahrenheit = leitor.nextDouble();
		double celsius = (fahrenheit - 32) * 5/9;

		leitor.close();

		System.out.println("A temperatura em Celsius é: " + celsius + "°C");



	}

}
