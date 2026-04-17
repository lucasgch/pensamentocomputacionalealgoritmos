import java.util.Scanner;

public class CaixasDePapelao {//ok

    public static void main(String[] args) {
        double area;
        double volume;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe as três dimensões da caixa de papelão (comprimento, largura e altura): ");
            double comprimento = scanner.nextDouble();
            double largura = scanner.nextDouble();
            double altura = scanner.nextDouble();
            
            area = 2* (comprimento * largura + comprimento * altura + largura * altura);
            volume = comprimento * largura * altura;
            
            System.out.println("Área da caixa: " + area);
            System.out.println("Volume da caixa: " + volume);
            
            System.out.println("Informe um número inteiro representando a quantidade de caixas produzidas");
            int quantidade = scanner.nextInt();
            
            System.out.println("Informe um número real representando o custo do metro quadrado");
            double custo = scanner.nextDouble();
            
            System.out.printf("Custo total: %.2f%n", (area * quantidade * custo));
        }
    }
}
