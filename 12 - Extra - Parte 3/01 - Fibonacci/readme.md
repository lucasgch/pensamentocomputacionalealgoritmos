# Sequência de Fibonacci generalizada

A sequência de Fibonacci é uma sequência de números inteiros que começa com os termos 0 e 1 e cada termo subsequente é a soma dos dois anteriores. Os dez primeiros termos são:

`0,1,1,2,3,5,8,13,21,34…`

Por exemplo, o sétimo termo, `8`, é a soma dos dois termos anteriores, `3` e `5`. Matematicamente, a sequência de Fibonacci é definida como segue:

$$F[0] = 0,$$
$$F[1] = 1,$$
$$F[i] = F[i - 1] + F[i - 2], \quad \text{para } i \geq 2.$$
​
Uma possível generalização da sequência de Fibonacci consiste em permitir que os dois termos iniciais sejam quaisquer e que cada termo subsequente seja uma soma ponderada dos dois anteriores, ao invés de uma soma simples. Matematicamente:

Uma possível generalização da sequência de Fibonacci consiste em permitir que os dois termos iniciais sejam quaisquer e que cada termo subsequente seja uma soma ponderada dos dois anteriores, ao invés de uma soma simples. Matematicamente:

$$F[0] = f_0,$$
$$F[1] = f_1,$$
$$F[i] = aF[i - 1] + bF[i - 2], \quad \text{para } i \geq 2,$$

Em que $f_0$ e $f_1$ são os *termos iniciais* e $a$ e $b$ são os *coeficientes* da soma ponderada, todos números inteiros. Por exemplo:

* Para $(f_0, f_1) = (0, 1)$ e $(a, b) = (1, 1)$, tem-se a sequência de Fibonacci original: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 . . .
* Para $(f_0, f_1) = (2, 1)$ e $(a, b) = (1, 1)$, tem-se a sequência de Lucas: 2, 1, 3, 4, 7, 11, 18, 29, 47, 76 . . .
* Para $(f_0, f_1) = (0, 1)$ e $(a, b) = (2, 1)$, tem-se a sequência de Pell: 0, 1, 2, 5, 12, 29, 70, 169, 408, 985 . . .
* Para $(f_0, f_1) = (1, 2)$ e $(a, b) = (2, 0)$, tem-se as potências de dois: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512 . . .

## Tarefa

Escreva um programa que **LÊ DO TECLADO** os termos iniciais $f_0$ e $f_1$ e os coeficientes $a$ e $b$ e **IMPRIME E NA TELA** os 10 primeiros termos da sequência de Fibonacci generalizada.

## Restrições

* Utilize arranjos.

## Formato

Entre com os termos iniciais: {int} {int}
Entre com os coeficientes: {int} {int}
Sequência: {int} {int} ... {int}

## Exemplos

Abaixo exemplos de execução do programa:

```text
Entre com os termos iniciais: `0 1`
Entre com os coeficientes: `1 1`
Sequência: 0 1 1 2 3 5 8 13 21 34

Entre com os termos iniciais: `2 1`
Entre com os coeficientes: `1 1`
Sequência: 2 1 3 4 7 11 18 29 47 76

Entre com os termos iniciais: `0 1`
Entre com os coeficientes: `2 1`
Sequência: 0 1 2 5 12 29 70 169 408 985

Entre com os termos iniciais: `1 2`
Entre com os coeficientes: `2 0`
Sequência: 1 2 4 8 16 32 64 128 256 512

Entre com os termos iniciais: `0 1`
Entre com os coeficientes: `3 -2`
Sequência: 0 1 3 7 15 31 63 127 255 511

Entre com os termos iniciais: `0 1`
Entre com os coeficientes: `6 -1`
Sequência: 0 1 6 35 204 1189 6930 40391 235416 1372105
```
