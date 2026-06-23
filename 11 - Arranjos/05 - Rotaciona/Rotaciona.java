
import java.util.Scanner;

public class Rotaciona {

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

    }

    static void rotaciona(double[] arranjo, int r) {

        int tamanhoDoArranjo = arranjo.length;

        double[] arranjoRotacionado = new double[tamanhoDoArranjo];

        int indiceRotacionado;

        for (int i = 0; i < tamanhoDoArranjo; i++) {

            indiceRotacionado = (i + r) % tamanhoDoArranjo;

            // Caso a rotação seja negativa, -2 deve ser igual a tamanho do array - 2, pra isso, soma-se o tamanho do array ao índice calculado
            if (indiceRotacionado < 0) {
                indiceRotacionado += tamanhoDoArranjo;
            }

            arranjoRotacionado[indiceRotacionado] = arranjo[i];
        }

        imprime(arranjoRotacionado);

    }

    static void imprime(double[] arranjo){
        for (double numero : arranjo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

}
