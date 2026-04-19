# Exercício em sala: Aprovado.java

Considere a nossa disciplina de ALG786201. Elabore um programa que LÊ DO TECLADO as notas de um aluno (P1, R1, P2, R2, P3, R3), além de sua frequência, e **ESCREVE NA TELA**:

- a média das notas (com uma casa decimal);
- a média arredondada (um número inteiro);

- A mensagem true, caso o aluno seja aprovado, ou false, caso contrário.

## Restrições:

- Declare uma variável boolean aprovado.
- Utilize os métodos Math.round() e Math.max().
- Não utilize os comandos if ou switch, nem o operador ternário (ainda não vimos).

## Exemplos de execução:

### Exemplo 1

```
Entre com P1 e R1: 4 5
Entre com P2 e R2: 6 0
Entre com P3 e R3: 5 8
Entre com a frequência (em %): 60
Média: 6.3
Média arredondada: 6
Aprovado: false
```

### Exemplo 2

```
Entre com P1 e R1: 4 5
Entre com P2 e R2: 5 3
Entre com P3 e R3: 7 0
Entre com a frequência (em %): 75
Média: 5.7
Média arredondada: 6
Aprovado: true
```