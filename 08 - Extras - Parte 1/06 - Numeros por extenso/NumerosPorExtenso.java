import java.util.Scanner;

public class NumerosPorExtenso{

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        String resultado = "";

        System.out.print("Entre com um inteiro de 1 a 99: ");
        numero = scanner.nextInt();

        scanner.close();

        int dezena = numero / 10;
        int unidade = numero % 10;

        if ( dezena == 1 ){
            resultado += switch (unidade) {
                case 0 -> "dez";
                case 1 -> "onze";
                case 2 -> "doze";
                case 3 -> "treze";
                case 4 -> "quatorze";
                case 5 -> "quinze";
                case 6 -> "desesseis";
                case 7 -> "desessete";
                case 8 -> "dezoito";
                case 9 -> "dezenove";
                default -> "";
            };
        } else if (dezena==0 && unidade==0){
            resultado = "zero";
        } else {
            resultado = switch (dezena) {
                case 2 -> "vinte";
                case 3 -> "trinta";
                case 4 -> "quarenta";
                case 5 -> "cinquenta";
                case 6 -> "sessenta";
                case 7 -> "setenta";
                case 8 -> "oitenta";
                case 9 -> "noventa";
                default -> "";
            };

            if (dezena >= 2 && unidade > 0) {
                resultado += " e ";
            }

            resultado += switch (unidade) {
                case 1 -> "um";
                case 2 -> "dois";
                case 3 -> "três";
                case 4 -> "quatro";
                case 5 -> "cinco";
                case 6 -> "seis";
                case 7 -> "sete";
                case 8 -> "oito";
                case 9 -> "nove";
                default -> "";
            };
        }

        System.out.println(resultado);
    }
}