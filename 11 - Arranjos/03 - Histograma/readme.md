# Exercício em sala: Histograma.java

Considere várias rolagens de um par de dados. Utilizando teoria da probabilidade é possível calcular a frequência esperada de cada resultado (soma dos dados) como abaixo:

| Resultado | Frequência | Percentual |
| :---: | :---: | :---: |
| 2 | 1/36 | 2,78% |
| 3 | 2/36 | 5,56% |
| 4 | 3/36 | 8,33% |
| 5 | 4/36 | 11,11% |
| 6 | 5/36 | 13,89% |
| 7 | 6/36 | 16,67% |
| 8 | 5/36 | 13,89% |
| 9 | 4/36 | 11,11% |
| 10 | 3/36 | 8,33% |
| 11 | 2/36 | 5,56% |
| 12 | 1/36 | 2,78% |

Elabore um programa que lê do teclado o número de rolagens a serem realizadas, simula as rolagens (aleatoriamente) e escreve na tela o percentual de ocorrência de cada resultado.

## Dica

- Crie um objeto da classe Random (por exemplo: Random rnd = new Random() ) e utilize o método nextInt desta classe para gerar um inteiro aleatório.
- Consulte a documentação da classe caso necessário.

## Exemplo de execução

```text
Entre com o número de rolagens: 1000000
 2 :  2.76%
 3 :  5.55%
 4 :  8.33%
 5 : 11.03%
 6 : 13.91%
 7 : 16.68%
 8 : 13.91%
 9 : 11.12%
10 :  8.33%
11 :  5.57%
12 :  2.80%
```
