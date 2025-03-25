package Lista2;

import java.util.Scanner;

public class exercicio9 {
	public static void main (String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Produto		Código  Preço\r\n"
				+ "	\r\n"
				+ "	Cachorro-quente	100 	1,20\r\n"
				+ "	\r\n"
				+ "	Bauru simples 	101 	1,30\r\n"
				+ "	\r\n"
				+ "	Bauru com ovo 	102 	1,50\r\n"
				+ "	\r\n"
				+ "	Hambúrguer 	103 	1,20\r\n"
				+ "	\r\n"
				+ "	Misto quente 	104 	1,30\r\n"
				+ "	\r\n"
				+ "	Refrigerante 	105 	1,00");
		
		System.out.print("\nEscolha qual você vai querer:");
		int codigo = leitor.nextInt();
		
		System.out.print("\nQuantidade:");
		int quantidade = leitor.nextInt();
		
		leitor.close();
		
		switch(codigo) {
		
		case 100:
			System.out.print("Cachorro Quente :"+ " R$ " + (quantidade * 1.20));
				break;
		case 101:
			System.out.printf("Bauru Simples :" + "R$" + (quantidade *1.30));
				break;
				
		case 102:
			System.out.print("Bauru Com Ovo "+"x"+quantidade+ "= R$" + (quantidade*1.50));
				break;
		case 103:
			System.out.print("Hambúrguer "+"x"+quantidade+"= R$"+ (quantidade*1.20));
				break;
		case 104:
			System.out.print("Misto Quente"+"x"+quantidade+"= R$"+(quantidade*1.30));
				break;
		case 105:
			System.out.print("Refrigerante  "+"x"+quantidade+"= R$"+ (quantidade*1));
				break;
		}
		
	}

}
  