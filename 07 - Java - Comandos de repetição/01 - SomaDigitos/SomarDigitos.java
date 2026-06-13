import java.util.Scanner;

public class SomarDigitos{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com um inteiro não-negativo: ");
        int numero = scanner.nextInt();
        scanner.close();
        int resultado = somaDigitos(numero);
        System.out.println("A soma dos dígitos de " + numero + " é: " + resultado);
    }

    static int somaDigitos(int n){
        int soma = 0;
        while (n > 0) {
            soma += n % 10; // Adiciona o último dígito à soma
            n /= 10; // Remove o último dígito
        }
        return soma;
    }
    
}