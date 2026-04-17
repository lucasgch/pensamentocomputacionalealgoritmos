# 29 - Número especial: divisível por 2 ou 3 - parte 2

Este exercício é uma continuação do [Exercício 4 da lista de fluxo sequencial e 7 do github](../07%20-%20Conversor%20binário%20para%20decimal/readme.md).

A. Modifique sua solução da letra (b) para que seja utilizado o comando Enquanto. Será necessária uma nova variável (de iteração). Assuma a existência de uma função chamada pow que recebe dois números a e b e retorna $a^b$ . Por exemplo, pow(2, 3) = 8.

B. Elabore um pseudocódigo para um algoritmo que Lê um inteiro positivo n qualquer, seguido de mais n inteiros, cada um sendo 0 ou 1, que compõem os bits da  representação binária de um número e ESCREVE esse número (em decimal). Assuma que os bits são informados do mais significativo para o menos significativo. Em seguida, execute os dois testes de mesa: O primeiro com entrada 5 1 0 0 1 1 (a saída deve ser 19; e o segundo com entrada 7 1 1 1 0 0 1 0" (a saída deve ser 114).

## Solução A

### Pseudocódigo B modificado com Faça Enquanto

A. Modifique sua solução da letra (b) para que seja utilizado o comando Enquanto. Será necessária uma nova variável (de iteração). Assuma a existência de uma função chamada pow que recebe dois números a e b e retorna $a^b$ . Por exemplo, pow(2, 3) = 8.

```delphi
Variáveis
    binario, decimal, iterador: número
Início
    decimal = 0
    iterador=4
    Escreva "Digite o número decimal de ",iterador+1, " dígitos: "
    Faça
        Leia binario
        decimal = decimal + binario*pow(2,iterador)
        iterador=iterador-1
    enquanto (iterador>=0)

    Escreva decimal

Fim
```

### Pseudocódigo B modificado com Enquanto

```delphi
Variáveis
    binario, decimal, iterador: número
Início
    decimal = 0
    iterador=4
    Escreva "Digite o número decimal de ",iterador+1, " dígitos: "
    Enquanto (iterador>=0)
        Leia binario
        decimal = decimal + binario*pow(2,iterador)
        iterador=iterador-1
    FimEnquanto

    Escreva decimal

Fim
```

## Solução B

### Pseudocódigo B

```delphi
Variáveis
    binario, decimal, iterador: número
Início
    decimal = 0
    Escreva "Informe a quantidade de dígitos do número decimal: "
    Leia iterador
    Escreva "Digite o número decimal de ",iterador, " dígitos: "
    iterador = iterador - 1
    
    Faça
        Leia binario
        decimal = decimal + binario*pow(2,iterador)
        iterador=iterador-1
    enquanto (iterador>=0)

    Escreva decimal

Fim
```
