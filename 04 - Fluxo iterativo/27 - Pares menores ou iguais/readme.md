# Pares menores ou iguais e soma dos ímpares

Elabore um pseudocódigo para um algoritmo que LÊ um inteiro positivo n e ESCREVE todos os números pares menores ou iguais a n, em ordem decrescente, até 0, bem como a soma de todos os números ímpares menores ou iguais a n. Por exemplo, se a entrada for 10, a saída deve ser 10 8 6 4 2 0 25, pois os números pares menores ou iguais a 10 são 10, 8, 6, 4, 2 e 0, e a soma dos números ímpares menores ou iguais a 10 é 1 +3 +5 +7 + 9 = 25.

## Pseudocódigo

```delphi
Variáveis
    n, somaDosImpares: número
Início
    somaDosImpares=0
    Escreva "Informe um inteiro positivo"
    Leia n
    Enquanto n<=0
        Escreva "Entrada Inválida! Informe um inteiro positivo"
        Leia n
    FimEnquanto
    
    Enquanto n>=0
        Se (n mod 2==0)
            Escreva n
        Senão
            somaDosImpares=somaDosImpares+n
        FimSe
        n=n-1
    FimEnquanto
    Escreva somaDosImpares
Fim
```
