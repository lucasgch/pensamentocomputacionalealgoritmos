# Exercício em sala: Taxa de conveniência

Ao comprar ingressos para um festival de música, os fãs têm que pagar uma taxa de conveniência, além do preço do ingresso:

* Para valores de ingresso de até R$ 100,00 (inclusive), a taxa de conveniência é de R$ 8,00 + 5% do valor do ingresso.
* Para valores superiores a R$ 100,00, a taxa de conveniência é de R$ 11,00 + 2% do valor do ingresso.
* Além disso, o valor mínimo da taxa de conveniência é R$ 10,00.

**Exemplos:**

* Um ingresso de R$ 200,00 resulta em uma taxa de conveniência de R$ 11,00 + 2% de R$ 200,00, ou seja, R$ 15,00.
* Um ingresso de R$ 10,00 resultaria em uma taxa de R$ 8,00 + 5% de R$ 10,00, ou seja, R$ 8,50; no entanto, o valor mínimo da taxa de conveniência é R$ 10,00, então a taxa é R$ 10,00.

Elabore um fluxograma para um algoritmo que LÊ o valor do ingresso e ESCREVE o valor total a ser pago. Em seguida, efetue três testes de mesa: o primeiro com a entrada `5`, o segundo com a entrada `100` e o terceiro com a entrada `2000`.

## Fluxograma

- [Link para o fluxograma no fluxolab](https://fluxolab.app/?lzs=NoIhBplA3BDAbA9gJwJIDsDmyCmBnPRCABgF1IQAXWAD1gGFF1od0BLVgYzdhPJgQoAKomrwAIogzZ8hPv2DFwAZnAAmACxKAjGqVgKAI1GVEAWxCl+28BvVb1xfXCRosuAkSMnzl-mvAAdnslNQAOZ0E3GU8AHgBebScIUGNKUwtwEGQ2TAALSj9IVQA2EJUS-Wo6RmZWDnRuWHiwgGoACgBWAHok4gBKACoXFGkPOW903ytIOzKSyoqq2gYmFnYuHkTtDrVepyGR6PGvVJ8LGeBOoPKNRaoV2vWGptiklJA0jIhs3IKi4DzcqdBwPGpreqbZrvSbfS7Ba6dPRBZEgI4iMSSMayU6fc4AsLgMpIpQlUHo0QILHuHHxI7YzytaqrOobRo8D5fab8ACc4EJJKCESyKSsCh0On84G0NmUUt0tn4qiS4E6-GuMqJ-DKKrC-Dsuv4hJVgX4wRVPPV0oCesgNhVajFQA)

## Teste de mesa

Entrada: 5
Saída: 15

| Bloco | instrução | valorIngresso | taxaConveniencia | valorTotalIngresso | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | 
| Bloco 0 | Início | 0 | 0 | 0 | 0 | 0
| Bloco 1 | Leia | 5 | 0 | 0 | 5 | 0
| Bloco 2 | Condicional | 5 | 0 | 0 | 5 | 0
| Bloco 3 | Atribuição | 5 | 8.25 | 0 | 0 | 0
| Bloco 4 | Atribuição | 5 | 8.25 | 0 | 0 | 0
| Bloco 5 | Condicional | 5 | 0 | 0 | 0 | 0
| Bloco 6 | Atribuição | 5 | 10 | 0 | 0 | 0
| Bloco 7 | Atribuição | 5 | 10 | 15 | 0 | 0
| Bloco 8 | Saída | 5 | 10 | 15 | 0 | 15
| Bloco 9 | Fim | 5 | 10 | 15 | 0 | 15
