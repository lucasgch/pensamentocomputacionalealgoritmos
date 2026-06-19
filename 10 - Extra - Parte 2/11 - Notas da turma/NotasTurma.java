import java.util.Scanner;

public class NotasTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o número de alunos: ");
        int alunos = scanner.nextInt();
        System.out.print("Entre com o número de provas: ");
        int provas = scanner.nextInt();

        double mediaTurma = 0;

        for (int i=1; i<=alunos; i++){
            int somaNotas = 0;
            int qtNotas = 1;
            System.out.printf("Entre com as notas do aluno %d: ", i);
            while (qtNotas<=provas){
                somaNotas+=scanner.nextDouble();                
                qtNotas++;
            }
            double media = somaNotas/provas;
            if (media>=6){
                System.out.printf("Aluno %d aprovado com média %.2f %n", i, media);
            } else {
                System.out.printf("Aluno %d reprovado com média %.2f %n", i, media);
            }
        }
        scanner.close();
    }
}
