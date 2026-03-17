import java.util.Scanner;

public class CalcularMoedas {
    public static void main(String[] args){
        int n, m50, m25, m10, m5, m1;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe um número inteiro que representa o valor em centavos: ");
            n = scanner.nextInt();
            m50 = (int) (n / 50);
            n = n % 50;
            m25 = (int) (n / 25);
            n = n % 25;
            m10 = (int) (n / 10);
            n = n % 10;
            m5 = (int) (n / 5);
            n = n % 5;
            m1 = (int) (n / 1);
            System.out.println(m50 + " " + m25 + " " + m10 + " " + m5 + " " + m1);
        }
    }
}
