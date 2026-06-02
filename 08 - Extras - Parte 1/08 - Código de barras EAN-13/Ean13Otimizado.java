import java.util.Scanner;

public class Ean13Otimizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a primeira parte (1 dígito): ");
        long parte1 = scanner.nextLong();

        System.out.print("Entre com a segunda parte (6 dígitos): ");
        long parte2 = scanner.nextLong();

        System.out.print("Entre com a terceira parte, sem o dígito verificador (5 dígitos): ");
        long parte3 = scanner.nextLong();

        scanner.close();

        // Junta tudo matematicamente em um único número de 12 dígitos
        // Exemplo: 7 (parte1) + 891234 (parte2) + 56789 (parte3) -> 789123456789
        long codigoCompleto = (parte1 * 100000000000L) + (parte2 * 100000L) + parte3;

        // Nota: O multiplicador da parte1 corrige eventuais zeros à esquerda da parte2 se fossem strings,
        // mas o ideal e mais seguro para o usuário é digitar o número completo de uma vez:
        // System.out.print("Digite os 12 dígitos do EAN: ");
        // long codigoCompleto = scanner.nextLong();

        int somaImpares = 0;
        int somaPares = 0;

        for (int i = 12; i >= 1; i--) {
            int digito = (int) (codigoCompleto % 10); // Pega o último dígito
            codigoCompleto /= 10;                     // Remove o último dígito do número

            if (i % 2 == 0) {
                somaPares += digito;
            } else {
                somaImpares += digito;
            }
        }

        int somaTotal = ( somaImpares + (somaPares*3)  ) - 1;
        int digitoVerificador = 9 - ( somaTotal % 10 ) ;

        System.out.println("Dígito verificador calculado: " + digitoVerificador);
    }
}