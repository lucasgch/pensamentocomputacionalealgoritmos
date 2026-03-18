import java.util.Scanner;

public class AcimaDaMedia {

    public static void main(String[] args){
        int n1, n2, n3, n4, n5;
        double media, acimaMedia = 0;

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite 5 números inteiros separados por espaço: ");
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            n3 = scanner.nextInt();
            n4 = scanner.nextInt();
            n5 = scanner.nextInt();
        }

        media = (n1 + n2 + n3 + n4 + n5) / 5.0;

        if (n1 > media) {
            acimaMedia++;
        }
        if (n2 > media) {
            acimaMedia++;
        }
        if (n3 > media) {
            acimaMedia++;
        }
        if (n4 > media) {
            acimaMedia++;
        }
        if (n5 > media) {
            acimaMedia++;
        }

        System.out.println("Média: " + media);
        System.out.println("Quantidade de números acima da média: " + (int)acimaMedia);

    }
}
