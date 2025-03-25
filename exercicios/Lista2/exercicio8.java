package Lista2;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.printf("\nEsreva o codigo: ");

		String codigo = leitor.nextLine();

		System.out.printf("\n" + codigo + "\n");

		System.out.printf("\nDe uma nota pela Sintaxe:");
		float nota1 = leitor.nextFloat();

		System.out.printf("\nDe uma nota pela Semântica:");
		float nota2 = leitor.nextFloat();

		System.out.printf("\nDe uma nota pela Sintática:");
		float nota3 = leitor.nextFloat();

		float media;

		if (nota1 > nota2 && nota1 > nota3) {
			media = ((nota1 * 4) + (nota2 * 3) + (nota3 * 3));

		} else {
			if (nota2 > nota3) {
				media = ((nota1 * 3) + (nota2 * 4) + (nota3 * 3));
			} else {
				media = ((nota1 * 3) + (nota2 * 3) + (nota3 * 4));
				if (media > 7) {
					System.out.printf("\nSua nota é: " + media + " de 100.");
					System.out.print("\nAprovado!");
				} else {
					System.out.printf("\nSua nota é: " + media + " de 100.");
					System.out.printf("\nReprovado!");
				}
			}
		}

		leitor.close();

	}
}
