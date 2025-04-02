package Vetores;

import java.util.Scanner;

public class SistemaAcademicoPlus {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int quantidadeTurmas = 0;
        System.out.print("Digite o numero de Turmas:");
        quantidadeTurmas = leitor.nextInt();

        int quantidadeAlunos = 0;
        System.out.print("Digite a quantidade de Alunos: ");
        quantidadeAlunos = leitor.nextInt();

        int  quantidadeNotas = 0;
        System.out.print("Digite a quantidade de notas: ");
        quantidadeNotas = leitor.nextInt();
        
        int [][] Matriz = new int [quantidadeTurmas][quantidadeAlunos];
        float mediaTurma= 0;
        float mediaAluno= 0;
        float mediaTurmaGeral = 0;
        float notas = 0;
        for(int i = 0 ; i < Matriz.length ; i++){
            mediaTurma = 0;
            System.out.print("Aluno " + (i+1) + "º :");

            for(int j = 0; j < Matriz[i].length; j++){
                mediaAluno = 0;
                notas = 0;            
                for(int k = 0; k <= quantidadeNotas; k++){
                    System.out.print("\nQual foi a " + (j +1)+ "º nota:");
                notas = leitor.nextFloat();
                }
            }
            
        }
        leitor.close();
    }
}
