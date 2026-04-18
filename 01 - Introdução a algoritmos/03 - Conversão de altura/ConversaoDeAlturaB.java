import java.util.Scanner;

public class ConversaoDeAlturaB {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Informe a altura em metros: ");
            double alturaEmMetros = scanner.nextDouble();

            double alturaTotalEmPes = alturaEmMetros * 3.28084;
            
            double pes = Math.floor(alturaTotalEmPes);

            double sobraEmPes = alturaTotalEmPes % 1;

            double polegadas = Math.round(sobraEmPes * 12);

            System.out.printf("Altura pés e polegadas: %d %d%n" , (int) pes, (int) polegadas);
            
            scanner.close();
        }
    }
}
