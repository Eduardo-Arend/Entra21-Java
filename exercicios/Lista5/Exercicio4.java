package Lista5;
import java.util.Scanner;
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o Custo da Fabrica: ");
        double custoDeFabrica = leitor.nextDouble();
        double resulado = custoFinal(custoDeFabrica);
        System.out.println("Custo final para o consumidor: " + resulado);

        leitor.close();
    }
    
    public static double custoFinal (double custoDeFabrica){

        double distribuidora = (28 * custoDeFabrica) / 100;
		
		double imposto = (45 * custoDeFabrica) / 100;
		
		double custoFinal = custoDeFabrica + distribuidora + imposto ;
	
        return custoFinal;

    }
}
