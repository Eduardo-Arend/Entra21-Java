package Lista3;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nº1 - Candidato 1 " + "\nNº2 - Candidato 2" + "\nNº3 - Candidato 3 "
                + "\nNº4 - Candidato 4 " + "\nNº5 - Voto nulo " + "\nNº6 - Voto em Branco ");
        System.out.println("Escolha seu candidato:");
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;

        int nulo = 0;
        int branco = 0;

        boolean condicao = true;
        while (condicao) {

            int escolha = leitor.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Você votou no candidato 1");
                    candidato1 ++;

                    break;
                case 2:
                    System.out.println("Você votou no candidato 2");
                    candidato2++;
                    break;
                case 3:
                    System.out.println("Você votou no candidato 3");
                    candidato3++;
                    break;
                case 4:
                    System.out.println("Você votou no candidato 4");
                    candidato4++;
                    break;
                case 5:
                    System.out.println("Você votou nolu ");
                    nulo++;
                    break;
                case 6:
                    System.out.println("Você votou em branco ");
                    branco++;
                    break;

                default:
                    condicao = false;
            }
            leitor.close();
        }
        System.out.println("Candidato 1 recebeu " + candidato1 +" Votos.");
        System.out.println("Candidato 2 recebeu "+candidato2+" Votos.");
        System.out.println("Candidato 3 recebeu "+candidato3+" Votos.");
        System.out.println("Candidato 4 recebeu "+candidato4+" Votos.");
        System.out.println("Teve "+nulo +" Votos em nulo.");
        System.out.println("Teve "+branco+" votos em branco.");

    }
}
