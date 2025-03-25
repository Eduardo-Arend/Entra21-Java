package ifElse_switch;

public class switchCase {

	public static void main (String [] args) {
	
		int diaSemana = 1;
		
		switch (diaSemana) {
		
		case 1:
			System.out.println("Dimingo");
			break;
			
		case 2:
			System.out.println("Segunda-feira");
			break;
			
		default:
			System.out.println("Dia da semana invalido!");
		}
	}
	
}
