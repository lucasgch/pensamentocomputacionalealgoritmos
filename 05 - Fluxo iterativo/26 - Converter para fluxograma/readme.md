# Converter para fluxograma

Considere o pseudocódigo a seguir:

```Pseudocódigo
Variáveis
    i, n: inteiro
Início
    Leia n
    i←1
    Enquanto i < n
        i← i * 2
    FimEnquanto
    Escreva i
Fim
```

A.  Converta o pseudocódigo para fluxograma.
B. Efetue um teste de mesa com a entrada 50.
C. Sem efetuar teste de mesa, determine a saída para a entrada 1000. Repita para 256.
D. Descreva, em palavras, o problema resolvido pelo algoritmo (não descreva o algoritmo em si).

## A - Converter para Fluxograma

[Link pra fluxograma no fluxolab](https://fluxolab.app/?lzs=NoIhBplBLCAYC6kQDt4KVO4DM4AsAbNgIzHhjIBGA9gC500C2IGkJBB5ATN9qhFC0GzVpm7hCXbNwAc-aAF4SgkMMYs2wPAHZpufAoA8aavQ0QQAJ2gBzABZ0xkfJP2GFi6ACpuq9aJaAKzgIUTY+PIUsGYimphSsvpBhhSCGJjApKSYHCQy4uD5uJh4JBz4pUUSQZiuxTiYIcWEGUA)

## B - Teste de mesa com entrada 50

| Bloco | instrução | i | n | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | ? | ? | ? | ?
| Bloco 1 | Leia | ? | 50 | 50 | ?
| Bloco 2 | Atribuição | 1 | 50 | ? | ?
| Bloco 3 | Condicional | 1 | 50 | ? | ?
| Bloco 4 | Atribuição | 2 | 50 | ? | ?
| Bloco 3 | Condicional | 2 | 50 | ? | ?
| Bloco 4 | Atribuição | 4 | 50 | ? | ?
| Bloco 3 | Condicional | 4 | 50 | ? | ?
| Bloco 4 | Atribuição | 8 | 50 | ? | ?
| Bloco 3 | Condicional | 8 | 50 | ? | ?
| Bloco 4 | Atribuição | 16 | 50 | ? | ?
| Bloco 3 | Condicional | 16 | 50 | ? | ?
| Bloco 4 | Atribuição | 32 | 50 | ? | ?
| Bloco 3 | Condicional | 32 | 50 | ? | ?
| Bloco 4 | Atribuição | 64 | 50 | ? | ?
| Bloco 3 | Condicional | 64 | 50 | ? | ?
| Bloco 5 | Saída | 64 | 50 | ? | 64
| Bloco 6 | Fim | ? | ? | ? | ?

## C - Determine a saída para a entrada 1000 e para 256

1. Saída para entrada 1000 = 512*2 = 1024
2. Saída para entrada 256 = 128*2 = 256

## D - Descreva o problema resolvido pelo algoritmo

O Algoritmo calcula o quadrado de um número até que esse quadrado seja menor que o número n dado inicialmente. Portanto, ao dar a entrada 256, por exemplo, o maior quadrado possível é 128*2 = 256, pois o quadrado seguinte se torna maior ou igual, e mais especificamente nesse caso igual, a entrada 256.
