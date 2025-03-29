package estruturasRepeticao;

    import java.util.Scanner;

public class exponencial {

    public static void main(String[] args) {
        
        Scanner leitor  = new Scanner(System.in);

        

        System.out.print("Digite o Valor de A:");
        int num1 = leitor.nextInt();

        System.out.print("Digite o Valor de B :");
        int num2 = leitor.nextInt();

        int resultado = num1;

        for (int i = 1; i <= num2; i++){
            resultado *= num1;
            
           
        }
        System.out.println(num1 + "^" + num2 + " = " + resultado);

            leitor.close();
    }
}
