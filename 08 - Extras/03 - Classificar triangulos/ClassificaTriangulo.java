import java.util.Scanner;

public class ClassificaTriangulo {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        System.out.println("Entre com os lados do triângulo: ");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                // Se todos iguais.
                System.out.println("Triangulo equilátero");
            } else if (a == b || a == c || b == c) {
                // Se não, se 2 iguais
                System.out.println("Triangulo isósceles");
            } else {
                // Se nenhum é igual aos outros.
                System.out.println("Triangulo escaleno");
            }
        }
        else {
            System.out.println("Triangulo Inválido!");
        }
        scanner.close();
    }
}