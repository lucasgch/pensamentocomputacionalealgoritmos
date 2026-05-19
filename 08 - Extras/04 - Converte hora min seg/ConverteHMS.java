import java.util.Scanner;

public class ConverteHMS {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a quantidade de segundos: ");

        int segundos = scanner.nextInt();

        int horas = segundos / 3600;

        int minutos = ( segundos % 3600 ) / 60 ;

        int segundosSobra =  ( segundos % 3600 ) % 60;

        System.out.println(horas+" horas, "+minutos+" minutos, "+segundosSobra+" segundos");
        
        scanner.close();
    }
}
