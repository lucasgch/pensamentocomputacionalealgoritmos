# 17 - Maior de três

Elabore um pseudocódigo para um algoritmo que LÊ três números reais e ESCREVE o maior deles. Em seguida, efetue testes de mesa com as seguintes entradas:

(a) `1.0 2.5 4.0`.
(b) `5.0 2.5 4.0`.
(c) `1.0 6.3 0.5`.
(d) `1.0 2.6 2.6`.

## Pseudocódigo

```pseudocódigo
Variáveis
    a, b, c, maior: número //real
Início
    Escreva "Entre com 3 números reais:"
    Leia a, b, c
    Se a>=b
        maior = a
    Senão
        maior = b
    Fim
    Se c>maior
        maior =c
    Fim
    Escreva "Maior número: ", maior
Fim
```

## Teste de mesa

### Teste de mesa a

Entrada: `1.0 2.5 4.0`.
Saída: `Maior número: 4`

| Bloco | instrução | a | b | c | maior | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | 0 | 0 | 0 | 0 | 0 | 0
| Bloco 1 | Escreva | 0 | 0 | 0 | 0 | 0 | "Entre com 3 números reais: "
| Bloco 2 | Leia | 1.0 | 2.5 | 4.0 | 0 | 1.0 2.5 4.0 | 0
| Bloco 3 | Condicional Se | 1.0 | 2.5 | 4.0 | 0 | 0 | 0
| Bloco 7 | Condicional Se | 1.0 | 2.5 | 4.0 | 0 | 0 | 0
| Bloco 8 | Atribuição | 1.0 | 2.5 | 4.0 | 4.0 | 0 | 0
| Bloco 9 | Saída | 1.0 | 2.5 | 4.0 | 4.0 | 0 | 4.0
| Bloco 10 | Fim | 1.0 | 2.5 | 4.0 | 4.0 | 0 | 0

### Teste de mesa b

Entrada: `5.0 2.5 4.0`
Saída: `Maior número: 5`

| Bloco | instrução | a | b | c | maior | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | 0 | 0 | 0 | 0 | 0 | 0
| Bloco 1 | Escreva | 0 | 0 | 0 | 0 | 0 | "Entre com 3 números reais: "
| Bloco 2 | Leia | 5.0 | 2.5 | 4.0 | 0 | 5.0 2.5 4.0 | 0
| Bloco 3 | Condicional Se | 5.0 | 2.5 | 4.0 | 0 | 0 | 0
| Bloco 4 | Atribuição | 1.0 | 2.5 | 4.0 | 5.0 | 0 | 0
| Bloco 7 | Condicional Se | 1.0 | 2.5 | 4.0 | 5.0 | 0 | 0
| Bloco 9 | Saída | 1.0 | 2.5 | 4.0 | 4.0 | 0 | 5.0
| Bloco 10 | Fim | 1.0 | 2.5 | 4.0 | 4.0 | 0 | 0

### Teste de mesa c

Entrada: `1.0 6.3 0.5`
Saída: `Maior número: 6.3`

| Bloco | instrução | a | b | c | maior | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | 0 | 0 | 0 | 0 | 0 | 0
| Bloco 1 | Escreva | 0 | 0 | 0 | 0 | 0 | "Entre com 3 números reais: "
| Bloco 2 | Leia | 1.0 | 6.3 | 0.5 | 0 | 1.0 6.3 0.5 | 0
| Bloco 3 | Condicional Se | 1.0 | 6.3 | 0.5 | 0 | 0 | 0
| Bloco 5 | Condicional Senão | 1.0 | 6.3 | 0.5 | 6.3 | 0 | 0
| Bloco 6 | Atribuição | 1.0 | 6.3 | 0.5 | 6.3 | 0 | 0
| Bloco 7 | Condicional Se | 1.0 | 6.3 | 0.5 | 6.3 | 0 | 0
| Bloco 9 | Saída | 1.0 | 6.3 | 0.5 | 6.3 | 0 | 6.3
| Bloco 10 | Fim | 1.0 | 6.3 | 0.5 | 6.3 | 0 | 0

### Teste de mesa d

Entrada: `1.0 2.6 2.6`
Saída: `Maior número: 2.6`

| Bloco | instrução | a | b | c | maior | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | 0 | 0 | 0 | 0 | 0 | 0
| Bloco 1 | Escreva | 0 | 0 | 0 | 0 | 0 | "Entre com 3 números reais: "
| Bloco 2 | Leia | 1.0 | 2.6 | 2.6 | 0 | 1.0 2.6 2.6 | 0
| Bloco 3 | Condicional Se | 1.0 | 2.6 | 2.6 | 0 | 0 | 0
| Bloco 4 | Atribuição | 1.0 | 2.6 | 2.6 | 2.6 | 0 | 0
| Bloco 7 | Condicional Se | 1.0 | 2.6 | 2.6 | 2.6 | 0 | 0
| Bloco 9 | Saída | 1.0 | 2.6 | 2.6 | 2.6 | 0 | 2.6
| Bloco 10 | Fim | 1.0 | 2.6 | 2.6 | 2.6 | 0 | 0
