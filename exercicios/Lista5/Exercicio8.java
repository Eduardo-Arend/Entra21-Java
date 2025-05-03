package Lista5;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero :");
        int numero = leitor.nextInt();

        int resultado = proximoPerfeito(numero);
        System.out.println("o Proxímo número perfeito é : "+resultado);
    
        leitor.close();
    } 
    public static boolean ehPerfeito (int numero){
        int perfeito = 0;
        
        for(int i=1; i <= numero/2; i++){
            if ((numero % i) == 0) {
                perfeito = perfeito + i;
            }
        }
    return perfeito == numero;
    }  
    
    public static int proximoPerfeito(int numero){
        int proximo = numero +1;
        while (true) {
            if (ehPerfeito(proximo)) {
                return proximo;
            }
            proximo++;
        }
    }
}