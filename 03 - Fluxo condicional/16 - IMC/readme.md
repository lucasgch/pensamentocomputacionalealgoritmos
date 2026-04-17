# IMC

Elabore um fluxograma para um algoritmo que LÊ dois números reais representando o peso e a altura de uma pessoa e ESCREVE o **índice de massa corpórea (IMC)** desta pessoa, bem com a **classificação do seu estado nutricional**. Em seguida, efetue um teste de mesa com a entrada `83 1.75`; a saída deverá ser `27.102 Sobrepeso`. Veja a página do Ministério da Saúde para mais informações sobre o IMC e a classificação do estado nutricional

## Fluxograma

[Link para fluxograma no fluxolab](https://fluxolab.app/?lzs=NoIhBplAHBTBnA9hADAXUiAhgGwC4CuATlqhqAJYC2AxmZgnlgCaIByBeRFNFiAdrggBGNOWApwAZmkA2SQA5JYTACNEePIiogxkYeAAscyQCYUyuEnAACXIRIRQ6zdt3lT4AKwnwww8oAOiAAkvwAZohEVLA2iDZW8bH2xFgAXDbBTiAuWjp6wDKyvqZK4CDUNAC8iQD0ABQpJABUTVgAlNm5bgXGPlLyviDBALP8zDyxzLFUWPDwWDY0UdAAz0Swi-UhALIAwu0ZwbaVXRp57pDFAOy+hgHllQA8wgoAdF5nrjrl3ADmAAs8JdgD4fMJ-JJrhZysE9jg5vAKOEeFgAOcAY-irBs8FgBBsjBY8X4nG4vAEuCOEEJ8CYrA4XB4fEEOC+FwKt2KA0kXhhICJDLJzMpOCqwQAQlgKAAPeKJLJqc49cgKcBqiEPJTKJwFACc4C5g3uymepkMbz17LcvwogOBBWEkmKskGfOUgvYwoprPFArJiBRWEVzmV+XIEMN4D1xoeFVoT1MereKGtPxA-yBIOEnmKMd5-M9jPJLNwfqQqg2CpUoe+2Zkt2EUhhJseCakFqtSrrtvt2eMxSbMPd5SL3tLYuCAHlVAgKMwWLE-iQCSEQzkw9mfI3ZGVW-GaE8pMmu7WLr2s46XX5dwWPXTicWRb7p7OkQvpjZl1hV2uaxu60dW5bnMWNTVoAA+KoAjTCAMztS8IzVYpQLvUcHyFJkfTLV85w-JcVxsEJiPXbpw3ESQnXAUwPD8SiIzo6RyBkKjDHIYwqNkchBwMa5yEbXlyHBRRuL8Tw9XIA1IydSSxL8UR9AMaSaMUuSmwjFilLY-QWM8YQvAjcElK4-RwT0vj9EbJSFAjSjBP0PT7OAfxGIM-RByc15XIjRtPBssQgA)

## Teste de mesa

Entrada: 83 1.75
Saída: 27.102 Sobrepeso

| Bloco | instrução | peso | altura | imc | estadoNutricional | Entrada | Saida
| :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---:
| Bloco 0 | Início | 0 | 0 | 0 | 0 | 0 | 0
| Bloco 1 | Escreva | 0 | 0 | 0 | 0 | 0 | "Informe o peso e altura: "
| Bloco 2 | Leia | 83 | 1.75 | 0 | 0 | 83 1.75 | 0
| Bloco 3 | Atribuição | 83 | 1.75 | 27.102 | 0 | 0 | 0
| Bloco 4 | Escreva | 83 | 1.75 | 27.102 | 0 | 0 | 27.102
| Bloco 5 | Condicional | 83 | 1.75 | 27.102 | 0 | 0 | 0
| Bloco 7 | Atribuição | 83 | 1.75 | 27.102 | "Sobrepeso" | 0 | 0
| Bloco 18 | Saída | 83 | 1.75 | 27.102 | "Sobrepeso" | 0 | "Sobrepeso"
| Bloco 19 | Fim | 83 | 1.75 | 27.102 | "Sobrepeso" | 0 | 0

## Java

```java
import java.util.Scanner;

public class Imc {

    public static void main(String[] args){
        double altura, peso;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite sua altura em metros:");
            altura = scanner.nextDouble();
            System.out.println("Digite seu peso em kg:");
            peso = scanner.nextDouble();
        }
        catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira números válidos para altura e peso.");
            return;
        }
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if(imc < 24.9){
            System.out.println("Peso normal - Eutrofia");
        } else if(imc < 29){
            System.out.println("Sobrepeso");
        } else if(imc < 34.9) {
            System.out.println("Obesidade grau I");
        }
        else if(imc < 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }
        
    }
}
```
