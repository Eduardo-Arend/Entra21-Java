package Lista1;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor total de eleitores: ");
        int valorTotal = leitor.nextInt();

        System.out.println("Digite o valor de votos em branco: ");
        int emBranco = leitor.nextInt();

        System.out.println("Digite o valor de votos nulos: ");
        int nulos = leitor.nextInt();

        leitor.close();

        double porcentagemEmBranco = (emBranco * 100) / valorTotal;
        double porcentagemNulos = (nulos * 100) / valorTotal;
        double porcentagemValidos = 100 - (porcentagemEmBranco + porcentagemNulos);
       

        System.out.println("Porcentagem de votos em branco: " + porcentagemEmBranco + "%");
        System.out.println("Porcentagem de votos nulos: " + porcentagemNulos + "%");
        System.out.println("Porcentagem de votos validos: " + porcentagemValidos + "%");
        


    }
}
