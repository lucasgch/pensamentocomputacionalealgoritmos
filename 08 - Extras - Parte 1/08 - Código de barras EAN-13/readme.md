# Código de barras EAN-13

`Adaptado de King – C Programming: A Modern Approach, 2nd edition, Chapter 4, Programming Project 6, p. 72.`

## Introdução

O EAN-13 (European Article Number) é um padrão de código de barras utilizado para a identificação de produtos, sendo bastante empregado no Brasil. O código é composto por 13 dígitos, como mostra o exemplo abaixo.

EAN-13-5901234123457

Os 12 primeiros dígitos fornecem informações sobre o produto, tais como a empresa fabricante, o produto propriamente dito e o peso/quantidade do produto. No exemplo acima, os 12 primeiros dígitos são 590123412345. O último dígito é chamado de dígito verificador e serve para detectar erros na leitura ou na digitação do código. No exemplo acima, o digito verificador é 7.

O dígito verificador é calculado a partir dos 12 primeiros dígitos, conforme os seguintes passos:

- Some o primeiro, terceiro, quinto, sétimo, nono e décimo primeiro dígitos.
- Some o segundo, quarto, sexto, oitavo, décimo e décimo segundo dígitos.
- Multiplique a segunda soma por 3 e adicione o resultado à primeira soma.
- Subtraia 1 desse total.
- Extraia o último dígito desse valor. (Dica: use o resto da divisão por 10.)
- Faça 9 menos esse resultado.

O resultado de cada passo é mostrado a seguir para o código de barras mostrado na figura:

```
5+0+2+4+2+4=17
9+1+3+1+3+5=22.
3⋅22+17=83.
83−1=82.
82mod10=2.
9−2=7.
```

Portanto, o dígito verificador calculado é 7, o que concorda com o dígito verificador do exemplo.

## Tarefa

Escreva um programa que lê do teclado os 12 primeiros dígitos de um código de barras EAN-13 e escreve na tela o dígito verificador. Obs: Uma vez que os códigos de barra são usualmente separados em três partes (veja a figura), para deixar a experiência mais amigável para o usuário, o programa deve perguntar cada parte separadamente.

## Formato

Entre com a primeira parte (1 dígito): #
Entre com a segunda parte (6 dígitos): ######
Entre com a terceira parte, sem o dígito verificador (5 dígitos): #####
Dígito verificador: #

## Dicas

Para ler um dígito de cada vez utilizando a função scanf, utilize o especificador "%1d". Por exemplo, scanf("%1d%1d%1d", &n1, &n2, &n3) irá ler três dígitos do teclado, armazenando esses dígitos nas variáveis inteiras n1, n2 e n3.

Teste seu programa com produtos encontrados ao seu redor!

## Exemplos

Abaixo exemplos de execução do programa (o texto em azul corresponde ao digitado pelo usuário).

```
Entre com a primeira parte (1 dígito): 5
Entre com a segunda parte (6 dígitos): 901234
Entre com a terceira parte, sem o dígito verificador (5 dígitos): 12345
Dígito verificador: 7

Entre com a primeira parte (1 dígito): 7
Entre com a segunda parte (6 dígitos): 898513
Entre com a terceira parte, sem o dígito verificador (5 dígitos): 03018
Dígito verificador: 7

Entre com a primeira parte (1 dígito): 9
Entre com a segunda parte (6 dígitos): 780486
Entre com a terceira parte, sem o dígito verificador (5 dígitos): 26176
Dígito verificador: 8

Entre com a primeira parte (1 dígito): 7
Entre com a segunda parte (6 dígitos): 896331
Entre com a terceira parte, sem o dígito verificador (5 dígitos): 70344
Dígito verificador: 3

Entre com a primeira parte (1 dígito): 7
Entre com a segunda parte (6 dígitos): 891023
Entre com a terceira parte, sem o dígito verificador (5 dígitos): 54717
Dígito verificador: 6
```