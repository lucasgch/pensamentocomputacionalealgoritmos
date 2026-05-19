# Classificação de triângulos

Dados três segmentos de retas de comprimentos a, b e c sabemos que eles podem formar um triângulo se e somente se a soma de quaisquer dois lados é sempre maior que o terceiro lado. Por exemplo:

Os números (3,4,5)
(3,4,5) formam um triângulo, pois:

3 + 4 > 5, 4+5>3 e 5+3>4.

Os números (2,3,6) não formam um triângulo, pois:

2+3<6, ainda que 3+6>2 e 6+2>3.

Além disso, se os três lados de um triângulo são iguais, então ele é chamado de triângulo equilátero. Se dois lados são iguais e o terceiro é diferente, então ele é chamado de triângulo isósceles. Se todos os lados são diferentes, então ele é chamado de triângulo escaleno.

## Tarefa

Escreva um programa que lê do teclado os lados de um triângulo e escreve na tela a sua classificação (equilátero, isósceles, escaleno ou inválido).

## Formato

```
Entre com os lados do triângulo: {float} {float} {float}
Triangulo [equilátero | isósceles | escaleno | inválido]
Exemplos
Abaixo exemplos de execução do programa (o texto em azul corresponde ao digitado pelo usuário).

Entre com os lados do triângulo: 3 4 5
Triângulo escaleno
```
