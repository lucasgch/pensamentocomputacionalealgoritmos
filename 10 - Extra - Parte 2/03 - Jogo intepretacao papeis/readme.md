# Jogo de interpretação de papéis

## Introdução

Em um determinado jogo de interpretação de papéis, a habilidade de vitalidade de um personagem aumenta a cada nível alcançado pelo mesmo, de acordo com sua classe; além disso, cada classe começa (no nível 0) com um valor de vitalidade pré-estabelecido. A tabela abaixo traz as informações relevantes.

| Classe | Vitalidade inicial | Incremento a cada nível |
| --- | --- | --- |
| Arqueiro | 150 | 10 |
| Bárbaro | 200 | 15 |
| Druida | 100 | 5 |
| Mago | 100 | 5 |

Há também o seguinte fator complicador que deve ser levado em conta: se o nível recém alcançado for um múltiplo de 5, então o incremento é dobrado, a título de bônus para o personagem.

A tabela abaixo ilustra o valor da vitalidade em função do nível do personagem, para a classe arqueiro. Perceba que, normalmente, a vitalidade é incrementada de 10; no entanto, do nível 4 para o 5 e do nível 9 para o 10 houve um incremento de 20 devido ao bônus. (A tabela continua para níveis maiores que 10, mas não é mostrada aqui por motivos de espaço.)

Aqui está a tabela formatada em Markdown:

| Nível | Vitalidade |
| --- | --- |
| 0 | 150 |
| 1 | 160 |
| 2 | 170 |
| 3 | 180 |
| 4 | 190 |
| 5 | 210 |
| 6 | 220 |
| 7 | 230 |
| 8 | 240 |
| 9 | 250 |
| 10 | 270 |
| etc | etc |

## Tarefa

Escreva um programa que lê do teclado a classe do personagem (codificada da seguinte maneira: 1 – arqueiro, 2 – bárbaro, 3 – druida, 4 – mago) e um valor de vitalidade desejado e escreve na tela o nível mínimo necessário que fornece vitalidade maior ou igual a desejada para a classe em questão.

Caso o usuário entre com um código de classe fora da faixa de 1 a 4, o programa deve exibir uma mensagem informando que a classe é inválida e terminar imediatamente (dica: utilize a instrução return 0 para isso).

Para resolver esse problema, você deverá **implementar a seguinte função**:

### Nivel_minimo

- Parâmetros
  - int v0 - Vitalidade inicial.
  - int inc - Incremento a cada nível.
  - int v - Vitalidade desejada.
- Retorno
  - int - Nível mínimo necessário para atingir a vitalidade v ou maior, a partir da vitalidade inicial v0, com incremento inc.

## Restrições

- Utilize o comando switch na função main.
- Utilize o comando while na função nivel_minimo.
- Apenas a função main deve realizar entrada e saída de dados.

## Formato

Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): {int}
Classe inválida
    ou
Entre com a vitalidade desejada: {int}
Nível necessário: {int}

## Exemplos

Abaixo exemplos de execução do programa (o texto em azul corresponde ao digitado pelo usuário).

```texto
Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): 1
Entre com a vitalidade desejada: 180
Nível necessário: 3

Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): 1
Entre com a vitalidade desejada: 179
Nível necessário: 3

Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): 1
Entre com a vitalidade desejada: 181
Nível necessário: 4

Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): 1
Entre com a vitalidade desejada: 196
Nível necessário: 5

Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): 1
Entre com a vitalidade desejada: 213
Nível necessário: 6

Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): 7
Classe inválida

Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): 1
Entre com a vitalidade desejada: 5000
Nível necessário: 405

Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): 2
Entre com a vitalidade desejada: 5000
Nível necessário: 267

Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): 3
Entre com a vitalidade desejada: 5000
Nível necessário: 817

Entre com a classe (1-arqueiro, 2-bárbaro, 3-druida, 4-mago): 4
Entre com a vitalidade desejada: 5000
Nível necessário: 817
```
