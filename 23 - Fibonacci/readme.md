# 23 - Fibonacci

Os números de Fibonacci são uma sequência de números inteiros, começando por 1 e 1, em que cada termo subsequente corresponde à soma dos dois anteriores. A sequência inicia como segue:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

Escreva um pseudocódigo que ESCREVE a sequência de Fibonacci, considerando apenas os termos menores que 200. (Este algoritmo não lê nenhuma entrada.)

Dica: Você precisará de três variáveis.

## Pseudocódigo

```pseudocódigo
Variáveis
    fibonacciAtual: número
    contador: número
    contadorFinal: número
    
Início
    fibonacciAtual=0
    contador=0
    contadorFinal=200

    Enquanto (fibonacciAtual+contador<200)
        fibonacciAtual = fibonacciAtual+contador
        contador=contador+1
        Escreva fibonacciAtual
    FimEnquanto

Fim
```
