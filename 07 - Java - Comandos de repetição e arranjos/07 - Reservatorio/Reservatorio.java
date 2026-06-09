import java.util.Scanner;

public class Reservatorio {

    public static void main(String[] args){

        final int CAPACIDADE_MAXIMA = 400;
        final int NUM_DIAS_SEMANA = 7;
        double chuvaAcumulada = 0;

        Scanner scanner = new Scanner(System.in);
        scanner.close();

        for (int i = 1; i <= NUM_DIAS_SEMANA; i++) {
            System.out.print("Entre com a quantidade de chuva no dia " + i + " em litros: ");
            double chuva = scanner.nextDouble();
            chuvaAcumulada += chuva;
            if (chuvaAcumulada > CAPACIDADE_MAXIMA) {
                System.out.println("O reservatório transbordou no dia " + i);
                break;
            }
        }
        System.out.println("O reservatório não transbordou. Espaço livre: "+ (CAPACIDADE_MAXIMA - chuvaAcumulada) +" litros.");

    }
    
}
