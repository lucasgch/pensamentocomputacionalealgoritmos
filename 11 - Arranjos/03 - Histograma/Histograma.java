import java.util.Random;
import java.util.Scanner;

public class Histograma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // Criado apenas UMA vez

        System.out.print("Entre com o número de rolagens: ");
        int rolagens = sc.nextInt();        
        sc.close();

        // Frequências dos resultados de 2 a 12.
        int[] frequencias = new int[13];

        // Simula as reolagens uma única vez
        for (int i = 0; i < rolagens; i++) {

            // Simula dados 1 e 2
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int soma = dado1 + dado2;

            // Incrementa a frequencia respectiva do resultado
            frequencias[soma]++;
        }

        // 2. Imprime os resultados calculando o percentual, partindo de 2, pois 0 e 1 não são possíveis considerando os dois dados
        for (int j = 2; j <= 12; j++) {

            // Conversão para double necessária para a divisão não virar zero
            double percentual = ((double) frequencias[j] / rolagens) * 100;
            
            System.out.printf("%2d : %5.2f%% %n", j, percentual);
        }
    }
}