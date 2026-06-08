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
            System.out.printf("Entre com as notas do aluno %d: ", i);
            somaNotas+=scanner.nextDouble();
        }
    }
}
