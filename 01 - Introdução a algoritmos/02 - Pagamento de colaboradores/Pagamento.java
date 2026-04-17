import java.util.Scanner;

class Pagamento{
    public static void main(String[] args) {
        double salario, pagamentoAtual, horas, total;
        total = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Salário por hora do colaborador 1, horas trabalhadas do colaborador 1");
            salario = scanner.nextDouble();
            horas = scanner.nextDouble();
            pagamentoAtual=salario*horas;
            System.out.println(pagamentoAtual);
            
            total+=pagamentoAtual;
            
            System.out.println("Salário por hora do colaborador 2, horas trabalhadas do colaborador 2");
            salario = scanner.nextDouble();
            horas = scanner.nextDouble();
            pagamentoAtual=salario*horas;
            System.out.println(pagamentoAtual);
            total+=pagamentoAtual;
            
            System.out.println("Salário por hora do colaborador 3, horas trabalhadas do colaborador 3");
            salario = scanner.nextDouble();
            horas = scanner.nextDouble();
            pagamentoAtual=salario*horas;
            System.out.println(pagamentoAtual);
            
            total+=pagamentoAtual;
            System.out.println("Total: "+ total);
        }
    }
}