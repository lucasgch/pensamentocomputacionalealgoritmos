import java.util.Scanner;

public class EsquadraoDegrau {
    public static void main(String[] args){
        System.out.print("Entre com um inteiro positivo: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (ehDegrau(n)){
            System.out.println("É membro do Esquadrão do Degrau");
        }
        else{
            System.out.println("Não é membro do Esquadrão do Degrau");
        }
    }

    static boolean ehDegrau(int n){
        int contador = 1;
        int degrau = 0;
        while (degrau < n){
            degrau += contador;
            contador++;
        }
        return (degrau==n);
    }
}