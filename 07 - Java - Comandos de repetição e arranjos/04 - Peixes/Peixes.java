import java.util.Scanner;
public class Peixes {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o pH mínimo: ");
        double phMinimo = sc.nextDouble();

        System.out.print("Entre com o pH máximo: ");
        double phMaximo = sc.nextDouble();

        System.out.print("Entre com o número de medições: ");
        int numMedicoes = sc.nextInt();

        int foraDaFaixa = 0;

        for (int i=1; i<=numMedicoes; i++){
            System.out.print("Entre com a medição " + i + ": ");
            double phMedicao = sc.nextDouble();

            if (phMedicao <= phMinimo || phMedicao >= phMaximo){
                foraDaFaixa++;
            }
        }
        sc.close();
        System.out.println("Número de medições fora da faixa: " + foraDaFaixa);
    }

}
