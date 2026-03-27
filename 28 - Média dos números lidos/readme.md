# 28 - Média dos números lidos

Elabore um pseudocódigo para um algoritmo que LÊ um inteiro positivo n, seguido de mais ʼn números reais, e ESCREVE a média dos números lidos que se encontram no intervalo `[5, 10]`. Por exemplo, se a entrada for `6 7.1 12.5 5.9 9.4 4.0 7.6` (indicando que n = 6 e os números reais lidos são `7.1, 12.5, 5.9, 9.4, 4.0 e 7.6`), então a saída deve ser `7.5`, pois os números que se encontram no intervalo `[5, 10]` são `7.1 5.9, 9.4 e 7.6`, cuja média é `7.5`.

## Pseudocódigo

```delphi
Variáveis
    n, real, soma, media, numerosNoIntervalo: número
Início
    Escreva "Informe um inteiro positivo"
    Leia n
    Enquanto n<=0
        Escreva "Entrada Inválida! Informe um inteiro positivo"
        Leia n
    FimEnquanto

    Escreva "Informe ",n," números reais"
    
    soma = 0
    numerosNoIntervalo=0
    Enquanto n>0
        Leia real
        Se real>=5 && real<=10
            soma=soma+real
            numerosNoIntervalo=numerosNoIntervalo+1
        FimSe
        n=n-1
    FimEnquanto
    
    media = soma / numerosNoIntervalo
    Escreva media
Fim
```
