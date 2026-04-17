import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String args[]){
        double temperaturaEmFarenheit, temperaturaEmCelsius;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperaturaEmFarenheit = scanner.nextDouble();

            temperaturaEmCelsius = (temperaturaEmFarenheit - 32) * 5/9;

            System.out.println("A temperatura em Celsius é: " + temperaturaEmCelsius);
        }catch(Exception e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
