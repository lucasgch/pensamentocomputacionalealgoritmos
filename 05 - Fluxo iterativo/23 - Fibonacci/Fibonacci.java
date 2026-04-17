public class Fibonacci {

    public static void main(String[] args){
        int n1;
        int n2=1;
        int fibonacci=0;

        while(fibonacci <= 200){
            System.out.println(fibonacci);
            n1 = n2;
            n2 = fibonacci;
            fibonacci = n1 + n2;
        }
    }

}
