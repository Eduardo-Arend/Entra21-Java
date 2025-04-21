package Lista5;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor = ");
        int valor = leitor.nextInt();

        double resulado = calculaFotorial(valor);

        System.out.println(resulado);

        leitor.close();
    }

    public static double calculaFotorial(int valor) {

        double E = 1;
        double fatorial = 1;
        for (int i = valor; i >= 1; i++) {

            fatorial *= i;

            E += 1 / fatorial;
            
        }

        return E;

    }

}
