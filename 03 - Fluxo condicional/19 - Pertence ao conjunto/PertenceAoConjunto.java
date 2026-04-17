import java.util.Scanner;

public class PertenceAoConjunto {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Informe os valores de n1 n2 n3 n4 separado por espaço: ");
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            int n4 = scanner.nextInt();
            System.out.print("Informe o valor de x: ");
            int x = scanner.nextInt();

            boolean pertenceAA = (x>= n1 && x <= n2);
            boolean pertenceAB = (x>= n3 && x <= n4);

            if (pertenceAA && pertenceAB) {
                System.out.println("Pertence ao conjunto A e ao conjunto B");
            } else if (pertenceAA) {
                System.out.println("Pertence ao conjunto A");
            } else if (pertenceAB) {
                System.out.println("Pertence ao conjunto B");
            } else {
                System.out.println("Não pertence a nenhum dos conjuntos");
            }

        }
    }
}