package Lista3;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.print("\nDigite um Valor Positivo (Negativo para sai do codigo) :");
            int m = leitor.nextInt();

            if (m < 0) {
                System.out.print("\nEncerrando...");
                break;
            }
            if (m % 2 == 0) {
                System.out.print("\nÉ par, seus divisores são: ");
                
                for(int i =1; i <= m; i++){
                    if (m % i == 0) {
                        System.out.print(i+".");
                    }
                }
            }else if (m < 10) {
                System.out.print("\nImpar < 10: ");
                int fatorial = 1;
                for(int i =m; i >= 1; --i){
                    fatorial *= i;
                }
                System.out.println("\nFatorial:" + fatorial);
            }else{
                System.out.print("\nImpar >= 10: ");
                int soma = 0;
                for(int i =0; i <=m; i++){
                    soma += i;
                }
                System.out.print("\nSoma dos valores inteiros até  M : "+ soma);
            }
            

            
        }
        leitor.close();
    }
}
