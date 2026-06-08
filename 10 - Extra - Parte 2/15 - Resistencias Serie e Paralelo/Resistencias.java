import java.util.Scanner;

public class Resistencias{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a quantidade de resistências: ");
        int resistencias = scanner.nextInt();

        double rserie = 0;
        double rparalelo = 0;

        for (int i=1; i<=resistencias; i++){
            System.out.printf("Entre com a resistência %d (ohm): ", i);
            double resistencia = scanner.nextDouble();
            rserie += resistencia;
            rparalelo+=1/resistencia;
        }
        rparalelo=Math.pow(rparalelo, -1);
        scanner.close();

        System.out.printf("Resistência série: %.0f ohm %n",rserie);
        System.out.printf("Resistência paralelo: %.3f ohm %n",rparalelo);

    }
}