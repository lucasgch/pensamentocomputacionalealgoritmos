# Exercício em sala: Maior número

(a) Elabore um pseudocódigo para um algoritmo que ´LÊ´ um inteiro positivo n ≥ 1, seguido de n números reais (assuma todos positivos) e ´ESCREVE´ o maior número lido. Utilize o comando Enquanto. Em seguida, efetue um teste de mesa com a entrada ´5 7.1 2.5 3.4 8.2 1.9´; a saída deve ser ´8.2´.

(b) Suponha agora que não será informado o número de valores a serem lidos: no lugar, a leitura dos números é encerrada quando o usuário entrar com 0 (zero) ou qualquer número negativo. Utilize o comando

Faça/enquanto. Em seguida, efetue um teste de mesa com a entrada ´7.1 2.5 3.4 8.2 1.9 0´; a saída deve ser 8.2.

## Fluxograma A

[Fluxograma A no fluxolab]([https://fluxolab.app/?lzs=NoIhBplA7CAYC6kQFsCGBLA9gJ3k0HAUzQBt8Dg5wBmcAFgDZqAmasZAIywBcesUIBAQCM4AKwNm4EfXYAdEAEloAM1woiAAgCuKLRmg8iGHFi0AHLAGcMPDADcsiiKG58BQgiwZTWbcBBYLl5+QWFIOgB2P3AWAA52aAA+OFcQdzCIEBwMAHMACx4vSHpfJmp6AJySchCPcIJJSQraaRBFFXUcTS1FcC1oAcVBgC-NM2stYkxrF3qsiOBGcBXWxMD0bBwAXjSFzyWYmNb6DZqyZK3cdMzPQNzC4qX41djxOU3MXB2ZurdQocCABON6tZhJHbQAC0IlugMakBE1BO0kY5xS+wBDWyjyKJWAIjELWkUXa1zwB0RhJ8r3Wnw4wGElDEyLi3hk1BoBDoIh8LB5MmJTU5DAI1DZjAIKzZIgIZTZUQIMSJ4HiypkPmBBFebO1kFBssQSIlYnooglPiJolZluZQA](https://fluxolab.app/?lzs=NoIhBplA7CAYC6kQFsCGBLA9gJ3k0HAUzQBt8Dg5wBmcAFgDZqAmasZAIywBcesUIBAQCM4AKwNm4EfXYAdEAEloAM1woiAAgCuKLRmg8iGHFi0AHLAGcMPDADcsiiKG58BQgiwZTWbcBBYLl5+QWFIOgB2P3AWAA52aAAeAF44VxB3MIgQHAwAcwALHi9Iel8manoAvJJyEI9wgklJKtppEEUVdRxNLUVwLWghxWGAL80zay1iTGsXRpyI4EZwNfbEwPRsHHTM7M8VmJj2+i26sgA+HdwD0M9A-OLSlfj12PE5bcxcVLmGm4Hs1IABOD7tZhJVLQAC0InuTTKwBE1FO0kYF2gVwyS0eeUKJWRIjEbWkUU6tzweJBKJ87023w4wGElDEqLi3hk1BoBDoIh8LD5MlJLW5DAI1A5jAIaw5IgIFQ5UQIMRJ4HiqpkPlBBHeHN1YPFqNEUrE9FN2pFonZUqFwiAA)

## Pseudocódigo A

```pseudocódigo
Variáveis
    n, maior, real: número
    
Início
    maior = 0
    Faça
        Escreva "Informe um inteiro positivo"
        Leia n
    enquanto n<0

    Escreva "Informe ", n, " números reais"

    Faça
        Leia real
        
        Se real>maior
            maior=real
        FimSe
        n=n-1
    enquanto n>0

    Escreva maior        

Fim
```

## Teste de mesa A

Entrada: ´5 7.1 2.5 3.4 8.2 1.9´
Saída: ´8.2´

| Bloco | instrução | n | maior | real | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | ? | ? | ? | ? | ?
| Bloco 1 | Atribuicao | ? | 0 | ? | ? | ?
| Bloco 2 | Saída | 5 | 0 | ? | ? | "Informe ", n, " números reais"
| Bloco 3 | Leia | 5 | 0 | ? | 5 | ?
| Bloco 4 | Condicional | 5 | 0 | ? | ? | ?
| Bloco 5 | Saída | 5 | 0 | ? | ? | "Informe ", n, " números reais"
| Bloco 6 | Leia | 5 | 0 | 7.1 | 7.1 | ?  <!-- Bloco 6: Leia real -->
| Bloco 7 | Condicional | 5 | 0 | 7.1 | ? | ? <!-- Bloco 7: condicional real>maior -->
| Bloco 8 | Atribuição | 5 | 7.1 | 7.1 | ? | ? <!-- Bloco 8: atribuicao maior=real -->
| Bloco 9 | Atribuição | 4 | 7.1 | 7.1 | ? | ? <!-- Bloco 9: atribuicao n=n-1 -->
| Bloco 10 | Condicional | 4 | 7.1 | 7.1 | ? | ? <!-- Bloco 10: condicional n>0 -->
| Bloco 6 | Leia | 4 | 7.1 | 2.5 | 2.5 | ? <!-- Bloco 6: Leia real -->
| Bloco 6 | Condicional | 4 | 7.1 | 2.5 | 2.5 | ? <!-- Bloco 7: condicional real>maior -->
| Bloco 9 | Atribuição | 3 | 7.1 | 2.5 | ? | ? <!-- Bloco 9: atribuicao n=n-1 -->
| Bloco 10 | Condicional | 3 | 7.1 | 2.5 | ? | ? <!-- Bloco 10: condicional n>0 -->
| Bloco 6 | Leia | 3 | 7.1 | 3.4 | 3.4 | ? <!-- Bloco 6: Leia real -->
| Bloco 6 | Condicional | 3 | 7.1 | 3.4 | 3.4 | ? <!-- Bloco 7: condicional real>maior -->
| Bloco 9 | Atribuição | 2 | 7.1 | 3.4 | 3.4 | ? <!-- Bloco 9: atribuicao n=n-1 -->
| Bloco 10 | Condicional | 2 | 7.1 | 3.4 | 3.4 | ?  <!-- Bloco 10: condicional n>0 -->
| Bloco 6 | Leia | 2 | 2.5 | 7.1 | 8.2 | ? <!-- Bloco 6: Leia real -->
| Bloco 6 | Condicional | 2 | 7.1 | 8.2 | ? | ? <!-- Bloco 7: condicional real>maior -->
| Bloco 8 | Atribuição | 2 | 8.2 | 8.2 | ? | ? <!-- Bloco 8: atribuicao maior=real -->
| Bloco 9 | Atribuição | 1 | 8.2 | 8.2 | ? | ? <!-- Bloco 9: atribuicao n=n-1 -->
| Bloco 10 | Condicional | 1 | 8.2 | 8.2 | ? | ?  <!-- Bloco 10: condicional n>0 -->
| Bloco 6 | Leia | 1 | 8.2 | 1.9 | 1.9 | ? <!-- Bloco 6: Leia real -->
| Bloco 7 | Condicional | 1 | 8.2 | 1.9 | ? | ? <!-- Bloco 7: condicional real>maior -->
| Bloco 9 | Atribuição | 0 | 8.2 | 1.9 | ? | ? <!-- Bloco 9: atribuicao n=n-1 -->
| Bloco 10 | Condicional | 0 | 8.2 | 1.9 | ? | ?  <!-- Bloco 10: condicional n>0 -->
| Bloco 11 | Saída | 0 | 8.2 | 1.9 | ? | 8.2 <!-- Bloco 11: saida maior -->
| Bloco 12 | Fim | 0 | 8.2 | 1.9 | ? | ? <!-- Bloco 12:fim -->

## Fluxograma B

[Fluxograma B no fluxolab](https://fluxolab.app/?lzs=NoIhBplA7CAYC6kQFsCGBLA9gJ3k0HAUzQBt8Dg5wBmcAFgDZqAme6sZAIywBdesKEAgL0GDZgxYdiZCKB79BwggFZw6ptRqSQAHRABJaADNcKIgAJoAL4s4sAZ0uyMzrAFdLAEwwBzDF4rOEsABzQcNEtHTBwDeRBFASERSEZwdK1aOA50bBwAXjgEpOVU4AB2cCqs+gAOGRJSAD483BK+ZIgQHH8AC14VSDqMiWpVdnBUTFwC2XJuTrKCAE5RrOYOaALoAFoARg6lFIJ96hrJRgap6ABCIqOuqd6-AaHgff2NMerdNrxFsd3vsWOARlk6pNOMARJR1GcGARqAjGKJwAiKgQqp8wVj0aCVgQRgjCZA1gizqdkV96FT8ej9qcvhSWAR0gjVLCgA)

## Pseudocódigo B

```pseudocódigo
Variáveis
    maior, real: número
    
Início
    maior = 0

    Escreva "Informe números reais ou digite 0 para sair"

    Faça
        Leia real
        
        Se real>maior
            maior=real
        FimSe

    enquanto real!=0

    Escreva maior        

Fim
```
