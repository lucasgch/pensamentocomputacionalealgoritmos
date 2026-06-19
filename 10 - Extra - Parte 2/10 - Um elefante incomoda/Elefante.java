
public class Elefante {

    public static void main(String[] args) {
        final int TOTAL = 10;
        
        for (int i=1; i<=TOTAL; i++){
            numeroPorExtenso(i);
            if (i==1){                
                System.out.println(" elefante incomoda muita gente.");
            } else if (i%2==0){
                int repeticoes = 1;
                System.out.print(" elefantes ");
                do{
                    System.out.print("incomodam");
                    if (repeticoes!=i){
                        System.out.print(", ");
                    }
                    repeticoes++;
                } while(repeticoes<=i);
                System.out.print(" muito mais!");
                System.out.println();
            } else {
                System.out.println(" elefantes incomodam muita gente.");
            }
            
        }
    }

    public static void numeroPorExtenso(int n){
        switch (n){
            case 1 -> System.out.print("Um");
            case 2 -> System.out.print("Dois");
            case 3 -> System.out.print("Três");
            case 4 -> System.out.print("Quatro");
            case 5 -> System.out.print("Cinco");
            case 6 -> System.out.print("Seis");
            case 7 -> System.out.print("Sete");
            case 8 -> System.out.print("Oito");
            case 9 -> System.out.print("Nove");
            case 10 -> System.out.print("Dez");
        }
    }
    
}
