import java.util.Scanner;

public class ConversaoDeAlturaA {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe pés e polegadas separado por um espaço: ");
            double pes = scanner.nextDouble();
            double polegadas = scanner.nextDouble();
            
            double alturaEmMetros = ( ((pes * 12)*2.54) + polegadas*2.54) /100;
            System.out.printf("Altura em metros: %.2f%n", alturaEmMetros);
        }
    }
}
