import java.util.Scanner;

public class ConversorCelsiusFarenheit {

    public static void main(String args[]){
        double tempEmC;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a temperatura em Fahrenheit: ");
        final double TEMPEMF = scanner.nextDouble();
        tempEmC = (TEMPEMF-32)/1.8;

        System.out.printf("Temperatura em Celsius: %.1f\n",tempEmC);

    }
}
