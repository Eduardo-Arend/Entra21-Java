package Lista1;
//Execicio 1
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a Altura em metros: ");
		float comprimento = leitor.nextFloat();
		
		System.out.println("Informe a Largura em metros: ");
		float largura = leitor.nextFloat();

		leitor.close();
		
		float area = comprimento * largura / 2;
		
		System.out.println("A área desse retângulo é " + area + " Metros.");

	}

}
