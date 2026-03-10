# Classifica triângulo

Dados os valores de três lados, $a$, $b$ e $c$, sabemos que eles *podem formar um triângulo* se e somente se a soma de quaisquer dois lados for sempre maior que o terceiro lado. Por exemplo:

* Os números $(3, 4, 5)$ formam um triângulo, pois:

$$3 + 4 > 5, \quad 3 + 5 > 4, \quad 4 + 5 > 3.$$


* Os números $(2, 3, 6)$ não formam um triângulo, pois:

$$2 + 3 > 6, \quad \text{ainda que} \quad 3 + 6 > 2 \quad \text{e} \quad 2 + 6 > 3.$$

Além disso, se os três lados de um triângulo são iguais, então ele é chamado de triângulo *equilátero*. Se dois lados são iguais e o terceiro é diferente, então ele é chamado de triângulo *isósceles*. Se todos os lados são diferentes, então ele é chamado de triângulo *escaleno*.

Elabore um fluxograma para um algoritmo que lê três números reais representando os lados de um triângulo e *Escreve* a classificação desse triângulo (Equilátero, isóceles ou escaleno) ou a mensagem: "Não forma um triângulo".
