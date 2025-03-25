package Lista2;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String [] args) {
		 Scanner leitor = new Scanner(System.in);
		 
		 System.out.print("\nInforme a hora de inicio:");
		 int inicio = leitor.nextInt();
		 
		 System.out.print("\nInforme a hora final:");
		 int fim = leitor.nextInt();
		 
		 leitor.close();
		 
		 if (fim >= inicio){
			 System.out.print("\nO JOGO DUROU 24 HORA(S)");
		 }
		
		 
		 
		 
		 
		 
		 
	}

}
