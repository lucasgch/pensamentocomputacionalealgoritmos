# 12 - Vogal ou consoante

Escreva uma expressão lógica que, dado um caractere chamado letra, representando uma letra minúscula do alfabeto latino, assume o valor T, se letra é uma vogal, ou F, se letra é uma consoante.

## Expressão lógica

`ehVogal -> ( letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u" )`

## Pseudocódigo

```pseudocódigo
Variáveis
    letra: texto
    éVogal: lógico
Início
    Leia letra
    éVogal = letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u"
    Escreva éVogal
Fim
```
