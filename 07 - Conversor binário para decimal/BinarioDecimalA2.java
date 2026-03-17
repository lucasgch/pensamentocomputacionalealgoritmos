import java.util.Scanner;

public class BinarioDecimalA2 {
    public static void main(String[] args) {
        int b4, b3, b2, b1, b0, decimal;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número binário (4 bits) separados por espaço: ");
            b4 = scanner.nextInt();
            b3 = scanner.nextInt();
            b2 = scanner.nextInt();
            b1 = scanner.nextInt();
            b0 = scanner.nextInt();
            decimal = (int) (b4 * Math.pow(2, 4) + b3 * Math.pow(2, 3) + b2 * Math.pow(2, 2) + b1 * Math.pow(2, 1) + b0 * Math.pow(2, 0));
            System.out.println("O número decimal é: " + decimal);
        }
    }
}
