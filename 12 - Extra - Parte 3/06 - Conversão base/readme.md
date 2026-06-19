# Conversão de base

## Introdução

Sejam $n > 0$ e $b \geq 2$ inteiros. Os **coeficientes $b$-ários de $n$** são uma lista de inteiros $[d_0, d_1, \dots, d_{k-1}]$ satisfazendo

$$n = (d_0)1 + (d_1)b + (d_2)b^2 + (d_3)b^3 + \dots + (d_{k-1})b^{k-1},$$

com $0 \leq d_i < b$, para $0 \leq i < k$.

Por exemplo:

* Os coeficientes 2-ários de 13 são $[1, 0, 1, 1]$, pois $13 = (1)1 + (0)2 + (1)4 + (1)8$.
* Os coeficientes 10-ários de 95 são $[5, 9]$, pois $95 = (5)1 + (9)10$.
* Os coeficientes 16-ários de 123 são $[11, 7]$, pois $123 = (11)1 + (7)16$.

A partir dos coeficientes $b$-ários, podemos obter a **representação $b$-ária de $n$** facilmente. Para isso, basta escrever os coeficientes $b$-ários em ordem inversa e justapô-los (dígitos maiores que 9 são representados pelas letras A, B, C, e assim por diante).

Por exemplo, os coeficientes 16-ários de 123 são $[11, 7]$; os dígitos correspondentes são B e 7; portanto, a representação 16-ária de 123 é 7B.

## Tarefa

Escreva um programa que lê do teclado um inteiro positivo n e uma base
b (de 2 a 16) e escreve na tela a representação b-ária de n.

Para resolver esse problema, você deverá implementar as seguintes funções:

### calcula_coefs

#### Parâmetros de entrada

int n - Um inteiro positivo.
int b - Um inteiro maior ou igual a 2.

#### Parâmetros de saída

int coefs[] - Um arranjo de inteiros que armazenará os coeficientes b-ários de n.

#### Retorno

int - O número de coeficientes.

### int_para_string

#### Parâmetros de entrada de int_para_string

int n - Um inteiro positivo.
int b - Um inteiro maior ou igual a 2.

#### Parâmetros de saída de int_para_string

char *str
A string que armazenará a representação b-ária de n.

#### Retorno de int_para_string

(nenhum)

## Restrições

A função int_para_string deve chamar a função calcula_coefs.

## Formato

Entre com um inteiro positivo: {int}
Entre com a base (2 a 16): {int}
Representação {int}-ária de {int}: {str}

## Exemplos

```plaintext
Entre com um inteiro positivo: 13
Entre com a base (2 a 16): 2
Representação 2-ária de 13: 1101

Entre com um inteiro positivo: 95
Entre com a base (2 a 16): 10
Representação 10-ária de 95: 95

Entre com um inteiro positivo: 123
Entre com a base (2 a 16): 16
Representação 16-ária de 123: 7B

Entre com um inteiro positivo: 1000
Entre com a base (2 a 16): 10
Representação 10-ária de 1000: 1000

Entre com um inteiro positivo: 4395856
Entre com a base (2 a 16): 13
Representação 13-ária de 4395856: BABACA

Entre com um inteiro positivo: 2147483647
Entre com a base (2 a 16): 2
Representação 2-ária de 2147483647: 1111111111111111111111111111111

Entre com um inteiro positivo: 2147483647
Entre com a base (2 a 16): 16
Representação 16-ária de 2147483647: 7FFFFFFF
```
