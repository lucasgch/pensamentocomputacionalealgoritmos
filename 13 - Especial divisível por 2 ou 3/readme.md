# 13 - Número especial: divisível por 2 ou 3

Um inteiro positivo é considerado **especial** se for divisível por 2 ou por 3, mas não por ambos. No entanto, se o número for múltiplo de 10, ele não é considerado especial, independentemente de satisfazer a condição anterior. Por exemplo:

* O número **64** é especial, pois é divisível por 2 e não por 3.
* O número **33** é especial, pois é divisível por 3 e não por 2.
* O número **42** não é especial, pois é divisível simultaneamente por 2 e por 3.
* O número **80** seria especial (divisível por 2 e não por 3), mas não é, pois é múltiplo de 10.

Escreva uma expressão lógica que, dado um inteiro positivo $n$, assume o valor **T**, se $n$ é especial, ou **F**, caso contrário. *Dica: Lembre-se que $a$ é divisível por $b$ se e somente se o resto da divisão de $a$ por $b$ é igual a zero.*
