import java.util.Scanner;

public class Aprovado{
    public static void main(String args[]){

        double p1, r1, p2, r2, p3, r3, frequencia, mediaDasNotas;

        double nota1, nota2, nota3;

        boolean aprovado;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com P1 e R1: ");

        p1 = scanner.nextDouble();
        r1 = scanner.nextDouble();

        System.out.print("Entre com P2 e R2: ");
        p2 = scanner.nextDouble();
        r2 = scanner.nextDouble();

        System.out.print("Entre com P3 e R3: ");
        p3 = scanner.nextDouble();
        r3 = scanner.nextDouble();

        System.out.print("Entre com a frequência (em %): ");
        frequencia = scanner.nextDouble();

        nota1 = Math.max(p1, r1);
        System.out.println("Nota1: "+nota1);
        nota2 = Math.max(p2, r2);
        System.out.println("Nota2: "+nota2);
        nota3 = Math.max(p3, r3);
        System.out.println("Nota3: "+nota3);

        mediaDasNotas = (nota1+nota2+nota3) / 3;

        int mediaArredondada = (int)(Math.round(mediaDasNotas));

        System.out.printf("Média: %.1f%n",mediaDasNotas);

        System.out.printf("Média arredondada: %d%n", mediaArredondada);

        aprovado = (mediaArredondada>=6)&&frequencia>=75;

        System.out.println("Aprovado: "+aprovado);

        scanner.close();
    }
}
