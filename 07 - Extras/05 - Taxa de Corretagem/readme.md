# Taxa de corretagem

Retirado de King – C Programming: A Modern Approach, 2nd edition, Chapter 5, Program "Calculating a Broker's Commission", p. 81.

## Introdução

Quando ações são vendidas ou compradas através de uma corretora, a comissão da corretora é calculada de acordo com a seguinte tabela:

| Valor da Transação | Comissão |
|:-------------------| :--- |
| Menor que $2500    | $30 + 1,7% |
| $2500 a 6250      | $56 + 0,66% |
| $6250 a 20000    | $76 + 0,34% |
| $20000 a 50000    | $100 + 0,22% |
| $50000 a 500000   | $155 + 0,11% |
| Maior que $500000  | $255 + 0,09% |

Além disso, o valor mínimo de comissão é $39. Por exemplo:

Uma transação de 30000 resulta em uma comissão de $100 + 0,22% de 30000, ou seja, 166.

Uma transação de 112,50 resultaria em uma comissão de 30 + 1,7% de 112,50, ou seja, $31,91. 

No entanto, o valor mínimo de comissão é $39, então a comissão é de 39.

## Tarefa

Escreva um programa que lê do teclado um valor de transação e escreve na tela a comissão (taxa de corretagem) correspondente.

## Formato

Entre com o valor negociado: {float}
Taxa de corretagem: ${float}
A taxa de corretagem deve ser impressa com duas casas decimais.

## Exemplo

Entre com o valor negociado: 30000
Taxa de corretagem: $166.00