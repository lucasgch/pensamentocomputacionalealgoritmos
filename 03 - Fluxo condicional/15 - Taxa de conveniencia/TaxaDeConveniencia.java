import java.util.Scanner;

class TaxaDeConveniencia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o valor do ingresso: ");
            double valorIngresso = scanner.nextDouble();
            double taxaConveniencia;
            double valorTotal;

            if (valorIngresso <= 100) {
                taxaConveniencia = 8 + (5.0/100)*valorIngresso;
            }
            else {
                taxaConveniencia = 11 + (2.0/100)*valorIngresso;
            }

            if (taxaConveniencia <  10) {
                taxaConveniencia = 10;
            }

            valorTotal = valorIngresso + taxaConveniencia;
            
            System.out.println("Valor do ingresso: R$ " + valorIngresso);

            System.out.println("Taxa de conveniência: " + taxaConveniencia);   
            
            System.out.println("Valor total a pagar: R$ " + valorTotal);
        }        
    }
}