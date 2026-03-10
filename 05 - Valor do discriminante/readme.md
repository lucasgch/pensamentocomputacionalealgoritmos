# Valor do discriminante

Elabore um pseudocódigo para um algoritmo que LÊ três números reais $a$, $b$ e $c$, representando os coeficientes de uma equação de segundo grau, e ESCREVE o valor do discriminante $\Delta = b^2 - 4ac$ da equação. Assuma que não há operador de potência (exponenciação) disponível. Em seguida, execute um teste de mesa com a entrada 1 5 -3; a saída deve ser 37.

## Pseudocódigo

```pseudocódigo
Variáveis
    Número real: a, b, c, d
Início
    Leia a, b, c
    Atribuição d = b*b -4*a*c
    Escreva d
Fim
```

## Teste de mesa

| Bloco | instrução | a | b | c | d | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| Bloco 0 | Início | 0 | 0 | 0 | 0 | 0 | 0 |
| Bloco 1 | Leia | 1 | 5 | 3 | 1 5 3 | 0 | 0 |
| Bloco 2 | Atribuição | 1 | 5 | 3 | 13 | 0 | 0 |
| Bloco 3 | Escreva | 1 | 5 | 3 | 13 | 0 | 13 |
| Bloco 4 | Fim | 1 | 5 | 3 | 13 | 0 | 0 |