# Conversor de binário para decimal

Números inteiros podem ser representados utilizando diferentes bases.

Por exemplo, o número dezenove (representado como 19, em base decimal) pode ser representado em base binária como 10011:

$$19 = 16 + 2 + 1 = \mathbf{1} \times 2^4 + \mathbf{0} \times 2^3 + \mathbf{0} \times 2^2 + \mathbf{1} \times 2^1 + \mathbf{1} \times 2^0.$$

Elabore um pseudocódigo para um algoritmo que LÊ cinco inteiros (cada um sendo 0 ou 1) que compõem os bits da representação binária de um número e ESCREVE esse número em decimal.

Assuma que os bits são informados do mais significativo para o menos significativo.

Apresente duas soluções:

- (a) A primeira deve utilizar seis variáveis (uma para cada bit lido e outra para o resultado final em decimal).
- (b) A segunda deve utilizar apenas duas variáveis (uma para acumular o valor do número em decimal e outra para receber cada bit lido).

Para cada caso, execute um teste de mesa com a entrada 1 0 0 1 1; a saída deve ser 19.

## Solução A

### Pseudocódigo A

```pseudocódigo
Variáveis
    Número Inteiro: b0, b1, b2, b3, b4, decimal
Início
    Leia b4, b3, b2, b1, b0
    decimal = b0 + b1*2 + b2*(2^2) + b3*(2^3) + b4*(2^4)
    Escreva decimal
Fim
```

### Teste de mesa A

| Bloco | instrução | b4 | b3 | b2 | b1 | b0 | decimal | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0
| Bloco 1 | Leia | 1 | 0 | 0 | 1 | 1 | 0 | 1 0 0 1 1 | 0
| Bloco 2 | Atribuição | 1 | 0 | 0 | 1 | 1 | 19 | 0 | 0
| Bloco 3 | Escreva | 1 | 0 | 0 | 1 | 1 | 19 | 0 | 19
| Bloco 4 | Fim | 1 | 0 | 0 | 1 | 1 | 19 | 0 | 0

### Java A

```java
import java.util.Scanner;

class BinarioDecimalA{
    public static void main(String args[]){
        int b4, b3, b2, b1, b0, decimal;

        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Digite um número binário de 5 bits separando cada bit por espaço: ");
            b4 = scanner.nextInt();
            decimal = (int) (b4 * Math.pow(2, 4));
            b3 = scanner.nextInt();
            decimal += b3 * Math.pow(2, 3);
            b2 = scanner.nextInt();
            decimal += b2 * Math.pow(2, 2);
            b1 = scanner.nextInt();
            decimal += b1 * 2;
            b0 = scanner.nextInt();
            decimal += b0;

            System.out.println("Valor em decimal: "+decimal);
        }
        
    }
}
```

## Solução B

### Pseudocódigo B

```pseudocódigo
Variáveis
    Número Inteiro: binario, decimal
Início
    Leia binario
    decimal = binario*(2^4)
    Leia binario
    decimal = decimal + binario*(2^3)
    Leia binario
    decimal = decimal + binario*(2^2)
    Leia binario
    decimal = decimal + binario*2
    Leia binario
    decimal = decimal + binario
    Escreva decimal
Fim
```

### Teste de mesa B

| Bloco | instrução | binario | decimal | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | 0 | 0 | 0 | 0
| Bloco 1 | Leia | 1 | 0 | 1 | 0
| Bloco 2 | Atribuição | 1 | 16 | 0 | 0
| Bloco 3 | Leia | 0 | 0 | 0 | 0
| Bloco 4 | Leia | 0 | 0 | 0 | 0
| Bloco 5 | Leia | 1 | 0 | 1 | 0
| Bloco 6 | Atribuição | 1 | 18 | 0 | 0
| Bloco 7 | Leia | 1 | 0 | 1 | 0
| Bloco 8 | Atribuição | 1 | 19 | 0 | 0
| Bloco 9 | Escreva | 1 | 19 | 0 | 19
| Bloco 10 | Fim | 1 | 19 | 0 | 0

### Java B

```java
```
