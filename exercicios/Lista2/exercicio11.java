package Lista2;
/* Escreva um algoritmo para ler o salário e o código do cargo de um funcionário e calcule o novo salário usando a tabela abaixo.
 Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de aumento. Mostre o salário antigo, o novo salário e a diferença.
 
	Código	Cargo 	Percentual

	101 	Gerente 	10%
	
	102 	Engenheiro 	20%
	
	103 	Técnico 	30% */

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

		 leitor.close();

		 switch(codCargo) {
		 case 101: 
		 // Gerente
			 novoSalario = salario+(salario*0.1);
			 	break;
			
		 case 102:
		 //Engenheiro
			 novoSalario = salario+(salario*0.2);
			 	break;
			 	
		 case 103:
		 // Técnico
			 novoSalario = salario+(salario*0.3);
			 	break;
			 	
		default:
			 novoSalario = salario + (salario *0.4);
			 	break;
		 }
		 diferenca = novoSalario - salario;
		 System.out.println("Novo Salario:" + novoSalario);
		 System.out.println("Salario antigo:" + salario);
		 System.out.println("Diferença :" + diferenca);
	}
}
