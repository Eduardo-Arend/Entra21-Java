package Lista2;
/*Escreva um algoritmo para ler um valor em reais e calcular qual o menor número possível de notas de 100, 50, 20 , 10, 5 e 2  em que o valor lido pode ser decomposto.
Escrever o valor lido e a relação de notas necessárias.   ou seja centenas, dezenas e unidades.
 */

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o Valor R$:");
        int valor = leitor.nextInt();

        int nota100 = valor / 100;
        valor %= 100;

        int nota50 = valor / 50;
        valor %= 50;

        int nota20 = valor / 20;
        valor %= 20;

        int nota10 = valor / 10;
        valor %= 10;

        int nota5 = valor / 5;
        valor %= 5;

        int nota2 = valor / 2;
        valor %= 2;
        System.out.println("\nValor lido: R$ " + valor);
        System.out.println("Notas de 100: " + nota100);
        System.out.println("Notas de 50: " + nota50);
        System.out.println("Notas de 20: " + nota20);
        System.out.println("Notas de 10: " + nota10);
        System.out.println("Notas de 5: " + nota5);
        System.out.println("Notas de 2: " + nota2);
        System.out.println("Valor restante (moedas): R$ " + valor);

        leitor.close();

    }
}
