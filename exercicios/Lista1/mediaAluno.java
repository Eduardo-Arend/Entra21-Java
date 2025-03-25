package Lista1;
//exercicio 2
import java.util.Scanner;

public class mediaAluno {

	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    System.out.println("Digite o valor da primeira nota: ");
	    float prova1 = leitor.nextFloat();
	    
	    System.out.println("Digite o valor da segunda nota: ");
	    float prova2 = leitor.nextFloat();
	    
	    System.out.println("Digite o valor da terceira nota:");
	    float prova3 = leitor.nextFloat();
	    
	    System.out.println("Digite a frequencia :");
	    float frequencia = leitor.nextFloat();
	    
	    float resultadoMedia = (prova1+prova2+prova3) / 3;
	    System.out.println("O Valor da média é: " + resultadoMedia);
	    
	    leitor.close();
	    
	    
	    if (resultadoMedia >= 7) {
	    	if(frequencia >= 75) {
	    	System.out.println("\nVocê foi aprovado!");	    	
	    }
	    	}
	    else {
	    	System.out.println("\nVocê não foi aprovado!");
	    }
	}

}
