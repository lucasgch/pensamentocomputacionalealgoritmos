# Exercício em sala: Voto no Brasil

De acordo com o Art. 14, § 1º, da Constituição Federal de 1988:

“O alistamento eleitoral e o voto são: I – obrigatórios para os maiores de dezoito anos; II – facultativos para: a) os analfabetos; b) os maiores de setenta anos; c) os maiores de dezesseis e menores de dezoito anos.”

a. Escreva uma expressão lógica para a variável booleana obrig que, dada a variável inteira idade (representando a idade de um brasileiro) e a variável booleana analf (representando se ele é analfabeto ou não), assume o valor T, se o voto do brasileiro é obrigatório, ou F, caso contrário.

`obrig -> (idade>18 && idade<70) && !analf;`

b. Repita o item anterior, mas agora para a variável booleana facul, que assume o valor T, se o voto do brasileiro é facultativo, ou F, caso contrário.
Obs.: Atente para o fato de que obrigatoriedade e facultatividade são mutuamente excludentes (ou seja, se uma é verdadeira, a outra é falsa); no entanto, isso não impede que ambas sejam falsas.

`facul -> !((idade>18 && idade<60) && !analf)`

c. Considere agora a variável booleana $inapto \leftarrow idade < 16$, que indica se um brasileiro é inapto para votar. Como a variável facul poderia ser reescrita em termos das variáveis obrig e inapto?

## Soluções

### A

`obrig -> (idade>18 && idade<70) && !analf;`

[Link para fluxograma A no fluxolab](https://fluxolab.app/?lzs=NoIhBplBLATBDWBTCAGAupE8B28A2AZhAEyagD2ARgE7QDmp5Ih8AxgK75PnCrgBmcCQBs-AIyp+YLFQoAXeRQC2IdOXHgALMLHhxADmlxEScAAJcBYrIVLV6yEIO7+WrdIjBHwHQFZXQT0Qajp6C1ZObltFFTVyAJFAgSlwFnYuAF4AChNkAD4AdlRzAB9S81yEAvERcwAyevM8pAAeQwBKMors5uqkfMMGppbW4uHLPCIujq8QOViHchJwJNF+Eg800IZzTMqWwYMJ0eKuxsnrOYX7eN4JCXIdSUEE-TcNd+Flr791dCAA)

### B

`facul = ( idade > 70 || (idade >= 16 && idade < 18) || idade >=18 && idade <=70 && analf)`

[Link para fluxograma B no fluxolab](https://fluxolab.app/?lzs=NoIhBplBLATBDWBTCAGAupE8B28A2AZhAEyaiHwDGArvqeucKuAMzgkBsLAjKi2CwAjAPYAXMSIC2IRpB7gALB27geADgFxEScAAJcBYsPGSZc4CXCcVLLgMq18AXj3bkAPgDsqPQB8-PQAKdyQ9Dz0eTj0AMhi3BGQAHg0ASn9AkMSwjw1Y+NCk5x90uIM8IghQUQlpWXJ2dVs2TXBBYAtlAFZm1hIHajoqkBqzeqZeXnIFPg5yK1nFcmVZ1kZ0IA)

### C

`facul -> !obrig && !inapto`

[Link para o fluxograma C no fluxolab](https://fluxolab.app/?lzs=NoIhBplBLATBDWBTCAGAupE8B28A2AZhAEyagD2ARgE7QDmp5I0eADgC4VNaHwDGAV3xNywVOADM4EgDYJARlQSwWKhQ5cAtiHTkF4ACwz54BQA4VcREnAACXAWJqN23eWnmTEw5fCrgPUhjAFZvIxIVajp6ez4hfHtWeE5uF00KHSDgMNlwyWV-ZNS7AF47a2QAHlKFWQhQdQys8hJwPLkJEkMo2gYyuwAKSqQAPgs7ADJJioRqgHZUAEopmcciBpAmt2y8jtNJUxB44QGAQmj+6bsz4q5N7cz3MUVFcmMlKX0zLtaf8BC5DCn1k5Dyn0MenQQA)
