
import java.util.Scanner;

public class AvaliaAluno {

    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            
            System.out.println("Digite as notas do aluno: ");
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double nota3 = scanner.nextDouble();
            
            double recuperacao1;
            double recuperacao2;
            double recuperacao3;

            System.out.println("Digite as recuperações: ");
            recuperacao1 = scanner.nextDouble();
            recuperacao2 = scanner.nextDouble();
            recuperacao3 = scanner.nextDouble();

            System.out.println("Informe a frequência: ");
            int frequencia = scanner.nextInt();

            if (frequencia < 75) {
                System.out.println("Reprovado por falta");
            }
            else {

                if(nota1 < recuperacao1){
                    nota1 = recuperacao1;
                }
                if(nota2 < recuperacao2){
                    nota2 = recuperacao2;
                }
                if(nota3 < recuperacao3){
                    nota3 = recuperacao3;
                }

                double media = Math.round((nota1 + nota2 + nota3) / 3)*10;               
                
                System.out.println("Média do aluno: " + media);
                System.out.println(media >= 60 ? "Aprovado" : "Reprovado");
            }
        }
    }
}
