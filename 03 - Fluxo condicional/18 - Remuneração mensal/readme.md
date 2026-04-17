# 18 - Remuneração mensal

Considere um vendedor cuja *remuneração mensal* é composta por um *salário fixo* de R$ 2.000,00 mais uma *comissão* que depende do valor total de suas vendas. A comissão inicial é de 5% sobre o valor total de vendas, mas se o valor total de vendas alcançar a *meta* de R$ 10.000,00, a comissão passa a ser de 7%. Além disso, quando a *avaliação de desempenho* do vendedor for igual ou superior a 8, ele recebe um *bônus* de R$ 500,00.

Elabore um fluxograma para um algoritmo que LÊ o valor total de vendas e a avaliação de desempenho do vendedor e ESCREVE o valor total da remuneração mensal. Em seguida, efetue três testes de mesa: o primeiro com a entrada 5000 7, o segundo com a entrada 15000 8 e o terceiro com a entrada 20000 5.

## Fluxograma

[Link para fluxograma no fluxolab](https://fluxolab.app/?lzs=NoIhBplAXB7aCGAbAagUwHYBMEGcIAMAupCAgG7ICWCAxgrOtmlrAE6EmhtoC2ArhjRs6DALKZcyTl2AFwAZnAAmAGzyAjAXlhSAI3hxeIIlw3gALCvUrlOuIlSYcucAAIK1UY2ct2EUANoIxMuZXAAVmtNGxAAHRAASQwAM3ZeNDdYNwdkNyxM8mc8N0yED0okGgBzgGPs1jci5lY2BICQIJDTSCUAdmjFbXAQXKdsPAA+AF4tbQIOrthjEbYqAHMAC2hQyCtVFXkFAA4dHgEhEXpYCQwpJDdpnPhkJhcAKgIAOgI+twBqZ6ON54RaGZa7YBRAZqeQWWKeKreN5+NgzY5g4IQ1YbbaQg4HDQWeQRYmrPiCYTeW73abnSlXcSSZD-CLaTHdLgDAnDE5nCmXanMh5PMYg3CfH4RAFA17FfD6cHGHrAY6RQaqMkgemC6406SKrHKrgATnAath4D6dhGAVMsk08mUYXAWldZldRy4Sg05gsXCsboiXCivvAqm9rvCfS5nsiXEJ8mOXDVbpNIaj5vtQA)

## Teste de mesa

### Teste de mesa 1

Entrada: 5000 7
Saída: 5250

| Bloco | instrução | totV | avVend | remMensal | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | 0 | 0 | 0 | 0 | 0 | 0
| Bloco 1 | Escreva | 0 | 0 | 0 | 0 | 0 | "Total vendas: "
| Bloco 2 | Leia | 5000 | 7 | 0 | 0 | 5000 7 | 0
| Bloco 3 | Condicional | 5000 | 7 | 0 | 0 | 0 | 0
| Bloco 5 | Atribuição | 5000 | 7 | 5250 | 0 | 0 | 0
| Bloco 6 | Condicional | 5000 | 7 | 5250 | 0 | 0 | 0
| Bloco 8 | Saída | 5000 | 7 | 5250 | 0 | 0 | 5250
| Bloco 9 | Fim | 1.0 | 2.6 | 2.6 | 2.6 | 0 | 0

### Teste de mesa 2

Entrada: 15000 8
Saída: 16550

| Bloco | instrução | totV | avVend | remMensal | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | 0 | 0 | 0 | 0 | 0
| Bloco 1 | Escreva | 0 | 0 | 0 | 0 | "Total vendas: "
| Bloco 2 | Leia | 5000 | 7 | 0 | 5000 7 | 0
| Bloco 3 | Condicional | 5000 | 7 | 0 | 0 | 0
| Bloco 4 | Atribuição | 5000 | 7 | 16050 | 0 | 0
| Bloco 6 | Condicional | 5000 | 7 | 16050 | 0 | 0
| Bloco 7 | Atribuição | 5000 | 7 | 16550 | 0 | 0
| Bloco 8 | Saída | 5000 | 7 | 16550 | 0 | 16550
| Bloco 9 | Fim | 5000 | 7 | 16550 | 0 | 0

### Teste de mesa 3

Entrada: 20000 5
Saída: 21400

| Bloco | instrução | totV | avVend | remMensal | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | 0 | 0 | 0 | 0 | 0
| Bloco 1 | Escreva | 0 | 0 | 0 | 0 | "Total vendas: "
| Bloco 2 | Leia | 20000 | 5 | 0 | 20000 5 | 0
| Bloco 3 | Condicional | 20000 | 5 | 0 | 0 | 0
| Bloco 4 | Atribuição | 20000 | 5 | 21400 | 0 | 0
| Bloco 6 | Condicional | 20000 | 5 | 21400 | 0 | 0
| Bloco 8 | Saída | 20000 | 5 | 21400 | 0 | 21400
| Bloco 9 | Fim | 20000 | 5 | 21400 | 0 | 0
