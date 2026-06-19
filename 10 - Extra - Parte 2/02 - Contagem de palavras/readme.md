# Contagem de palavras

## Tarefa

Escreva um programa lê do teclado um texto e escreve na tela quantas palavras há no texto. Assuma que o texto é composto apenas de letras ou espaços em branco, mas é possível que haja mais de um espaço em branco entre duas palavras.

## Restrições

Utilize o comando while.
Não utilize arranjos ou strings.

## Formato

Entre com um texto: {texto}
Número de palavras: {int}

## Dicas

Leia o texto caractere por caractere, utilizando o comando scanf com o especificador "%c" ou a função getchar.
O texto termina quando o caractere lido for uma quebra de linha.
Utilize duas variáveis do tipo char: uma que armazena o caractere lido e outra que armazena o caractere lido na iteração anterior. Uma nova palavra começa quando o caractere atual é uma letra e o anterior é um espaço em branco.

## Exemplos

Abaixo exemplos de execução do programa (o texto em azul corresponde ao digitado pelo usuário).

```text
Entre com um texto: O gato subiu no telhado
Número de palavras: 5

Entre com um texto: O    gato    subiu    no    telhado
Número de palavras: 5

Entre com um texto:     O gato subiu no telhado    
Número de palavras: 5

Entre com um texto: Esta frase nao tem seis palavras
Número de palavras: 6
```
