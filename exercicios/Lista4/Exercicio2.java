package Lista4;

public class Exercicio2 {
    public static void main(String[] args) {
        int [] vetor = new int[10];
        int produtoPrimos = 1;
        int valor =1;
        int contador = 0;
        boolean primo = true;
        while (contador < 10) {
            for (int i = 0; i < 30; i++) {
                primo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;

                    }
                    if (primo && i > 1) {
                        produtoPrimos *=i;
                        
                        vetor[valor] = produtoPrimos;

                    }

                }

            }

        } System.out.println(vetor[valor]);
    }
}
