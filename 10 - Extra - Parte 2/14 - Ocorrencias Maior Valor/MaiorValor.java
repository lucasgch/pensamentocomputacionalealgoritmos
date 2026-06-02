import java.util.Scanner;

public class MaiorValor {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com inteiros positivos. Entre com 0 ou um inteiro negativo para terminar.");
        int entrada = 0;
        int maior = 0;
        int ocorrenciasIguaisOuMaior = 0;

        do{
            entrada = scanner.nextInt();
            if (entrada > maior){
                maior = entrada;
                ocorrenciasIguaisOuMaior = 1;
            }
            else if (entrada == maior){
                ocorrenciasIguaisOuMaior++;
            }

        } while (entrada > 0);

        System.out.println("O maior inteiro foi " + maior  + " e ele ocorreu " + ocorrenciasIguaisOuMaior + " vezes.");
        
        scanner.close();
    }

}
