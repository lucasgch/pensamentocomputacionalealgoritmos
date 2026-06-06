# Resistência equivalente série e paralelo

Dados $n$ valores de resistências, $R_1, \dots, R_n$, a **resistência equivalente série** é dada por

$$R_{\text{série}} = R_1 + \dots + R_n$$

e a **resistência equivalente paralelo** é dada por

$$R_{\text{paralelo}} = \left( \frac{1}{R_1} + \dots + \frac{1}{R_n} \right)^{-1}.$$

 .
## Tarefa

Escreva um programa lê do teclado a quantidade de valores de resistência, bem como o valor de cada resistência e escreve na tela o valor das resistências equivalente série e paralelo.

## Restrições

- Utilize o comando for.
- Não utilize arranjos.

## Formato

Entre com a quantidade de resistências: {int}
Entre com a resistência 1 (ohm): {float}
Entre com a resistência 2 (ohm): {float}
⋮
Entre com a resistência n (ohm): {float}
Resistência série: {float} ohm
Resistência paralelo: {float} ohm
Utilize %g para imprimir as resistências calculadas.

## Exemplos

Abaixo exemplos de execução do programa:

```text
1

Entre com a quantidade de resistências: 5
Entre com a resistência 1 (ohm): 180
Entre com a resistência 2 (ohm): 330
Entre com a resistência 3 (ohm): 180
Entre com a resistência 4 (ohm): 470
Entre com a resistência 5 (ohm): 560
Resistência série: 1720 ohm
Resistência paralelo: 55.387 ohm

Entre com a quantidade de resistências: 4
Entre com a resistência 1 (ohm): 2.2e3
Entre com a resistência 2 (ohm): 4.7e3
Entre com a resistência 3 (ohm): 1.0e3
Entre com a resistência 4 (ohm): 1.0e3
Resistência série: 8900 ohm
Resistência paralelo: 374.909 ohm

Entre com a quantidade de resistências: 3
Entre com a resistência 1 (ohm): 15
Entre com a resistência 2 (ohm): 15
Entre com a resistência 3 (ohm): 15
Resistência série: 45 ohm
Resistência paralelo: 5 ohm

Entre com a quantidade de resistências: 1
Entre com a resistência 1 (ohm): 2.2e6
Resistência série: 2.2e+06 ohm
Resistência paralelo: 2.2e+06 ohm
```
