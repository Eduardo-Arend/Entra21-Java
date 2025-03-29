package Vetores;

import java.util.Scanner;

public class mediaEscolar {
		
	public static void main(String [] args){
		
		Scanner leitor = new Scanner(System.in);
		
		int nota;
		
		System.out.print("Digite a quantidade de alunos:");
		int alunos = leitor.nextInt();
		int	aluno = alunos;
		System.out.print("Digite a quantidade de notas:");
		int quantidadeNotas = leitor.nextInt();

		for(int i = 0; i < quantidadeNotas; i++) {
			System.out.print("Informe a nota:" + (i +1));
			 nota = leitor.nextInt();
		}
		
		
		
		
	}
}
