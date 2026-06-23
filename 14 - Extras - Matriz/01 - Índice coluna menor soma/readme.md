# Índice da coluna de menor soma

## Tarefa

Escreva um programa que lê do teclado uma matriz de números inteiros e escreve na tela o índice da coluna de menor soma. A matriz será lida da seguinte forma: primeiro serão lidos dois inteiros que representam o número de linhas e o número de colunas da matriz, respectivamente; em seguida, serão lidos os elementos da matriz, linha por linha, da esquerda para a direita. Assuma que o número de linhas e o número de colunas da matriz são no máximo 100.

## Restrições

Utilize arranjos bidimensionais.

## Formato

```plaintext
Entre com as dimensões da matriz: {int} {int}
Entre com os elementos da matriz:
{int} ⋯ {int}
⋮
{int} ⋯ {int}
Índice da coluna com menor soma: {int}
```

## Exemplo

```plaintext
Entre com as dimensões da matriz: 2 2
Entre com os elementos da matriz:
1 3
2 4
Índice da coluna com menor soma: 0

Entre com as dimensões da matriz: 3 4
Entre com os elementos da matriz:
21 17 28 34
44 12 25 19
17 22 26 35
Índice da coluna com menor soma: 1

Entre com as dimensões da matriz: 3 4
Entre com os elementos da matriz:
21 17 16 34
44 12 13 19
17 22 22 35
Índice da coluna com menor soma: 1

Entre com as dimensões da matriz: 5 5
Entre com os elementos da matriz:
1 0 0 0 0
1 1 0 0 0
1 2 1 0 0
1 3 3 1 0
1 4 6 4 1
Índice da coluna com menor soma: 4

Entre com as dimensões da matriz: 1 4
Entre com os elementos da matriz:
12 -3 0 5
Índice da coluna com menor soma: 1

Entre com as dimensões da matriz: 4 1
Entre com os elementos da matriz:
12
-3
0
5
Índice da coluna com menor soma: 0
```
