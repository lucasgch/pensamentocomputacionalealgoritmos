import java.util.Scanner;

public class Rpg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.print("Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): ");

        int classe = scanner.nextInt();

        
        
        switch (classe) {
            case 1 -> {
                System.out.print("Entre com a vitalidade desejada: ");
                int vitalidadeDesejada = scanner.nextInt();
                int nivelMinimo = nivelMinimo(150, 10, vitalidadeDesejada);
                System.out.println("Nível necessário: "+nivelMinimo);
            }
            case 2 ->{
                System.out.print("Entre com a vitalidade desejada: ");
                int vitalidadeDesejada = scanner.nextInt();
                int nivelMinimo = nivelMinimo(200, 15, vitalidadeDesejada);
                System.out.println("Nível necessário: "+nivelMinimo);
            }
            case 3, 4 ->{
                System.out.print("Entre com a vitalidade desejada: ");
                int vitalidadeDesejada = scanner.nextInt();
                int nivelMinimo = nivelMinimo(100, 5, vitalidadeDesejada);
                System.out.println("Nível necessário: "+nivelMinimo);
            }
            default -> System.out.println("Classe inválida!");
        }
        
        scanner.close();       
    }
    
    static int nivelMinimo(int v0, int inc, int v){
        int nivelMinimo = 0;
        
        while (v0<v){

            nivelMinimo++;
            
            if (nivelMinimo%5==0){
                v0+=inc*2;
            } else {
                v0+=inc;
            }
            
        }
        return nivelMinimo;
    }
}
