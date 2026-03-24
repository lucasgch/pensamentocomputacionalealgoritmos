# Exercício em sala: Quantidade e soma de dígitos

(a) Elabore um fluxograma para um algoritmo que LÊ um inteiro positivo e ´ESCREVE´ a quantidade de dígitos do número lido. Utilize repetição com teste lógico no fim. Em seguida, efetue um teste de mesa com a entrada 1729; a saída deve ser 4. Dica: Utilize o operador de divisão inteira.

(b) Modifique o algoritmo anterior para que, no lugar da quantidade de dígitos, seja ESCRITA a soma dos dígitos do número lido. Em seguida, efetue um teste de mesa com a entrada 1729; a saída deve ser 19. 

Dica: Além do operador de divisão inteira, utilize o operador de resto da divisão.

## Fluxograma

[Link para fluxograma no fluxolab](https://fluxolab.app/?lzs=NoIhBplA7BGCAMBdSIAmBLA5hgLgewGdEVQA3AQwCd5xlTgFwBmcAJjadk-DFQCN8uAgFsQSUrHAAWdjzYAOJiDgRQg4fjETIbcADY5TZkt5wAvHAAEmMldgI1IDaPGlWAdiPgArDxWwVgB8Vo4CQq68VNgAFrhukLKGHEycypg4BITmYeoRWgnAPgbe0tLp2HhE5hlVhADUtHma2qSGxSkG-rVZTi4FOsBeCt4eCMpqEgxcTNKksg7gsJJLqaR6iz6kxYvM7ktSbPvcBm2r4B5TQA)

## Pseudocódigo

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
