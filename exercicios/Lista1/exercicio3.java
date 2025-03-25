package Lista1; 
// execicio 3
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
	  Scanner leitor = new Scanner(System.in);
	  
	   String aluno = "Eduardo";
	   
	   System.out.println("Valor da nota da Primeira prova : ");
		float nota1 = leitor.nextFloat();
		
		System.out.println("Valor da nota da Segunda prova : ");
		float nota2 = leitor.nextFloat();
		
		System.out.println("Valor da nota do Trabalho :");
		float nota3 = leitor.nextFloat();
		
		float peso1 = nota1 * 2;
		float peso2 = nota2 * 3;
		float peso3 = nota3 * 5;
		
		float Resultado = (peso1+peso2+peso3);
	
		leitor.close();

		System.out.println("A media penderada do aluno " + aluno +" é: " + Resultado);
	}

}
