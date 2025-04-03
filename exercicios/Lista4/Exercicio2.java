package Lista4;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int posicao = 0;
        int numero = 2;
        while (posicao < 10) {
            boolean ehPrimo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            
            }
            if ( ehPrimo && numero > 1) {
                vetor[posicao] = numero;
                posicao++;
                
            }
            numero++;
            
        }
        System.out.println("Os 10 primeiros números primos são:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
