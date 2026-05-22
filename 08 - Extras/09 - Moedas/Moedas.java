import java.util.Scanner;

public class Moedas{
    public static void main(String[] args){

        System.out.print("Entre com a quantidade de centavos: ");
        Scanner scanner = new Scanner(System.in);
        int centavos = scanner.nextInt();
        scanner.close();

        int m50 = 0;
        int m25 = 0;
        int m10 = 0;
        int m5 = 0;
        int m1 = 0;

        if (centavos > 50){
            m50 = centavos/50;
            centavos = centavos % 50;
        }
        if (centavos > 25){
            m25 = centavos/25;
            centavos = centavos % 25;
        }
        if (centavos > 10){
            m10 = centavos/10;
            centavos = centavos % 10;
        }
        if (centavos > 5){
            m5 = centavos/5;
            centavos = centavos % 5;
        }
        m1 = centavos;

        System.out.println("Moedas de 50 centavos: "+m50);
        System.out.println("Moedas de 25 centavos: "+m25);
        System.out.println("Moedas de 10 centavos: "+m10);
        System.out.println("Moedas de 5 centavos: "+m5);
        System.out.println("Moedas de 1 centavo: "+m1);
    }
}