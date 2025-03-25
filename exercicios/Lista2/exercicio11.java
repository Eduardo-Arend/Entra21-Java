package Lista2;

import java.util.Scanner;

public class exercicio11 {
	
	public static void main (String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		 double salario, novoSalario, diferenca;
		 int codCargo;
		 System.out.print("Digite o salario do funcionário: ");
		 salario = leitor.nextDouble();
		 System.out.print("Digite o código do cargo do funcionário: ");
		 codCargo = leitor.nextInt();
		 switch(codCargo) {
		 case 101:
			 novoSalario = salario+(salario*0.1);
			 	break;
			
		 case 102:
			 novoSalario = salario+(salario*0.2);
			 	break;
			 	
		 case 103:
			 novoSalario = salario+(salario*0.3);
			 	break;
			 	
		 case 104:
			 novoSalario = salario + (salario *0.4);
			 	break;
		 }
		 diferenca = novoSalario - salario;
	}
}
