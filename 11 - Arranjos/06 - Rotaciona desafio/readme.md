# Rotaciona - Desafio

Talvez a sua solução do exercício anterior tenha criado um arranjo auxiliar do mesmo tamanho do arranjo original. Isso significa memória extra proporcional a — ordem de espaço. Para um arranjo com milhões de elementos isso pode representar um custo proibitivo.

O desafio é rotacionar no próprio arranjo usando apenas uma quantidade fixa de memória extra, independente de — ordem de espaço. Isso é possível com um truque elegante: três inversões.

Mais precisamente, para rotacionar posições à direita, basta

1. Inverter o arranjo inteiro;
2. Inverter os primeiros elementos;
3. Inverter os últimos elementos.

Veja o exemplo abaixo, que considera e (rotação à direita):

Primeiramente, implemente o método auxiliar `void inverte(double[] arranjo, int inicio, int fim)` que inverte o trecho entre inicio (inclusive) e fim (inclusive), trocando o primeiro com o último, o segundo com o penúltimo, e assim por diante até as pontas se encontrarem no meio (Dica: primeiro, determine o número necessário de trocas em função de inicio e fim ). Em seguida, reescreva o método `ROTACIONA` do ex. anterior utilizando a técnica das 3 inversões.
