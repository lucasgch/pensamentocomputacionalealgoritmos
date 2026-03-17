import java.util.Scanner;

public class ClassificaTriangulo {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite os lados do triângulo: ");
            double lado1 = scanner.nextDouble();
            double lado2 = scanner.nextDouble();
            double lado3 = scanner.nextDouble();

            if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
                System.out.println("Os lados não formam um triângulo.");
            } else if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        }
        catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira números válidos para os lados do triângulo.");
        }
    }
}
