package Lista3;

public class Exercicio10 {

    public static void main(String[] args) {

        int ehPerfeito = 2;
        int contador = 0;

        System.out.println("Os 5 primeiros números perfeitos são:");

        while (contador < 5) {

            int perfeito = 0;

            for (int i = 1; i <= ehPerfeito / 2; i++) {
                if (ehPerfeito % i == 0) {
                    perfeito += i;

                }

            }
            if (perfeito == ehPerfeito) {
                System.out.println(ehPerfeito);
                contador++;

            }
            ehPerfeito++;
            if (contador == 5) {
            
                break;
                
            }
        }
        
    }
}
