import java.util.Scanner;

public class AnoBissexto {

    public static void main(String args[]){

        short bissexto = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um ano: ");
        int ano = scanner.nextInt();
        
        if ( ano % 4 == 0 ){
            if ( ano % 100 == 0 && ano % 400 != 0 ) {
                bissexto = 0;
            }
            else {
                bissexto = 1;
            }
        }
        System.out.println("Ano bissexto: "+bissexto);

        scanner.close();
    }
}
