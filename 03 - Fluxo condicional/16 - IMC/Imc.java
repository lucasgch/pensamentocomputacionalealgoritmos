import java.util.Scanner;

public class Imc {

    public static void main(String[] args){
        double altura, peso;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite sua altura em metros:");
            altura = scanner.nextDouble();
            System.out.println("Digite seu peso em kg:");
            peso = scanner.nextDouble();
        }
        catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira números válidos para altura e peso.");
            return;
        }
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if(imc < 24.9){
            System.out.println("Peso normal - Eutrofia");
        } else if(imc < 29){
            System.out.println("Sobrepeso");
        } else if(imc < 34.9) {
            System.out.println("Obesidade grau I");
        }
        else if(imc < 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }
        
    }
}
