## Pensamento Computacional e Algoritmos

```
Curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas
```
Professor: Roberto Wanderley da Nóbrega Semestre: 2026.

# Simulado 2

**Atenção: A prova é individual e sem consulta. Não é permitido o acesso à Internet.
Não é permitido o uso de ferramentas de inteligência artificial.**

**1.** (3,0) Escreva um programa que LÊ DO TECLADO um valor em centavos e ESCREVE NA TELA a
quantidade de moedas necessárias para formar esse valor, dando prioridade para as moedas de
maior valor. As moedas disponíveis são de 50, 25, 10, 5, e 1 centavo. Por exemplo,
- Para formar 169 centavos, é necessário:
‣ 3 moedas de 50 centavos;
‣ 1 moedas de 10 centavos;
‣ 1 moeda de 5 centavos;
‣ 4 moedas de 1 centavo.
- Para formar 7 centavos é necessário:
‣ 1 moeda de 5 centavos;
‣ 2 moedas de 1 centavo.

```
Restrições
```
- Não utilize comandos de decisão (if, switch, operador ternário).
- Não utilize comandos de repetição (for, while, etc.).

```
Exemplos de execução
```
```
Entre com a quantidade de centavos: 169
Moedas de 50 centavos: 3
Moedas de 25 centavos: 0
Moedas de 10 centavos: 1
Moedas de 5 centavos: 1
Moedas de 1 centavo: 4
```
```
Entre com a quantidade de centavos: 51
Moedas de 50 centavos: 1
Moedas de 25 centavos: 0
Moedas de 10 centavos: 0
Moedas de 5 centavos: 0
Moedas de 1 centavo: 1
```
```
Instituto Federal de Santa Catarina – Câmpus São José
Rua José Lino Kretzer, 608 — Praia Comprida — São José, SC — CEP: 88130-
Fone: (48) 3381-2800 — http://www.ifsc.edu.br
```

**2.** (3,0) Uma empresa de logística cobra o frete baseado na região de entrega, peso do pacote e
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
‣ Rápido (3 dias): preço normal.
‣ Normal (7 dias): desconto de 15%.
Por exemplo:
- Para um pacote de **300 g** para o **Sul** com entrega **Normal** : Preço base R$ 60,00; sem
adicional de peso; desconto de 15%. Total: R$ 51,00.
- Para um pacote de **5 kg** para o **Sudeste** com entrega **Express** : Preço base R$ 50,00;
adicional de R$ 25,00; dobro do preço. Total: R$ 150,00.
- Para um pacote de **14 kg** para o **Centro-Oeste** com entrega **Rápido** : Preço base R$ 80,00;
adicional de R$ 50,00 + R$ 0,01 por g adicional, ou seja, adicional de R$ 50,00 + R$ 0,
× 4000 = R$ 50,00 + R$ 40,00 = R$ 90,00; preço normal. Total: R$ 170,00.
Escreva um programa que LÊ DO TECLADO a região ("S" para Sul, "E" para Sudeste, "O" para
Centro-Oeste), o peso em gramas e o prazo de entrega (1, 3 ou 7 dias) e ESCREVE NA TELA o
valor do frete. Se o usuário digitar um valor inválido para a região ou prazo, o programa deve
reportar o erro Região inválida ou Prazo inválido, respectivamente.

```
Restrições
```
- Utilize o comando switch para a região e o prazo.
- Não utilize comandos de repetição (for, while, etc.).
- Não utilize arranjos.
- Utilize formatador "%.2f" no método String.format para imprimir com duas casas decimais.

```
Exemplos de execução
```
```
Entre com a região (S/E/O), peso (g) e prazo (1/3/7): S 300 7
Valor do frete: R$ 51.
```
```
Instituto Federal de Santa Catarina – Câmpus São José
Rua José Lino Kretzer, 608 — Praia Comprida — São José, SC — CEP: 88130-
Fone: (48) 3381-2800 — http://www.ifsc.edu.br
```

```
Entre com a região (S/E/O), peso (g) e prazo (1/3/7): E 5000 1
Valor do frete: R$ 150.
Entre com a região (S/E/O), peso (g) e prazo (1/3/7): O 14000 3
Valor do frete: R$ 170.
```
```
Entre com a região (S/E/O), peso (g) e prazo (1/3/7): N 1000 3
Erro: Região inválida
```
```
Entre com a região (S/E/O), peso (g) e prazo (1/3/7): S 1000 5
Erro: Prazo inválido
```
**3.** (4,0) A **média truncada** de cinco números é calculada removendo exatamente uma ocorrência
do **menor** valor e exatamente uma ocorrência do **maior** valor; calcula-se então a média
aritmética simples dos três valores restantes. Por exemplo, a média truncada dos números
24. 3 , 10. 4 , 32. 6 , 32. 6 , 12. 4

```
é
12. 4 + 24. 3 + 32. 6
3 =^23.^1 ,
onde foram descartados os valores 10. 4 e 32. 6.
Elabore um programa que LÊ DO TECLADO cinco números reais e ESCREVE NA TELA a média
truncada desses números. Para resolver este problema, você necessariamente deverá DEFINIR
OS SEGUINTES MÉTODOS:
```
- minimo, que calcula o mínimo entre cinco números reais;
- maximo, que calcula o máximo entre cinco números reais;
- obtemMediaTruncada, que obtém a média truncada de cinco números reais.

```
Restrições
```
- Não utilize comandos de repetição (for, while, etc.).
- Apenas o método main deve realizar entrada e saída de dados.

```
Exemplo de execução
```
```
Entre com cinco números: 24.3 10.4 32.6 32.6 12.
Média truncada: 23.
```
```
Instituto Federal de Santa Catarina – Câmpus São José
Rua José Lino Kretzer, 608 — Praia Comprida — São José, SC — CEP: 88130-
Fone: (48) 3381-2800 — http://www.ifsc.edu.br
```

