# Conversor de moedas

Elabore um fluxograma para um algoritmo que LÊ um número inteiro representando um valor em centavos e ESCREVE as moedas necessárias para formar esse valor, dando preferência para as moedas de maior valor. As moedas disponíveis são de 50, 25, 10, 5 e 1 centavo. Por exemplo, para formar 68 centavos é necessário 1 moeda de 50 centavos, 0 moedas de 25 centavos, 1 moeda de 10 centavos, 1 moeda de 5 centavos e 3 moedas de 1 centavo. Em seguida, execute um teste de mesa com a entrada 57; a saída deve ser 1 0 0 1 2.

## Fluxograma

```mermaid
graph TD
    A([Início]) --> B[/Leia numeroInteiro/]
    B --> C[m50 = n div 50]
    C --> D[n = n mod 50]
    D --> E[m25 = n div 25]
    E --> F[n = n mod 25]
    F --> G[m10 = n div 10]
    G --> H[n = n mod 10]
    H --> I[m5 = n div 5]
    J --> K[n = n mod 5]
    L --> M[m1 = n]
    M --> N[/Escreva m50, " ", m25, " ", m10, " ", m5, " ", m1/]
    N --> O[(Fim)]
```
