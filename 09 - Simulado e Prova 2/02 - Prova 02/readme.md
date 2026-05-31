## Pensamento Computacional e Algoritmos

```
Curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas
```
Professor: Roberto Wanderley da Nóbrega Semestre: 2026.

# Prova 2

**Atenção: A prova é individual e sem consulta. Não é permitido o acesso à Internet.
Não é permitido o uso de ferramentas de inteligência artificial.**

**1.** (5,0) Escreva um programa que LÊ DO TECLADO uma quantidade de segundos (um inteiro
positivo) e ESCREVE NA TELA o valor correspondente em horas, minutos e segundos, separados
por vírgula e acompanhados da unidade por extenso. Na impressão: se a quantidade de horas,
minutos ou segundos for igual a 0, não imprima nada; se a quantidade de horas, minutos ou
segundos for igual a 1, imprima a unidade no singular; caso contrário, imprima no plural. Por
exemplo:
- “25325 segundos” deve ser impresso como “7 horas, 2 minutos, 5 segundos”.
- “3600 segundos” deve ser impresso como “1 hora”.
- “120 segundos” deve ser impresso como “2 minutos”.
- “7201 segundos” deve ser impresso como “2 horas, 1 segundo”.

```
Restrições
```
- Não utilize comandos de repetição (for, while, etc.).

```
Exemplos de execução
```
```
Entre com a quantidade de segundos: 25325
7 horas, 2 minutos, 5 segundos
```
```
Entre com a quantidade de segundos: 60
1 minuto
```
```
Instituto Federal de Santa Catarina – Câmpus São José
Rua José Lino Kretzer, 608 — Praia Comprida — São José, SC — CEP: 88130-
Fone: (48) 3381-2800 — http://www.ifsc.edu.br
```

**2.** (5,0) Uma empresa de logística cobra o frete baseado na região de entrega, peso do pacote e
prazo de entrega, com as seguintes regras:
- **Região:**
‣ Sul: preço base R$ 60,00.
‣ Sudeste: preço base R$ 50,00.
‣ Centro-Oeste: preço base R$ 80,00.
- **Peso:**
‣ 500 g ou menos: sem adicional.
‣ Entre 500 g (exclusive) e 2 kg (inclusive): +R$ 15,00.
‣ Entre 2 kg (exclusive) e 10 kg (inclusive): +R$ 25,00.
‣ Mais de 10 kg: +R$ 50,00 + R$ 0,01 por g adicional.
- **Prazo:**
‣ Express (1 dia): dobro do preço.
‣ Padrão (3 dias): preço normal.
‣ SemPressa (7 dias): desconto de 15%.
Por exemplo:
- Para um pacote de **300 g** para o **Sul** com entrega **SemPressa** : Preço base R$ 60,00; sem
adicional de peso; desconto de 15%. Total: R$ 51,00.
- Para um pacote de **5 kg** para o **Sudeste** com entrega **Express** : Preço base R$ 50,00;
adicional de R$ 25,00; dobro do preço. Total: R$ 150,00.
- Para um pacote de **14 kg** para o **Centro-Oeste** com entrega **Padrão** : Preço base R$ 80,00;
adicional de R$ 50,00 + R$ 0,01 por g adicional, ou seja, adicional de R$ 50,00 + R$ 0,
× 4000 = R$ 50,00 + R$ 40,00 = R$ 90,00; preço normal. Total: R$ 170,00.
Escreva um programa que LÊ DO TECLADO a região ("S" para Sul, "SE" para Sudeste, "CO"
para Centro-Oeste), o peso em quilogramas e o prazo de entrega (1, 3 ou 7 dias) e ESCREVE
NA TELA o valor do frete. Se o usuário digitar um valor inválido para a região, o peso ou o
prazo, o programa deve reportar o erro Região inválida, Peso inválido ou Prazo inválido,
respectivamente. Para resolver este problema, você deverá necessariamente IMPLEMENTAR OS
SEGUINTES MÉTODOS:
- obtemPrecoBase, que recebe um **string** representando a região e retorna o preço base em R$.
- calculaAdicional, que recebe um número **real** representando o peso do pacote (em kg) e
retorna o adicional em R$.
- aplicaPrazo, que recebe um número **real** representado o valor do frete padrão, e número
**inteiro** representando o tipo de prazo de entrega e retorna o valor do frete já considerando
o prazo de entrega.
- calculaFrete, que recebe um **string** representando a região, um número **real** representando
o peso do pacote (em kg), e um número **inteiro** representando o tipo de prazo de entrega,
e retorna o valor final do frete em R$.

```
Instituto Federal de Santa Catarina – Câmpus São José
Rua José Lino Kretzer, 608 — Praia Comprida — São José, SC — CEP: 88130-
Fone: (48) 3381-2800 — http://www.ifsc.edu.br
```

**Restrições**

- Utilize o comando switch para a região.
- Não utilize comandos de repetição (for, while, etc.).
- Apenas o método main deve realizar entrada e saída de dados.

**Dicas**

- Se desejar, utilize throw new RuntimeException("Mensagem de erro") para tratamento de
  erros.
- Utilize formatador "%.2f" no método String.format para imprimir valores reais com duas
  casas decimais.
- Utilize String[] partes = buffer.split(" ") para realizar a leitura dos dados de entrada
  em uma única linha. Ou, se preferir, realize a leitura dos dados de entrada em três linhas
  separadas.

**Exemplos de execução**

Entre com a região (S/SE/CO), peso (kg) e prazo (1/3/7): S 0.3 7
Valor do frete: R$ 51.

Entre com a região (S/SE/CO), peso (kg) e prazo (1/3/7): SE 5.0 1
Valor do frete: R$ 150.

Entre com a região (S/SE/CO), peso (kg) e prazo (1/3/7): CO 14.0 3
Valor do frete: R$ 170.

Entre com a região (S/SE/CO), peso (kg) e prazo (1/3/7): N 0.3 7
Erro: Região inválida

Entre com a região (S/SE/CO), peso (kg) e prazo (1/3/7): S -0.3 7
Erro: Peso inválido

Entre com a região (S/SE/CO), peso (kg) e prazo (1/3/7): S 0.3 2
Erro: Prazo inválido

```
Instituto Federal de Santa Catarina – Câmpus São José
Rua José Lino Kretzer, 608 — Praia Comprida — São José, SC — CEP: 88130-
Fone: (48) 3381-2800 — http://www.ifsc.edu.br
```

