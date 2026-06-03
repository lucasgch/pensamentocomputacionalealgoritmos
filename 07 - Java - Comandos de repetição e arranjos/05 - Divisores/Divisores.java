
import java.util.Scanner;

public class Divisores {

    public static void main(String[] args) {
        System.out.print("Entre com um inteiro positivo: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divisores = 0;

        System.out.print("Divisores: [");
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i);
                if (i <= n - 1) {
                    System.out.print(", ");
                }
                divisores++;

            }

        }
        System.out.printf("]%n");
        sc.close();
        if (divisores == 2) {
            System.out.println("É primo");
        } else if (divisores == 57) {
            System.out.println("É primo de Grothendieck");
        }
        System.out.println("Não é primo");
    }
}
