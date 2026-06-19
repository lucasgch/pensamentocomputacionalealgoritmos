import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com dois inteiros positivos: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();

        System.out.printf("Os números %d e %d", a, b);
        if (!sao_amigos(a, b)){
            System.out.print(" não");
        }
        System.out.println(" são amigos");
    }
    public static int soma_divisores(int n){
        int somaDivisores = 0;
        for (int i=1; i<n; i++){
            if (n%i==0){
                somaDivisores+=i;
            }
        }
        return somaDivisores;
    }

    public static boolean sao_amigos(int a, int b){
        int somaA = soma_divisores(a);
        int somaB = soma_divisores(b);
        return somaA==b && somaB == a;
    }

    
}
