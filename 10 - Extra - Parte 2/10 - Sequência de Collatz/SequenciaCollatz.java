import java.util.Scanner;

public class SequenciaCollatz{
    public static void main(String[] args){
        
        // Leitura
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o termo inicial: ");
        Integer nInicial = null;
        do{
            if (nInicial!=null){
                System.out.print("Número inválido. Informe um número inteiro entre 1 e 1000000: ");
            }
            nInicial = scanner.nextInt();
        } while(nInicial<1 || nInicial>1000000);
        scanner.close();

        long nAtual = nInicial;
        int nPassos = 0;
        System.out.printf("Sequência de Collatz: [%d",nInicial);


        while (nAtual!=1){
            
            if (nAtual>1){
                System.out.print(", ");
            } 

            // Calcula
            if ( nAtual%2==0 ){
                nAtual = nAtual/2;
            } else {
                nAtual = ( 3*nAtual ) + 1;
            }

            System.out.print(nAtual);
            
            nPassos++;
        }

        System.out.printf("]%n");
      
        System.out.printf("Número de passos: %d %n",nPassos);
    }
}