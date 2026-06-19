import java.util.Scanner;

public class TrianguloFloyd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o número de linhas: ");
        int linhas = scanner.nextInt();
        scanner.close();

        int numeroAtual = 1;
        
        System.out.println();

        for (int i=1; i<=linhas; i++){
            
            for (int j=1; j<=i; j++){
                System.out.printf("%4d", numeroAtual);
                numeroAtual++;
            }
            
            
            System.out.println();
        }
        
        System.out.println();
    }

}
