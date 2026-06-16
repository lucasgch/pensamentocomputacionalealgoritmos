# Exercício em sala: HorariosVoo.java

`Adaptado de King – C Programming: A Modern Approach, 2nd edition`

Uma companhia aérea oferece os seguintes voos diários entre duas cidades:

Elabore um programa que lê do teclado o horário atual no formato de 24 horas ( HH:MM ) e escreve na tela os horários de partida e chegada do próximo voo disponível (caso haja), ou a mensagem "Não há mais voos disponíveis hoje" (se for este o caso).

## Restrições

- Escreva um (ou reaproveite do exercício Evento.java o) método horarioParaMinutos , que recebe um string representando um horário no formato HH:MM e retorna um inteiro representando a quantidade de minutos decorridos desde a meia noite.
- Armazene os horários de partida e chegada em dois arranjos constantes, PARTIDA e CHEGADA, respectivamente; os elementos dos arranjos devem ser strings no formato HH:MM

## Dica

Como os horários de partida estão em ordem crescente, percorra o arranjo PARTIDA até encontrar o primeiro horário que seja maior ou igual ao horário informado pelo usuário. Esse será o próximo voo disponível.

## Exemplos

```text
Entre com o horário atual (HH:MM): 13:15
Próxima partida: 14:00
Horário de chegada: 16:08

Entre com o horário atual (HH:MM): 20:30
Próxima partida: 21:45
Horário de chegada: 23:58

Entre com o horário atual (HH:MM): 22:00
Não há mais voos disponíveis hoje
```
