package Vetores;

/*a quantidade de alunos na turma, depois a quantidade de notas depois a quantidade de notas ,
 depois pra cada aluno ler as notas que ele teve, depois mostrar qual a média de cada um, qual menor nota de todos ,
  qual maior nota de todos, e qual a média geral */

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
