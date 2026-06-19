# Ocorrência de dígitos

`Retirado de King – C Programming: A Modern Approach, 2nd edition, Chapter 8, Programming Project 2, p. 178.`

## Tarefa

Escreva um programa que lê do teclado um inteiro entre 1 e 999999999 e escreve na tela uma tabela mostrando quantas vezes cada dígito aparece no número fornecido.

## Restrições

Utilize arranjos.
Não utilize strings.

## Formato

Entre com um inteiro: {int}
Dígito:       0  1  2  3  4  5  6  7  8  9
Ocorrências:  #  #  #  #  #  #  #  #  #  #

## Dicas

Para extrair os dígitos de um inteiro, utilize o comando while; dentro do loop, calcule iterativamente a divisão e o resto da divisão por 10.

## Exemplos

```plaintext
Entre com um inteiro: 41271092
Dígito:       0  1  2  3  4  5  6  7  8  9
Ocorrências:  1  2  2  0  1  0  0  1  0  1

Entre com um inteiro: 741
Dígito:       0  1  2  3  4  5  6  7  8  9
Ocorrências:  0  1  0  0  1  0  0  1  0  0

Entre com um inteiro: 5000
Dígito:       0  1  2  3  4  5  6  7  8  9
Ocorrências:  3  0  0  0  0  1  0  0  0  0

Entre com um inteiro: 123456789
Dígito:       0  1  2  3  4  5  6  7  8  9
Ocorrências:  0  1  1  1  1  1  1  1  1  1

Entre com um inteiro: 111000111
Dígito:       0  1  2  3  4  5  6  7  8  9
Ocorrências:  3  6  0  0  0  0  0  0  0  0

Entre com um inteiro: 122333445
Dígito:       0  1  2  3  4  5  6  7  8  9
Ocorrências:  0  1  2  3  2  1  0  0  0  0

Entre com um inteiro: 999999999
Dígito:       0  1  2  3  4  5  6  7  8  9
Ocorrências:  0  0  0  0  0  0  0  0  0  9
```
