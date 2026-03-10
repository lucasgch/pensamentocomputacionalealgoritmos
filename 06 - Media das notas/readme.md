# Media das notas

Elabore um fluxograma para um algoritmo que LÊ quatro número reais representando as notas de um aluno e ESCREVE a média aritmética simples destas notas. Utilize apenas duas variáveis. Em seguida, execute um teste de mesa com a entrada 7.5 8.0 5.5 9.0; a saída deve ser 7.5.

## Fluxograma

```mermaid
graph TD
    A([Início]) --> B[/Leia nota/]
    B --> C[media = media + nota]
    C --> D[/Leia nota/]
    D --> E[media = media + nota]
    E --> F[/Leia nota/]
    F --> G[media = media + nota]
    G --> H[/Escreva media/]
    H --> I([Fim])
```
