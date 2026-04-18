import java.util.Scanner;

public class Altura2 {

    public static void main(String args[]){

        double alturaEmMetros;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura em metros: ");
        
        alturaEmMetros = scanner.nextDouble();

        double alturaTotalEmPes = alturaEmMetros * 3.28084;
            
        double pes = Math.floor(alturaTotalEmPes);

        double sobraEmPes = alturaTotalEmPes % 1;

        double polegadas = Math.round(sobraEmPes * 12);
        
        System.out.printf("Altura pés e polegadas: %d %d%n" , (int) pes, (int) polegadas);

        scanner.close();

    }
}
