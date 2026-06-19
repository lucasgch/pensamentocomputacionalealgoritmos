# Números amigos

Dois números inteiros positivos `a` e  `b` são amigos se a soma dos divisores de `a` (com exceção do próprio a) é igual a `b` e a soma dos divisores de `b` (com exceção do próprio b) é igual a `a`. Por exemplo, `220` e `284` são amigos, pois:

- os divisores de 220 são `1,2,4,5,10,11,20,22,44,55,110` e a soma deles é 284;
- os divisores de 284 são `1,2,4,71 e 142` e a soma deles é 220.

## Tarefa

Escreva um programa que lê do teclado dois inteiros positivos e escreve na tela se o os números fornecidos são amigos ou não. Para resolver esse problema, você deverá implementar as seguintes funções:

### soma_divisores

- Parâmetros
  - `int n` - Um inteiro positivo.

- Retorno
  - `int` - A soma dos divisores de n (com exceção do próprio n).

### sao_amigos

- Parâmetros
  - `int a` - Um inteiro positivo.
  - `int b` - Um inteiro positivo.

- Retorno
- `bool` - Igual a true, se a e b são amigos, ou false, caso contrário.

## Restrições

- A função soma_divisores deve ser implementada utilizando o comando `for`.
- A função sao_amigos deve ser implementada utilizando a função `soma_divisores` e conectivos lógicos, sem o uso de if ou switch, nem o operador ternário.
- Apenas a função main deve realizar entrada e saída de dados.

## Formato

Entre com dois inteiros positivos: {int} {int}
Os números {int} e {int} [são | não são] amigos

## Dicas

Para ler dois inteiros positivos utilizando a função scanf, você pode utilizar o seguinte especificador: "%d %d".

Um inteiro positivo ´i´ é divisor de um inteiro positivo `n` se o resto da divisão de `n` por `i` é igual a `0`.

## Exemplos

```text
Entre com dois inteiros positivos: 220 284
Os números 220 e 284 são amigos

Entre com dois inteiros positivos: 284 220
Os números 284 e 220 são amigos

Entre com dois inteiros positivos: 28 28
Os números 28 e 28 são amigos

Entre com dois inteiros positivos: 1024 3000
Os números 1024 e 3000 não são amigos

Entre com dois inteiros positivos: 3000 1024
Os números 3000 e 1024 não são amigos

Entre com dois inteiros positivos: 10 10
Os números 10 e 10 não são amigos

Entre com dois inteiros positivos: 5020 5564
Os números 5020 e 5564 são amigos

Entre com dois inteiros positivos: 12285 14595
Os números 12285 e 14595 são amigos

Entre com dois inteiros positivos: 12285 14559
Os números 12285 e 14559 não são amigos
```
