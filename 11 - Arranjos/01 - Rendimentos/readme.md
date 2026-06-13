# Rendimento

Elabore um programa que escreve na tela uma tabela de rendimentos referente a cinco aplicações financeiras, com rendimentos de 6%, 6,5%, 7%, 7,5 e 8% ao ano, considerando um investimento inicial de e contemplando um período de quatro anos. A tabela final deve ser a seguinte:

| Ano | 6% | 6,5% | 7% | 7,5% | 8% |
| :---: | :---: | :---: | :---: | :---: | :---: |
| **1** | 10.600,00 | 10.650,00 | 10.700,00 | 10.750,00 | 10.800,00 |
| **2** | 11.236,00 | 11.342,25 | 11.449,00 | 11.556,25 | 11.664,00 |
| **3** | 11.910,16 | 12.079,50 | 12.250,43 | 12.422,97 | 12.597,12 |
| **4** | 12.624,77 | 12.864,66 | 13.107,96 | 13.354,69 | 13.604,89 |

Note que o programa não deve solicitar nenhuma entrada do usuário.

## Restrições:

Faça uso das seguintes constantes:

```java
final double VALOR_INICIAL = 10000.0;
final double TAXA_INICIAL = 6.0;
final double PASSO_TAXA = 0.5;
final int NUM_TAXAS = 5;
final int NUM_ANOS = 4;
```

- Defina um arranjo taxa de tamanho NUM_TAXAS para armazenar as taxas de rendimento (uma vez inicializado em um loop, não é necessário alterar o valor das taxas).
- Defina um arranjo valor de tamanho NUM_TAXAS que começa com o valor inicial e é atualizado e impresso a cada ano. Não utilize arranjos bidimensionais.
