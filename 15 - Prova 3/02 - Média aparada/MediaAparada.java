//import java.util.Arrays;

public class MediaAparada {

    public static void main(String[] args) {
        
        double[]  a = {100, 10, 11, 12, 14};        
        IO.println(calculaMediaAparada(a,2));
        double[] b = {1, 9, 5, 5};
        IO.println(calculaMediaAparada(b,1));
        double[] c = {9.5, 3.0, 4.5, 7.0};
        IO.println(calculaMediaAparada(c,0));
    }
    
    static double calculaMedia(double[] arranjo){
        double soma = 0;
        int tamanhoDoArranjo = arranjo.length;

        for (int i=0; i<tamanhoDoArranjo; i++){
            soma+=arranjo[i];
        }
        double mediaAritimetica = soma/tamanhoDoArranjo;
        return mediaAritimetica;
    }

    static int encontraIndiceMaisDistante(double[] arranjo){
        double mediaAritimetica = calculaMedia(arranjo);
        int tamanhoDoArranjo = arranjo.length;
        double maisDistante = 0;
        int indiceMaisDistante = 0;

        for (int i=0; i<tamanhoDoArranjo; i++){
            double atual = arranjo[i]-mediaAritimetica;
            
            if ( atual>maisDistante ){
                maisDistante=atual;
                indiceMaisDistante=i;
            }
        }

        return indiceMaisDistante;
    }
    
    static double[] removeElemento(double[] arranjo, int indice){
        double[] copia = new double[arranjo.length-1];
        int j=0;
        for (int i=0; i<arranjo.length; i++){

            if (i!=indice){
                copia[j]=arranjo[i];
                j++;                
            }
            
        }

        return copia;
    }

    static double calculaMediaAparada(double[] arranjo, int m){
        double mediaAparada = 0;
        int indiceMaisDistante;
        if (m==0){
            mediaAparada = calculaMedia(arranjo);
            return mediaAparada;    
        }
        for (int i=1; i<=m; i++){
            indiceMaisDistante = encontraIndiceMaisDistante(arranjo);
            arranjo = removeElemento(arranjo, indiceMaisDistante);
            mediaAparada = calculaMedia(arranjo);
        }
        
        return mediaAparada;
    }
    
}
