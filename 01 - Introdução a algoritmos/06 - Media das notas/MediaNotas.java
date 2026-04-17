import java.util.Scanner;

class MediaNotas{
	public static void main(String args[]){
		double nota, media;
		System.out.println("Informe as 4 notas em números reais(ex. 1,0): ");
		try (Scanner scanner = new Scanner(System.in)){
			media = scanner.nextDouble();//Lê nota 1
			nota = scanner.nextDouble();//Lê nota 2
			media = media + nota;
			nota = scanner.nextDouble();//Lê nota 3
			media = media + nota;
			nota = scanner.nextDouble();//Lê nota 4
			media = ( media + nota )/4;
			System.out.printf("Media final: %.2f", media);
			System.out.println();
		}
	}
}
