package Lista5;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a idade espressa em dias: ");
        int dias = leitor.nextInt();
        int emAnos = emAnos(dias);
        int emMeses = emMeses(dias);
        int emDias = emDias(dias);

        System.out.println("\nResultado:"+"Em Anos: " + emAnos+"\nEm Meses: "+emMeses+"\nEm Dias: "+emDias);

        leitor.close();
    }

    public static int emAnos (int dias){
        return dias / 365;

    }
    public static int emMeses (int dias){
        
        int restante = dias % 365;
        int mes = restante / 30;
        return mes;
    }

    public static  int emDias (int dias){
        int restante = dias % 365;

        int dia = restante % 30;

        return dia;
    }
}
