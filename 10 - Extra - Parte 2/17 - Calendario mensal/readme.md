# Calendário mensal

Retirado de King – C Programming: A Modern Approach, 2nd edition, Chapter 6, Programming Project 8, p. 123.

## Tarefa

Escreva um programa que lê do teclado o número de dias do mês e o dia de semana no qual o mês inicia e escreve na tela o calendário do mês.

## Formato

Entre com o número de dias do mês (28, 30 ou 31): {int}
Entre com o primeiro dia da semana (1=Dom, 7=Sab): {int}

```text
 D  S  T  Q  Q  S  S

## ## ## ## ## ## ##
## ## ## ## ## ## ##
## ## ## ## ## ## ##
## ## ## ## ## ## ##
## ## ## ## ## ## ##
```

## Dicas

1. Este programa não é tão difícil quanto parece. A parte mais importante é um comando `for` que utiliza uma variável `i` que vai de 1 até o número de dias do mês, imprimindo cada valor de `i`. Dentro do loop, um comando if testa se `i` corresponde a um sábado; se for o caso, um caractere de quebra-de-linha deve ser impresso.

2. Para imprimir um inteiro que ocupa exatamente dois caracteres, utilize o especificador `"%2d"` no printf.

## Exemplos

```text
Entre com o número de dias do mês (28, 30 ou 31): 31
Entre com o primeiro dia da semana (1=Dom, 7=Sab): 3

 D  S  T  Q  Q  S  S

       1  2  3  4  5
 6  7  8  9 10 11 12
13 14 15 16 17 18 19
20 21 22 23 24 25 26
27 28 29 30 31 

Entre com o número de dias do mês (28, 30 ou 31): 28
Entre com o primeiro dia da semana (1=Dom, 7=Sab): 1

 D  S  T  Q  Q  S  S

 1  2  3  4  5  6  7
 8  9 10 11 12 13 14
15 16 17 18 19 20 21
22 23 24 25 26 27 28


Entre com o número de dias do mês (28, 30 ou 31): 28
Entre com o primeiro dia da semana (1=Dom, 7=Sab): 4

 D  S  T  Q  Q  S  S

          1  2  3  4
 5  6  7  8  9 10 11
12 13 14 15 16 17 18
19 20 21 22 23 24 25
26 27 28 

Entre com o número de dias do mês (28, 30 ou 31): 28
Entre com o primeiro dia da semana (1=Dom, 7=Sab): 7

 D  S  T  Q  Q  S  S

                   1
 2  3  4  5  6  7  8
 9 10 11 12 13 14 15
16 17 18 19 20 21 22
23 24 25 26 27 28 


Entre com o número de dias do mês (28, 30 ou 31): 30
Entre com o primeiro dia da semana (1=Dom, 7=Sab): 1

 D  S  T  Q  Q  S  S

 1  2  3  4  5  6  7
 8  9 10 11 12 13 14
15 16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 

Entre com o número de dias do mês (28, 30 ou 31): 30
Entre com o primeiro dia da semana (1=Dom, 7=Sab): 7

 D  S  T  Q  Q  S  S

                   1
 2  3  4  5  6  7  8
 9 10 11 12 13 14 15
16 17 18 19 20 21 22
23 24 25 26 27 28 29
30 

Entre com o número de dias do mês (28, 30 ou 31): 31
Entre com o primeiro dia da semana (1=Dom, 7=Sab): 1

 D  S  T  Q  Q  S  S

 1  2  3  4  5  6  7
 8  9 10 11 12 13 14
15 16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31 

Entre com o número de dias do mês (28, 30 ou 31): 31
Entre com o primeiro dia da semana (1=Dom, 7=Sab): 7

 D  S  T  Q  Q  S  S

                   1
 2  3  4  5  6  7  8
 9 10 11 12 13 14 15
16 17 18 19 20 21 22
23 24 25 26 27 28 29
30 31 
```
