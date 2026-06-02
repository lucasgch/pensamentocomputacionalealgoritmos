import java.util.Scanner;

class TaxaCorretagem{
    public static void main(String args[]){
        final int COMISSAOMINIMA = 39;
        double valorNegociado;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor negociado: ");

        valorNegociado = scanner.nextDouble();

        double comissaoCorretora;

        if (valorNegociado <= 2500) {
            comissaoCorretora = 30 + 0.017 * valorNegociado;
        } else if (valorNegociado <= 6250) {
            comissaoCorretora = 56 + 0.0066 * valorNegociado;
        } else if (valorNegociado <= 20000) {
            comissaoCorretora = 76 + 0.034 * valorNegociado;
        } else if (valorNegociado <= 50000) {
            comissaoCorretora = 100 + 0.0022 * valorNegociado;
        } else if (valorNegociado <= 500000) {
            comissaoCorretora = 155 + 0.0011 * valorNegociado;
        } else {
            comissaoCorretora = 255 + 0.0009 * valorNegociado;
        }

        if (comissaoCorretora<COMISSAOMINIMA){
            comissaoCorretora=39;
        }

        System.out.printf("Taxa de corretagem: $%.2f\n", comissaoCorretora);
    }
}