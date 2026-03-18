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
