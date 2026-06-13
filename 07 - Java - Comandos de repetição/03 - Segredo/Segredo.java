import java.util.Random;
import java.util.Scanner;

public class Segredo {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int segredo = new Random().nextInt(1, 101);
        System.out.println("Bem-vindo ao jogo do segredo!");
        int palpite = 0;
        int tentativas = 0;
        do{
            tentativas++;
            System.out.print("Entre com seu palpite (1 a 100): ");
            palpite = scanner.nextInt();
            if (palpite < segredo) {
                System.out.println("O segredo é maior");
            } else if (palpite > segredo) {
                System.out.println("O segredo é menor");
            }
        } while ( palpite != segredo );

        scanner.close();
        System.out.println("Parabéns, você acertou em " + tentativas + " tentativas!");
    }

}
