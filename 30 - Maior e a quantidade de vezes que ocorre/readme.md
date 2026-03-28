# 30 - Maior e a quantidade de vezes que ocorre

## A

Escreva o maior e a quantidade de vezes que ocorre

Ex.: `10 3 2 3 3 2 7 5 7 7 3`

Saída: `O maior ocorre 3 vezes`

```delphi
Variáveis
    n,x, maior, ocorrencias: número
Início
    
    Escreva "Informe a quantidade de números"
    
    Leia n
    Enquanto n<0
        Escreva "Entrada inválida. Tente novamente"
        Leia n
    FimEnquanto
    
    maior = 0
    ocorrencias = 0

    Faça
        Leia x
        Se (x==maior)
            ocorrencias=ocorrencias+1
        SenãoSe (x>maior)
            maior=x
            ocorrencias=1
        FimSe
        n=n-1
    enquanto n>0

    Escreva "Maior: ", maior
    Escreva "O maior ocorre ", ocorrencias, " vezes"
    
    
Fim
```

## B 

Escrever o maior e o segundo maior. Assuma todos distintos.

Ex.: `6 1 3 2 7 4 5`

```
Maior: 7
Segundo maior: 5
```
