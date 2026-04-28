# Ano bissexto

Um ano é bissexto se for divisível por 4. Mas essa regra tem uma exceção: os anos divisíveis por 100, apesar de serem divisíveis por 4, não são bissextos. Porém, há uma exceção à exceção: os anos divisíveis por 400, apesar de serem divisíveis por 100, são sim bissextos.

Por exemplo:

- 1983 não é bissexto, pois não é divisível por 4.
- 1992 é bissexto, pois é divisível por 4 (e não se aplica a exceção).
- 1900 não é bissexto, pois, apesar de ser divisível por 4, também é divisível por 100 (e se aplica a exceção).
- 2000 é bissexto, pois, apesar de ser divisível por 100, também é divisível por 400 (e se aplica a exceção à exceção).

## Tarefa

Escreva um programa que lê do teclado um ano e escreve na tela se ele é bissexto ou não.

## Restrições

Utilize uma variável do tipo bool que assume o valor true, se o ano for bissexto, ou false, caso contrário.
Não utilize os comandos if ou switch, nem o operador ternário.

## Formato

```shell
Entre com um ano: {int}
Ano bissexto: {0 ou 1}
A saída deve ser 1, se o ano for bissexto, ou 0, caso contrário.
```

## Exemplos

```java
// Exemplo 1
Entre com um ano: 1983
Ano bissexto: 0

// Exemplo 2
Entre com um ano: 1992
Ano bissexto: 1

// Exemplo 3
Entre com um ano: 1900
Ano bissexto: 0

// Exemplo 4
Entre com um ano: 2000
Ano bissexto: 1

// Exemplo 5
Entre com um ano: 2022
Ano bissexto: 0
```
