import java.util.Scanner;

public class CalendarioMensal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o número de dias do mês (28, 30 ou 31): ");
        int numeroDiasNoMes = scanner.nextInt();
        scanner.close();

        System.out.print("Entre com o primeiro dia da semana (1=Dom, 7=Sab): ");
        int primeiroDiaDoMes = scanner.nextInt();
        int dia = 1;

        System.out.println("  D   S   T   Q   Q   S   S  ");
        System.out.println();

        int totalEspacos = (primeiroDiaDoMes - 1) + numeroDiasNoMes;
        
        for (int i=1; i<=totalEspacos; i++){
            if (i < primeiroDiaDoMes) {
                System.out.print("    "); // 4 espaços para alinhar com o cabeçalho
            } else {
                System.out.printf(" %2d ", dia);
                dia++;
            }
            if (i % 7 == 0) {
                System.out.println();   
            }
            
        }
        System.out.println();
    }
}
