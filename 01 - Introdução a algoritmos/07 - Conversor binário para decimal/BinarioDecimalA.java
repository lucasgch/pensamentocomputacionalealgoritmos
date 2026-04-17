import java.util.Scanner;

class BinarioDecimalA{
	public static void main(String args[]){
		int b4, b3, b2, b1, b0, decimal;

		try(Scanner scanner = new Scanner(System.in)){
			System.out.print("Digite um número binário de 5 bits separando cada bit por espaço: ");
			b4 = scanner.nextInt();
			decimal = (int) (b4 * Math.pow(2, 4));
			b3 = scanner.nextInt();
			decimal += b3 * Math.pow(2, 3);
			b2 = scanner.nextInt();
			decimal += b2 * Math.pow(2, 2);
			b1 = scanner.nextInt();
			decimal += b1 * 2;
			b0 = scanner.nextInt();
			decimal += b0;

			System.out.println("Valor em decimal: "+decimal);
		}
	}
}
