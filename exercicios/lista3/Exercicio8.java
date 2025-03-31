package lista3;

public class Exercicio8 {

    public static void main(String[] args) {
        long produtoPrimos = 1;
        for (int i = 93; i <= 107; i++) {
            boolean primo = true;

            for (int j = 2; j <i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }

            }
            if (primo && i > 1) {
                produtoPrimos *= i;
                System.out.println(i + " é primo");
            }
        }
        System.out.println("Produto dos números primos entre 93 e 107: " + produtoPrimos);
    }

}
