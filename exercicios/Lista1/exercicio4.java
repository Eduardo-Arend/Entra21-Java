package Lista1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Infome os Dias:");
		int totalDias = leitor.nextInt();
		
		int anos = totalDias / 365;
		int restante = totalDias % 365;
		int mes = restante / 30;
		int dias = restante % 30;
		
		leitor.close();
		
		System.out.println("Você tem :" + anos + " Anos " + mes +" Messes " + dias + " Dias.");
		
		
	}

}
