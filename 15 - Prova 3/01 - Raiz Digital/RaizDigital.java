import java.util.Scanner;

public class RaizDigital{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com um nũmero inteiro positivo: ");
        int numero = scanner.nextInt();
        scanner.close();
        int persistenciaAditiva = 0;

        while (numero/10>0) {
        
            System.out.print(numero+" -> ");
            numero = somaDigitos(numero);
            persistenciaAditiva++;
        }
        System.out.printf("%d %n",numero);
        System.out.println("Persistência aditiva: "+persistenciaAditiva);
        System.out.println("Raiz digital: "+numero);
    }

    static int somaDigitos(int n){
        String digitos = Integer.toString(n);
        int numeroDeDigitos = digitos.length();
        int somaDosDigitos = 0;
        for (int i=0; i<numeroDeDigitos; i++){
            somaDosDigitos += n % 10;
            n = n/10;
        }
        return somaDosDigitos;
    }

}