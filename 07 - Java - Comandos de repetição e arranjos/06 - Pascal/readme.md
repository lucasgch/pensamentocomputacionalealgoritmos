# Exercício em sala: Pascal.java

O triângulo de Pascal é uma disposição triangular de números inteiros em que o elemento na linha n e coluna k é dado pelo coeficiente binomial de ʼn na classe k, aqui denotado por Cn,k; por convenção, as linhas e colunas são numeradas a partir de 0. Por exemplo, o triângulo de Pascal até a linha n = = 6 é mostrado abaixo.

```text
1
1  1
1  2  1
1  3  3  1
1  4  6  4  1
1  5 10 10  5  1
1  6 15 20 15  6  1
```

Aqui está a formatação ideal do seu exercício em **Markdown**, utilizando expressões matemáticas em LaTeX para garantir que as fórmulas fiquem perfeitamente legíveis e profissionais.

---

### Exercício: Coeficiente Binomial com Potência Fatorial

Neste exercício, utilizaremos a seguinte fórmula para calcular o coeficiente binomial de $n$ na classe $k$:

$$C_{n,k} = \frac{n^{\underline{k}}}{k^{\underline{k}}}$$

Na expressão acima, a notação $x^{\underline{m}}$ representa a **$m$-ésima potência fatorial decrescente** de $x$, sendo definida como:

$$x^{\underline{m}} = \underbrace{x \cdot (x - 1) \cdot \dots \cdot (x - m + 1)}_{m \text{ fatores}}$$

> **Nota de contraste:** Não confunda com a potência comum de $x$ (denotada por $x^m$), que é dada por:
>
> $$x^m = \underbrace{x \cdot x \cdot \dots \cdot x}_{m \text{ fatores}}$$
>
>

#### Exemplo Prático

Como exemplo, o coeficiente binomial de $6$ na classe $4$ é dado por:

$$C_{6,4} = \frac{6^{\underline{4}}}{4^{\underline{4}}} = \frac{6 \cdot 5 \cdot 4 \cdot 3}{4 \cdot 3 \cdot 2 \cdot 1} = \frac{360}{24} = 15$$

[Enunciado](https://nobrega.prof/disciplinas/alg/slides/java-2/#/18)
