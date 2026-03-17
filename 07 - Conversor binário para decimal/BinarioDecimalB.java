import java.util.Scanner;

public class BinarioDecimalB {
    public static void main(String[] args){
        int binario;
        int decimal;

        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Digite um número binário de 5 bits separados por espaço: ");
            binario = scanner.nextInt();
            decimal = (int) (binario * Math.pow(2, 4));

            binario = scanner.nextInt();
            decimal += (int) (binario * Math.pow(2, 3));

            binario = scanner.nextInt();
            decimal += (int) (binario * Math.pow(2, 2));

            binario = scanner.nextInt();
            decimal += (int) (binario * Math.pow(2, 1));

            binario = scanner.nextInt();
            decimal += (int) (binario * Math.pow(2, 0));            

            System.out.println("Valor em decimal: " + decimal);
        }
    }    
}
