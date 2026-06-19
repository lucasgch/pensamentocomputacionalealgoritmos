# Filtra primos

## Tarefa

Escreva um programa que lê do teclado uma sequência de inteiros positivos (a leitura termina quando o número 0 é encontrado) e escreve na tela os números primos que aparecem na sequência. Assuma que o usuário não irá fornecer mais do que 100 inteiros positivos na sequência. Para resolver esse problema, você deverá implementar as seguintes funções:

### eh_primo

#### Parâmetros de entrada para eh_primo

int n - Um inteiro positivo.

#### Retorno

bool - Igual a true, se n é primo, ou false, caso contrário.

### filtra_primos

#### Parâmetros de entrada para filtra_primos

int seq[] - Um arranjo contendo apenas inteiros positivos.
int n - A quantidade de elementos em seq a ser considerada.

#### Parâmetros de saída

int primos[] - Um arranjo contendo apenas os números primos de seq, na mesma ordem em que aparecem, devendo conter repetições, se for o caso. Assuma que este arranjo tenha tamanho suficiente para conter todos os números primos de seq.
Retorno

int - A quantidade de números primos encontrados, levando em conta repetições.

## Restrições

A função filtra_primos deve chamar a função eh_primo.
Apenas a função main deve realizar entrada e saída de dados.

## Formato

Entre com inteiros positivos (0 para terminar): {int} ⋯ {int}
Primos encontrados: {int} ⋯ {int}

## Exemplos

```plaintext
Entre com inteiros positivos (0 para terminar): 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 0
Primos encontrados: 2 3 5 7 11 13 17 19

Entre com inteiros positivos (0 para terminar): 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
Primos encontrados: 19 17 13 11 7 5 3 2

Entre com inteiros positivos (0 para terminar): 7 7 7 7 19 7 0
Primos encontrados: 7 7 7 7 19 7

Entre com inteiros positivos (0 para terminar): 100 200 50 12 0
Primos encontrados: 

Entre com inteiros positivos (0 para terminar): 1 3 7 15 31 63 127 255 511 1023 2047 4095 8191 16383 32767 65535 0
Primos encontrados: 3 7 31 127 8191
```
