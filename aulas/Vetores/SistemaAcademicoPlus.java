package Vetores;

import java.util.Scanner;

public class SistemaAcademicoPlus {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite o numero de Turmas:");
        int quantidadeTurmas = leitor.nextInt();

        System.out.print("Digite a quantidade de Alunos: ");
       int quantidadeAlunos = leitor.nextInt();

        System.out.print("Digite a quantidade de notas: ");
        int quantidadeNotas = leitor.nextInt();
        
        float [][] Matriz = new float [quantidadeTurmas][quantidadeAlunos];
        float mediaTurma= 0;
        float mediaAluno= 0;
        float mediaTurmaGeral = 0;
        float notas = 0;

        float maiorNota = Float.MAX_VALUE;
        float menorNota = Float.MIN_VALUE;

        for(int i = 0 ; i < Matriz.length ; i++){
            mediaTurma = 0;
            System.out.print("Turma " + (i+1) + "º :");

            for(int j = 0; j < Matriz[i].length; j++){
                mediaAluno = 0;
              System.out.println("\nAluno " + (j+1) + "º :");              
                for(int k = 0; k < quantidadeNotas; k++){
                    System.out.print("\nQual foi a " + (k +1)+ "º nota:");
                notas = leitor.nextFloat();
                mediaAluno += notas;

                menorNota = notas <= menorNota ? notas : menorNota;
                maiorNota = notas >= maiorNota ? notas : maiorNota;
                }
                mediaAluno += mediaAluno / quantidadeNotas;
                Matriz[i][j] = mediaAluno;
            }
            
        }

        leitor.close();
    }
}
