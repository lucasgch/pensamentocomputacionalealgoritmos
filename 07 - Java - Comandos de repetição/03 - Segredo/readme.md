# Exercício em sala: Segredo.java

Implemente um algoritmo que simula um jogo de adivinhação de um número secreto.

- O jogo deve gerar um número aleatório entre 1 e 100 e solicitar ao usuário um palpite.
- Se o usuário acertar o número, o jogo deve informar o número de tentativas e encerrar.
- Caso contrário, o jogo deve informar se o segredo é maior ou menor que o palpite e solicitar um novo palpite.
- O jogo deve continuar solicitando novos palpites até que o usuário acerte o número secreto.

## Restrição e dica

- Utilize o comando do-while.
- Crie um objeto da classe Random (por exemplo: Random rnd = new Random() ) e utilize o método nextInt desta classe para gerar um inteiro aleatório. Consulte a documentacão da classe caso necessário.

## Exemplo

```text
Entre com seu palpite (1 a 100): 50
O segredo é maior
Entre com seu palpite (1 a 100): 80
O segredo é menor
Entre com seu palpite (1 a 100): 70
O segredo é menor
Entre com seu palpite (1 a 100): 64
Parabéns, você acertou em 4 tentativas!
```
