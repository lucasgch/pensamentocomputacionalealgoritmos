import java.util.Scanner;

public class ControleAcesso {

    public static void main(String[] args) {
        final int SENHACORRETA = 314159;
        final int MAXTENTATIVAS = 3;
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int senha;
        do{
            if (tentativas > 0) {
                System.out.println("Acesso negado (senha incorreta)");
            }
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();
            tentativas++;
        } while (senha != SENHACORRETA && tentativas < MAXTENTATIVAS );
        if (senha == SENHACORRETA) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Sistema bloqueado");
        }
        
        scanner.close();
    }
    
}
