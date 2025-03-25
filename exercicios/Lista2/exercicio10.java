package Lista2;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("\nInforme seu saldo médio: ");
		int saldo = leitor.nextInt();
		int media;
		leitor.close();
		if (saldo <= 200) {

			System.out.print("\nnenhum crédito!");
		} else {
			if (saldo > 201 && saldo < 400) {
				media = (saldo * 20) / 100;
				System.out.print("Seu saldo médio é : " + saldo + " Valor de crédito:" + media);
			} else {
				if (saldo > 401 && saldo < 600) {
					media = (saldo * 30) / 100;
					System.out.print("Seu saldo médio é : " + saldo + " Valor de crédito:" + media);
				} else {
					media = (saldo * 40) / 100;
					System.out.print("Seu saldo médio é : " + saldo + " Valor de crédito:" + media);
				}
			}
		}

	}
}
