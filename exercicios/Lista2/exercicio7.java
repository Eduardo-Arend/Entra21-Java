package Lista2;

import java.util.Scanner; 

public class exercicio7 {

    public static void main (String [] args){

        Scanner leitor = new Scanner(System.in);

        System.out.printf("\nQual é a idade do nadador?");
        int idade = leitor.nextInt();

        leitor.close();

        switch (idade) {
            case 5,6,7:
            System.out.printf("\nInfantil A = 5-7 anos");
                break;


            case 8,9,10:
            System.out.printf("\nInfantil B = 8-10 anos");
                break;

            case 11,12,13:
            System.out.printf("Juvenil A = 11-13 anos");
                break;

            case 14,15,16,17:
            System.out.printf("Juvenil B = 14-17 anos");
                break;

            case 1,2,3,4:
            System.out.printf("Idade invalida.");
                break;

            default:
            System.out.printf("\nAdulto = maiores de 18 anos");
                break;
        }



    }
}
