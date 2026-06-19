# Contagem de números pares

## Tarefa

Escreva um programa que lê do teclado dois arranjos de inteiros de mesmo tamanho e escreve na tela qual dos dois arranjos possui a maior quantidade de números pares (ou se ambos possuem a mesma quantidade). Os arranjos serão lidos da seguinte forma: primeiro será lido um inteiro que representa o tamanho dos arranjos; em seguida, serão lidos os elementos dos dois arranjos, um por linha, da esquerda para a direita. Assuma que o tamanho dos arranjos é no máximo 100. Para resolver esse problema, você deverá implementar as seguintes funções:

### conta_pares

#### Parâmetros de entrada

- int x[] - Um arranjo de inteiros.
- int tam - Tamanho do arranjo.
  
#### Retorno

- int - A quantidade de números pares no arranjo x.

### compara_arranjos

#### Parâmetros de entrada para compara_arranjos

int x[] - Um arranjo de inteiros.
int y[] - Um arranjo de inteiros.
int tam - Tamanho dos arranjos.

#### Retorno para compara_arranjos

int - Igual a 0 se as quantidades de números pares dos arranjos forem iguais; -1 se a quantidade de números pares do primeiro arranjo for maior que a do segundo, e 1 se a quantidade de números pares do primeiro arranjo for menor que a do segundo.

## Restrições

- Não utilize variáveis globais.
- A função main deve chamar a função compara_arranjos.
- A função compara_arranjos deve chamar a função conta_pares.
- Apenas a função main deve realizar entrada e saída de dados.

## Formato

Entre com o tamanho dos arranjos: {int}
Entre com os elementos do primeiro arranjo: {int} ⋯ {int}
Entre com os elementos do segundo arranjo: {int} ⋯ {int}
O primeiro arranjo possui mais números pares
    ou
O segundo arranjo possui mais números pares
    ou
Os dois arranjos possuem a mesma quantidade de números pares

## Exemplos

```plaintext
Entre com o tamanho dos arranjos: 3
Entre com os elementos do primeiro arranjo: 10 11 12
Entre com os elementos do segundo arranjo: 33 44 55
O primeiro arranjo possui mais números pares

Entre com o tamanho dos arranjos: 3
Entre com os elementos do primeiro arranjo: 1 5 7
Entre com os elementos do segundo arranjo: 5 9 1
Os dois arranjos possuem a mesma quantidade de números pares

Entre com o tamanho dos arranjos: 4
Entre com os elementos do primeiro arranjo: 1 2 3 4
Entre com os elementos do segundo arranjo: 3 2 1 0
Os dois arranjos possuem a mesma quantidade de números pares

Entre com o tamanho dos arranjos: 1
Entre com os elementos do primeiro arranjo: 324
Entre com os elementos do segundo arranjo: 741
O primeiro arranjo possui mais números pares

Entre com o tamanho dos arranjos: 10
Entre com os elementos do primeiro arranjo: 3 1 4 1 5 9 2 6 5 3
Entre com os elementos do segundo arranjo: 2 7 1 8 2 8 1 8 2 8
O segundo arranjo possui mais números pares
```
