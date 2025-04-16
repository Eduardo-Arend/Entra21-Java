package Lista5;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a Primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Digite a Segundo nota: ");
        double nota2 = leitor.nextDouble();

        System.out.print("Digite a Terceira nota: ");
        double nota3 = leitor.nextDouble();


        double resultado = Media(nota1, nota2, nota3);

        System.out.println("Media Ponderada é : " + resultado);

        leitor.close();


    }


    

    public static double Media(double nota1, double nota2, double nota3){
        double resultado = ((nota1 * 2)+(nota2 * 3)+ (nota3 *5) );

        return resultado;
    }
    
}
