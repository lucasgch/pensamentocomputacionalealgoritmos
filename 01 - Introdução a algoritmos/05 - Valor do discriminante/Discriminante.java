import java.util.Scanner;

class Discriminante{
	public static void main(String args[]){
        try (Scanner scanner = new Scanner(System.in)) {
            double a, b, c, delta;
            System.out.print("Informe o valor de a, b e c: ");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            delta = b*b - 4*a*c;
            System.out.println((int)delta);
        }
	}
}
