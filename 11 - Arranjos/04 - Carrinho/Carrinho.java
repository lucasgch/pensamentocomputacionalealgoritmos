import java.util.Scanner;
public class Carrinho {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o número de itens: ");
        int numeroItens = sc.nextInt();

        int[] quantidades = new int[numeroItens];
        double[] precos = new double[numeroItens];

        for (int i = 0; i<numeroItens; i++){
            System.out.print("Quantidade do item " + (i+1) + ": ");
            quantidades[i] = sc.nextInt();
            System.out.print("Preço unitário do item " + (i+1) + ": ");
            precos[i] = sc.nextDouble();
        }

        double[] subtotais = calculaSubtotais(quantidades, precos);
        double somaTotal = obtemSomaTotal(subtotais, 0.1);

        System.out.printf("Total: R$ %.2f\n", somaTotal);

    }

    // Recebe arranjos de quantidades e retorna um arranjo de subtotais de cada item
    static double[] calculaSubtotais(int[] quantidades, double[] precos){
        double[] subtotais = new double[quantidades.length];
        for (int i = 0; i < quantidades.length; i++){
            subtotais[i] = quantidades[i] * precos[i];
        }
        return subtotais;

    }

    // Retorna a soma total com o desconto aplicado
    static double obtemSomaTotal(double[] valores, double desconto){
        double soma = 0;
        for (int i = 0; i < valores.length; i++){
            soma += valores[i];            
        }
        return soma - (soma * desconto);
    }
    
}
