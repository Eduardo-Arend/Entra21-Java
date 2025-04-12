package Lista3;

public class Exercicio2 {

	public static void main(String[] args) {
		int num1 = 1000;
	
		int num2 = 1999;
		
		for(int i = num1; i <= num2; i++) {
			int resultado = i / 11;
			if(i % resultado == 5) {

				System.out.println(i);
				
			}
		}
		

	}

}
