import java.util.Scanner;

class AnoBissexto{

    public static void main(String args[]){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Informe o ano: ");
            int ano = scanner.nextInt();
            boolean bissexto = (ano % 4 == 0) && ( (ano % 100 !=0 ) || (ano % 400 == 0));
            System.out.println("Ano bissexto: " + bissexto);
        }
    }
}