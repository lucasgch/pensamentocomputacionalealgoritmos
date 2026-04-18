import java.util.Scanner;

public class Altura1 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        double pes, polegadas, alturaEmPolegadas, alturaEmMetros,alturaEmCM;
        System.out.print("Informe a altura em pés polegadas: ");
        pes = scanner.nextDouble();
        polegadas = scanner.nextDouble();

        alturaEmPolegadas = polegadas + pes*12;
        
        alturaEmCM =  alturaEmPolegadas*2.54;
        
        alturaEmMetros = alturaEmCM / 100;

        System.out.printf("Altura em metros: %.2f%n", alturaEmMetros);

        scanner.close();

    }
    
}
