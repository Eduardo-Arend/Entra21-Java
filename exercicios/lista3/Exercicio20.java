package Lista3;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um valor para calcular : ");
        int numero = leitor.nextInt();

        double valorFinal = 0;
        
        for(int i=1; i <= numero; i++){
            valorFinal += 1.0 / i;

            if (i == 1) {
                System.out.print("1");
            }else{
                System.out.print(" +1/"+i);
            }
        }
        System.out.println("\n"+valorFinal);

        leitor.close();
    }
}
