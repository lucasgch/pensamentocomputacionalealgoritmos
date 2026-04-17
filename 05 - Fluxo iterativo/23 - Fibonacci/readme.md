# 23 - Fibonacci

Os números de Fibonacci são uma sequência de números inteiros, começando por 1 e 1, em que cada termo subsequente corresponde à soma dos dois anteriores. A sequência inicia como segue:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

Escreva um pseudocódigo que ESCREVE a sequência de Fibonacci, considerando apenas os termos menores que 200. (Este algoritmo não lê nenhuma entrada.)

Dica: Você precisará de três variáveis.

## Pseudocódigo

```pseudocódigo
Variáveis
    n1, n2: número
    fibonacci: número
    
Início
    n1= 0
    n2= 1
    fibonacci=0


    Enquanto (fibonacci<200)
        Escreva fibonacci
        fibonacci=n1+n2
        n1=n2
        n2=fibonacci
    FimEnquanto

Fim
```

## Fluxograma

[Link para fluxograma no fluxolab](https://fluxolab.app/?lzs=NoIhBplA7BGCAMBdSJoCZEtAMwJYBGA9tAIYDG5eW2wC4AzI+vbACz1irEAuPRAWxBJsscADZm9FpzgBeBBFC9+QkZCaSGLRuM75iZSngVKQKwcOzoJU8OgAcs9HPjcifS+uBtwAdjs2DnAQAxIKKgAeGTMLIRCAJzwAcwALHitIAFZwHO16LJ1QwnDjWI9VTOBJLR1xPRD5DHLPNWwA2vo9fRKjKjk4AGpm91aqh3AJ-MmETiVvAE5bab8ijDkwvupRypFaVlZRcFhpa2P6BmxfWDEs7ByT-3bziSvjmwdsSUeF7CZHtjYJYAvZAA)

## Java

```Java
public class Fibonacci {

    public static void main(String[] args){
        int n1=0;
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
```
