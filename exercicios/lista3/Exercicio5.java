package Lista3;

public class Exercicio5 {

    public static void main(String[] args) {

        double chico = 1.50;
        double taxaC = 0.02;

        double ze = 1.10;
        double taxaZ = 0.03;

        int tempo = 0;

        while (chico > ze) {
            chico += taxaC;

            ze += taxaZ;

            tempo++;

        }

        System.out.println("Foram nescessario :" + tempo + " anos para Zé passar Chico.");

    }
}
