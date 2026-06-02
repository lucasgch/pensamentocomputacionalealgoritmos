# Avaliações de PRG1

Em uma certa disciplina de um determinado curso de graduação, os alunos são avaliados por meio de três avaliações individuais e sem consulta, com pontuações variando de 0 a 10 pontos. Cada avaliação possui uma recuperação, onde o maior valor obtido entre a avaliação original e a recuperação é considerado. O resultado final da disciplina é calculado pela média aritmética simples das três avaliações, arredondada para o inteiro mais próximo. O resultado mínimo para aprovação na disciplina é 6. Alunos com frequência inferior a 75% receberão o resultado 0.

## Tarefa

Escreva um programa que `lê do teclado` os valores das três avaliações, das três recuperações e da frequência do aluno, e escreve na tela o resultado final da disciplina e a situação do aluno (aprovado ou reprovado). Caso o aluno não tenha realizado a recuperação de uma das avaliações, a nota deve ser entrada como um valor negativo (por exemplo, -1).

Para resolver esse problema, você deverá **implementar as seguintes funções**:

## maximo

- Parâmetros
  - float x, y - Dois números reais.

- Retorno
  - float - O maior valor entre x e y.

## media

- Parâmetros
  - float x, y, z - Três números reais.
  
- Retorno
  - float - A média aritmética simples de x, y e z.

## arredonda

- Parâmetros
  - float x

- Retorno
  - int - O inteiro mais próximo de x.

## Restrições

Não utilize a biblioteca math.h.

## Formato

```
Entre com P1 e R1: {float} {float}
Entre com P2 e R2: {float} {float}
Entre com P3 e R3: {float} {float}
Entre com a frequência (%): {float}
Resultado final: {int}
Situação: [aprovado | reprovado]
```

## Dicas

1. Para imprimir o símbolo de porcentagem (%), utilize %% na função printf.

2. Para converter de float para int, utilize conversão explícita (casting). Por exemplo, se x é float, então (int)x é int. Note, no entanto, que a conversão de float para int trunca o valor, ou seja, remove a parte decimal — por exemplo, (int)3.9 vale 3, e não 4. Como realizar o arredondamento, então?

## Exemplos

```
Entre com P1 e R1: 7.5 5.0
Entre com P2 e R2: 8.0 -1
Entre com P3 e R3: 6.5 7.0
Entre com a frequência (%): 90.0
Resultado final: 8
Situação: aprovado

Entre com P1 e R1: 3.0 -1
Entre com P2 e R2: 4.0 8.0
Entre com P3 e R3: 9.0 6.0
Entre com a frequência (%): 60.0
Resultado final: 0
Situação: reprovado

Entre com P1 e R1: 10.0 9.0
Entre com P2 e R2: 8.0 -1
Entre com P3 e R3: 7.0 9.5
Entre com a frequência (%): 85.0
Resultado final: 9
Situação: aprovado

Entre com P1 e R1: 4.0 -1
Entre com P2 e R2: 2.0 3.5
Entre com P3 e R3: 6.0 5.0
Entre com a frequência (%): 80.0
Resultado final: 5
Situação: reprovado

Entre com P1 e R1: 10.0 -1
Entre com P2 e R2: 6.5 -1
Entre com P3 e R3: 0.0 -1
Entre com a frequência (%): 75.0
Resultado final: 6
Situação: aprovado

Entre com P1 e R1: 10.0 10.0
Entre com P2 e R2: 10.0 10.0
Entre com P3 e R3: 10.0 10.0
Entre com a frequência (%): 74.0
Resultado final: 0
Situação: reprovado
```