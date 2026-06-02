import java.util.Scanner;

public class Divisores {    

    public static void main(String[] args){
        System.out.print("Entre com um inteiro positivo: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print("Divisores [");
        for (int i=1; i<=n; i++){
                
            if (n % i == 0){
                System.out.print(i);
                System.out.print(", ");                
            }
        
        }
            System.out.printf("]%n");
        sc.close();
    }

}
