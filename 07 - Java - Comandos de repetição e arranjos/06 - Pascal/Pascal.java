import java.util.Scanner;
public class Pascal {

     public static void main(String[] args){
        System.out.print("Entre com n máximo: ");
        Scanner sc = new Scanner(System.in);
        int nMaximo = sc.nextInt();
        sc.close();
        
        imprimePascal(nMaximo);

    }
    
    // Método auxiliar para calcular o fatorial
    public static int calcularFatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // 
    static int potenciaFatorial(int base, int expoente) {
        int resultado = 1;
        
        // Multiplica a base decrementando-a passo a passo por 'expoente' vezes
        for (int i = 0; i < expoente; i++) {
            resultado *= (base - i);
        }
        
        return resultado;
    }

    static int coeficienteBinomial(int n, int k) {
        // Caso base conceitual: C(n, 0) é sempre 1
        if (k == 0) return 1; 
        
        return potenciaFatorial(n, k) / potenciaFatorial(k, k);
    }

    static void imprimePascal(int nMax){
        for (int i=0; i<=nMax; i++){
            for (int j=0; j<=i; j++){
                System.out.print(coeficienteBinomial(i, j)+" ");
            }
            System.out.println();
        }
    }
    
    
}
