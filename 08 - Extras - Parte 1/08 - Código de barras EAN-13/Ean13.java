import java.util.Scanner;

public class Ean13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a primeira parte (1 dígito): ");
        String entrada = scanner.nextLine();

        System.out.print("Entre com a segunda parte (6 dígitos): ");
        entrada += scanner.nextLine();

        System.out.print("Entre com a terceira parte, sem o dígito verificador (5 dígitos): ");
        entrada += scanner.nextLine();

        scanner.close();

        // Posições ÍMPARES (1, 3, 5, 7, 9, 11) Índices da string: 0, 2, 4, 6, 8, 10
        int somaImpares = Character.getNumericValue(entrada.charAt(1-1))
                + Character.getNumericValue(entrada.charAt(3-1))
                + Character.getNumericValue(entrada.charAt(5-1))
                + Character.getNumericValue(entrada.charAt(7-1))
                + Character.getNumericValue(entrada.charAt(9-1))
                + Character.getNumericValue(entrada.charAt(11-1));

        // Posições PARES (2, 4, 6, 8, 10, 12) Índices da string: 1, 3, 5, 7, 9, 11
        int somaPares = Character.getNumericValue(entrada.charAt(2-1))
                + Character.getNumericValue(entrada.charAt(4-1))
                + Character.getNumericValue(entrada.charAt(6-1))
                + Character.getNumericValue(entrada.charAt(8-1))
                + Character.getNumericValue(entrada.charAt(10-1))
                + Character.getNumericValue(entrada.charAt(12-1));

        int somaTotal = ( somaImpares + (somaPares*3)  ) - 1;

        int digitoVerificador = 9 - ( somaTotal % 10 ) ;

        System.out.println("Dígito verificador: "+digitoVerificador);

    }
}