# Simulado 1

## 1 - Consumo de água recomendado

Elabore um fluxograma para um algoritmo que LÊ um número inteiro representando a idade (em anos) e um número real representando o peso (em kg) de uma pessoa, seguido de um número inteiro representando quantos copos de água a pessoa já ingeriu no dia, e ESCREVE quantos copos de água ainda faltam para atingir a quantidade diária recomendada, ou a mensagem Já atingiu caso a pessoa já tenha ingerido tal quantidade. Considere copos de água de 250 mL e que a quantidade diária recomendada de água é dada pela tabela a seguir.


|      Idade       |   Quantidade de água    |
|:----------------:|:-----------------------:|
|   Até 17 anos    |  40 mL por kg corporal  | 
| De 18 a 55 anos  |  35 mL por kg corporal  |
| De 56 a 65 anos  | 30 mL por kg corporal   |
|  66 anos ou mais |  25 mL por kg corporal  |

Por exemplo, suponha uma pessoa com 40 anos, 70 kg e que já ingeriu 4 copos de água. Nesse caso, a quantidade diária recomendada de água para essa pessoa é 35 mL/kg, ou seja, 2450 mL. Isso corresponde a 9,8 copos de água (arrendondado para 10 copos). Como a pessoa já ingeriu 4 copos, faltam 6 copos para atingir a quantidade diária recomendada. Portanto, se a entrada
for 40 70 4, a saída deve ser 6.

Outro exemplo: suponha uma pessoa com 72 anos, 80 kg e que já ingeriu 10 copos de água. Nesse caso, a quantidade diária recomendada de água para essa pessoa é 25 mL/kg, ou seja, 2000 mL. Isso corresponde a 8 copos de água. Como a pessoa já ingeriu 10 copos, a quantidade diária recomendada já foi atingida. Portanto, se a entrada for 72 80 10, a saída deve ser Já atingiu.
Em seguida, execute um teste de mesa para a entrada 18 52 5; a saída deve ser 2. 

**Obs.:** Assuma a existência de uma função round que arredonda um número real para o inteiro
mais próximo.

## 2 - Tempo total e tempo médio

Considere uma corrida de rua onde os participantes correm duas voltas. Elabore um pseudocódigo para um algoritmo que **LÊ** o número total de corredores na competição, seguido pelos tempos das duas voltas de cada corredor, e **ESCREVE** o tempo total de cada corredor e o tempo médio de todos os corredores na competição.

Segue um exemplo de execução:

```
Entre com o número de corredores: 3
Entre com os tempos das voltas do corredor 1: 15.2 14.8
Tempo total do corredor 1: 30.0
Entre com os tempos das voltas do corredor 2: 14.5 15.0
Tempo total do corredor 2: 29.5
Entre com os tempos das voltas do corredor 3: 16.0 15.5
Tempo total do corredor 3: 31.5
Tempo médio dos corredores: 30.3333
```

**Obs.:**
• Não há necessidade de executar teste de mesa.
• Não há necessidade de escrever as mensagens de instrução ao usuário

## Soluções

- [Solução 1 no fluxolab](https://fluxolab.app/?lzs=NoIhBplBLATBDWBTCAGAupEAHJBnAezU1AGMDsC9itoA7AcyQCc54bQAzeAGwBd4AWw4hmScoKR0ECYiWCpwAZnAAmAByKAjKkVgsAIwJ8+BYehJbwAFjWbwWgGx62ycAAJchD+UrVDxqbmJKrgjnaKqqoujCxs7gC87r5UAFSqAKyoEKBGJmYgFpAqAOwRyrrgIK5IADwJWiU5IHlBEKLQDAAWfIUktmVZikqV1TJ1CRkZza0FVazdvUXAGeBlJdEVLuP1jtMB+cLznT19kOHhGsP2ouJmUjLwCdaoqV5EB23LZeFDyjdiCQPRBPJQZN74D65QIFZbqMJrTZKAF3STSEEJEYQwgzGHBSAATgRBJe-z0gPu6IQCUy2KhLTxZ2AOjWYU21hu9CYrAQAD4KWjHrjDu0FqdllorKs-iVRgAdEAAKQAh+54HwudAAK4K4VfSyhcIEzYZUkgbj8IQJAXAhAAWi5cVkn1hlhURs2jk25t4AkECQtfvcsGgADd3Jlsi78czbKtjYpZXpA0I9a7IFpVvCSqTNHochZ5NptJYHJEQmXlCQVFpQtZ+g4rCVq42wiRVpLwOoG7XwBl2w5QgSSOEWToSGUxxhIPCpyQiXOM9orJLLNpQrWDZWtEo3dv6xmV9p+xnbGP+xYgA)

### Solução 2 em pseudocódigo

```delphi
Variáveis
    iterador, numeroTotalCorredores, volta1, volta2: número
    tempoDoCorredor, tempoTotalDaProva, tempoMédio: número

Início

    tempoTotalDaProva = 0
    iterador = 1
    
    Escreva "Entre com o número de corredores: "
    Leia numeroTotalCorredores

    Enquanto (iterador<=numeroTotalCorredores)
        Escreva "Entre com os tempos das voltas do corredor ", iterador, ": "
        Leia volta1, volta2
        tempoDoCorredor = volta1+volta2
        tempoTotalDaProva = tempoTotalDaProva + tempoDoCorredor
        iterador = iterador + 1
    FimEnquanto

    tempoMédio = tempoTotalDaProva/numeroTotalCorredores

    Escreva "Tempo médio dos corredores: ",tempoMédio

Fim
```



