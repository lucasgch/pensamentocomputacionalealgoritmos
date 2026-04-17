# Exercício em sala: Quantidade e soma de dígitos

(a) Elabore um fluxograma para um algoritmo que LÊ um inteiro positivo e ´ESCREVE´ a quantidade de dígitos do número lido. Utilize repetição com teste lógico no fim. Em seguida, efetue um teste de mesa com a entrada 1729; a saída deve ser 4. Dica: Utilize o operador de divisão inteira.

(b) Modifique o algoritmo anterior para que, no lugar da quantidade de dígitos, seja ESCRITA a soma dos dígitos do número lido. Em seguida, efetue um teste de mesa com a entrada 1729; a saída deve ser 19.

Dica: Além do operador de divisão inteira, utilize o operador de resto da divisão.

## Fluxograma A

[Link para fluxograma no fluxolab](https://fluxolab.app/?lzs=NoIhBplA7BGCAMBdSIAmBLA5hgLgewGdEVQA3AQwCd5xlTgFwBmcAJjadk-DFQCN8uAgFsQSUrHAAWdjzYAOJiDgRQg4fjETIbcADY5TZkt5wAvHAAEmMldgI1IDaPGlWAdiPgArDxWwVgB8Vo4CQq68VNgAFrhukLKGHEycypg4BITmYeoRWgnAPgbe0tLp2HhE5hlVhADUtHma2qSGxSkG-rVZTi4FOsBeCt4eCMpqEgxcTNKksg7gsJJLqaR6iz6kxYvM7ktSbPvcBm2r4B5TQA)

## Pseudocódigo A

```pseudocódigo
Variáveis
    n1, digitos: número
    
Início
    digitos = 0
    Leia n1

    Faça
        n1 = n1 div 10
        digitos = digitos + 1
    enquanto n1>0

    Escreva digitos    

Fim
```

## Fluxograma B

[Fluxograma B no fluxolab](https://fluxolab.app/?lzs=NoIhBplA7BGCAMBdSIAmBLA5hgLgewGdEVRD8BbAQxNOAXAGZwAmFhgNgbFQCN9cBCiCSlY4ACyt2rABzc4EUP0GURpFuA7SGEhAtgBeOAAJMANxOwESkCqHrIzAOw7wAVhkhTAPhM2+AQdwEAAnbAALXEdgKW02BlgvTBwCQkMA5SC1UUh3LTcJLhCUvCJDUrSAanhA1WFc4G18hK1k7DLiOodG11k3eW4lRv74mXZucmoM23sc0gBOAtbGPRCpqkMNqpMAClMKfDQrBABKWeyGsQYWmWd9dcoabvm6RN0NcGsPUnzvxlIzCSWlIUm+slI-W+sDEXwYC0WcNYpG00OQkDR4GcgK+4gRoiAA)

## Pseudocódigo B

```pseudocódigo
Variáveis
    n1, digitos, soma: número
    
Início
    digitos = 0
    soma = 0
    Leia n1

    Faça
        soma = soma + (n1 mod 10)
        n1 = n1 div 10
        digitos = digitos + 1
    enquanto n1>0

    Escreva "Dígitos: ", digitos
    Escreva "Soma: ", soma  

Fim
```
