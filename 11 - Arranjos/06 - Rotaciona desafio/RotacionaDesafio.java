
import java.util.Scanner;

public class RotacionaDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com os elementos: ");
        String entrada = scanner.nextLine();
        String[] elementos = entrada.split(" ");
        
        int tamanhoDoArranjo = elementos.length;

        double[] arranjo = new double[tamanhoDoArranjo];

        for (int i = 0; i < tamanhoDoArranjo; i++) {
            arranjo[i] = Double.parseDouble(elementos[i]);
        }

        System.out.print("Entre com a rotação: ");
        int rotacao = scanner.nextInt();

        scanner.close();

        rotaciona(arranjo, rotacao);

       // inverte(arranjo, 0, 3);

        // for (double numero : arranjo) {
        //     System.out.print(numero + " ");
        // }
        // System.out.println();
    }

    static void rotaciona(double[] arranjo, int r) {

        int tamanhoDoArranjo = arranjo.length;
        int indiceFinal = tamanhoDoArranjo-1;

       // Inverte o arranjo inteiro OK
       inverte(arranjo, 0, indiceFinal);
       System.out.println("Inverte o arranho inteiro");
       imprime(arranjo);

       // Inverte os r primeiros elementos
       inverte(arranjo, 0, r-1);
       System.out.println("Inverte os "+r+" primeiros elementos");
       imprime(arranjo);

       // Inverte os n-r últimos elementos
       int indiceInicial = indiceFinal-r;
       inverte(arranjo, indiceInicial, indiceFinal);
       System.out.println("Inverte os n:"+indiceFinal+"-r:"+indiceInicial+" = "+(indiceFinal-indiceInicial)+"últimos elementos");
       imprime(arranjo);

        for (double numero : arranjo) {
            System.out.print(numero + " ");
        }
        System.out.println();

    }

    static void inverte(double[] arranjo, int inicio, int fim){
        for (int i=inicio; i<=fim; i++){
            double temp = arranjo[i];
            arranjo[i]=arranjo[fim];
            arranjo[fim]=temp;
            fim--;
        }
    }

    static void imprime(double[] arranjo){
        for (double numero : arranjo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

}
