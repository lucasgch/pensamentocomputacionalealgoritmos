# Números por extenso

Adaptado de King – C Programming: A Modern Approach, 2nd edition, Chapter 5, Programming Project 11, p. 97.

## Tarefa

Escreva um programa que lê do teclado um número inteiro entre 1 e 99 e escreve na tela o número por extenso em português.

## Restrições

Utilize os comandos if e switch.
Não utilize o comando goto.
Tente minimizar o número de comandos if e o número de cases dos comandos switch.

## Formato

Entre com um inteiro de 1 a 99: {int}
Número por extenso: "{string}"

## Dicas

Baseie sua lógica nos valores da dezena e unidade do número. Para obter a dezena, calcule a divisão inteira do número por 10; para obter a unidade, calcule o resto da divisão do número por 10.

Para imprimir aspas utilizando a função printf, utilize o caractere de escape \". Por exemplo, o trecho de código abaixo imprime "Penso, logo existo." (Descartes).

`printf("\"Penso, logo existo.\" (Descartes)\n");`

# Exemplo

Entre com um inteiro de 1 a 99: 25
Número por extenso: "vinte e cinco"