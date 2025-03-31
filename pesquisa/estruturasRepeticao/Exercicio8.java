package estruturasRepeticao;

public class Exercicio8 {

    public static void main(String[] args) {

        long produtoPrimos = 1; // Usando long para evitar estouro de valor

        for (int i = 92; i <= 107; i++) {
            boolean primo = true;

            // Testa se o número é primo (sem usar Math.sqrt)
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break; // Sai do loop ao encontrar um divisor
                }
            }

            // Se for primo, multiplica no acumulador
            if (primo) {
                produtoPrimos *= i;
                System.out.println(i + " é primo");
            }
        }

        System.out.println("Produto dos números primos entre 93 e 107: " + produtoPrimos);
    }
}


