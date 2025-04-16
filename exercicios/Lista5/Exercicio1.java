package Lista5;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a altura: ");
        double altura = leitor.nextDouble();

        System.out.println("Informe a Largura: ");
        double Largura = leitor.nextDouble();

        leitor.close();

        double resultado = somaArea(altura,Largura);

        System.out.println("Area : "+resultado);

    }

    public static  double somaArea(double altura, double Largura){
      double  resultado = altura * Largura;
        
      return resultado;
    }
    
}
