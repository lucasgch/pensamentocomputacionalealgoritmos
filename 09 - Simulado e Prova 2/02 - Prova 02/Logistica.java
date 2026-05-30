import java.util.Scanner;

public class Logistica {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre coma região (S/SE/CO, peso (kg) e prazo (1/3/7): ");
        String regiao = scanner.next();
        double peso = scanner.nextDouble();
        int prazo = scanner.nextInt();

        scanner.close();

        System.out.printf("Valor total: R$%.2f\n",calculaFrete(regiao, peso, prazo));
        
    }

    static double obtemPrecoBase(String regiao){
        double precoBase = switch (regiao) {
            case "S"  -> 60.0;
            case "SE" -> 50.0;
            case "CO" -> 80.0;
            default -> throw new RuntimeException("Região Inválida");
        };
        return precoBase;
    }

    static double calculaAdicional(double peso){

        double adicional;

        if (peso<=0){
            throw new RuntimeException("Peso inválido");
        } else if (peso<=0.5){
            adicional = 0;
        } else if (peso <=2){
            adicional = 15.0;
        } else if (peso<=10){
            adicional = 25.0;
        } else {
            double gramaAdicional = (peso - 10) * 1000;
            System.out.println("Peso adicional: " + gramaAdicional);
            adicional = 50 + ( gramaAdicional * 0.01 );
            System.out.println("Valor adicional: " + adicional);
        }

        return adicional;
    }

    static double aplicaPrazo(double fretePadrao, int tipoPrazoEntrega){
        // Retorna o valor do frete já considerando o prazo de entrega
        double precoComPrazo = switch (tipoPrazoEntrega){
            case 1 -> fretePadrao*2;
            case 3 -> fretePadrao;
            case 7 -> fretePadrao-(fretePadrao*15/100);
            default -> throw new RuntimeException("Prazo inválido");
        };
        return precoComPrazo;
    }

    static double calculaFrete(String regiao, double peso, int tipoPrazoEntrega){
        double valorFinalFrete = 0;
        
        // Obtém o preço base
        double precoBase = obtemPrecoBase(regiao);
        valorFinalFrete+=precoBase;

        // Calcula o adicional
        double adicional = calculaAdicional(peso);
        
        valorFinalFrete+=adicional;

        // Adiciona o valor de prazo
        double valorFreteComPrazo = aplicaPrazo(valorFinalFrete, tipoPrazoEntrega);
        valorFinalFrete= valorFreteComPrazo;
        
        // Retorna o valor final com o frete calculado
        return valorFinalFrete;
    }
}
