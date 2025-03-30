package Lista2;
import java.util.Scanner;
public class exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor medido da poluição:");
        double poluicao = leitor.nextDouble();
         leitor.close();
        if (poluicao <= 0.05 && poluicao <= 0.25) {
            System.out.print("Estado de puluição Aceitavel :" + poluicao);
        }else if (poluicao > 0.25 && poluicao <= 0.3) {
            System.out.print("Estado de puluição:" + poluicao+ "\nprimeiro grupo são intimadas a suspenderem suas atividades.");
        }else if (poluicao > 0.3 && poluicao <= 0.4) {
            System.out.print("Estado de puluição:" + poluicao + "\nprimeiro e segundo grupo são intimadas a suspenderem suas atividades.");
        }else if (poluicao > 0.5 ) {
            System.out.print("Estado de puluição:" + poluicao + "\nOs três grupos de empresas devem parar suas atividades.");   
        }else{
            System.out.println("Valor inválido. Digite um Valor valido.");
        }
    }
    
}
