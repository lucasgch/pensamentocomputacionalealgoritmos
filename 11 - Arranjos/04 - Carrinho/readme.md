# Carrinho.java

Elabore um programa que lê do teclado números reais separados por espaço, seguidos de um inteiro . O programa deve escrever na tela os números rotacionados posições à direita, se for positivo, ou à esquerda, se for negativo. Para resolver esse problema, você deverá implementar o método void rotaciona(double[] arranjo, int r) que recebe um arranjo e a quantidade de rotações, e efetua a rotação no próprio arranjo.

## Restrição:

Apenas o método main() deve interagir com o usuário (ou seja, ler e escrever na tela). 

## Dicas:

Para , por exemplo, uma rotação de é equivalente a uma rotação de , e uma rotação de é equivalente a uma rotação de . Utilize o operador resto da divisão para simplificar a rotação.

Dentro do método rotaciona , você pode criar uma cópia do arranjo original para facilitar a rotação.

## Exemplos

```text
Entre com os elementos: 3.2 6.5 3.1 8.9 2.4
Entre com a rotação: 2
Arranjo rotacionado: 8.9 2.4 3.2 6.5 3.1

Entre com os elementos: 3.2 6.5 3.1 8.9 2.4
Entre com a rotação: 7
Arranjo rotacionado: 8.9 2.4 3.2 6.5 3.1

Entre com os elementos: 3.2 6.5 3.1 8.9 2.4
Entre com a rotação: -1
Arranjo rotacionado: 6.5 3.1 8.9 2.4 3.2

Entre com os elementos: 6 7 8
Entre com a rotação: 15
Arranjo rotacionado: 6.0 7.0 8.0
```

