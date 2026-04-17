# Classifica triângulo

Dados os valores de três lados, $a$, $b$ e $c$, sabemos que eles *podem formar um triângulo* se e somente se a soma de quaisquer dois lados for sempre maior que o terceiro lado. Por exemplo:

* Os números $(3, 4, 5)$ formam um triângulo, pois:

$$3 + 4 > 5, \quad 3 + 5 > 4, \quad 4 + 5 > 3.$$


* Os números $(2, 3, 6)$ não formam um triângulo, pois:

$$2 + 3 > 6, \quad \text{ainda que} \quad 3 + 6 > 2 \quad \text{e} \quad 2 + 6 > 3.$$

Além disso, se os três lados de um triângulo são iguais, então ele é chamado de triângulo *equilátero*. Se dois lados são iguais e o terceiro é diferente, então ele é chamado de triângulo *isósceles*. Se todos os lados são diferentes, então ele é chamado de triângulo *escaleno*.

Elabore um fluxograma para um algoritmo que lê três números reais representando os lados de um triângulo e *Escreve* a classificação desse triângulo (Equilátero, isóceles ou escaleno) ou a mensagem: "Não forma um triângulo".

## Fluxograma

[Link para o fluxograma no fluxolab](https://fluxolab.app/?lzs=NoIhBplBDCAYC6kQCN5NAY3cgTgUwGcBXAGwBdoATAewgEYENg5wBmcAFgA5XfwwyFDXLkaAWxBNI9Ll371OrENHAACFOuxCRYydOAAmcAHZ5rQ4eXQA1CgB8mNQB9na25nsoXblDc+wOqISECC4AJYA5gAW5FIYnKbg9ABsrGxWAtAAvNloQXqhETFxBilJqaxKyii52qDCwZICpPgAZqUY3EkZ6ZkqdRANuiECxbHxkACcSTx9NYMFo2FREwb0rGZz7PwDeUOoI80rJZPA9MbdnJkmaQJD6xzlALSKVbsEJBTUNNkAOiAACoRABHADtImQaGpwoQAM+YfCtQgAg6NQrrRLlQx3bZhIhkSi0f5A0EQqFqfAAR2I4VIAEPyPhcDRUUt9BgAKzgcomJTsfqfQk-EnA8LQcmkaFETDQVpg1mCYZNM5mcpTTKWZRC77EgEAOQAx9C2jRcOJoGpiOI1OQyZCpWzlRiMBxuddWClBQTdXR2Wd6LJypz+JzvV8ib8AWLwQ7obCEUiiE7DiqmMxWBtkhhZFnDBhjIGuAlkkGSxdwNwuqWedWK1MMDMixsMOVm5xW8lC2xG13wJyc5ncx3IIXjCYcxwsz2ZIlp1zkukMGZ55Ap5n8zIN6Wc7ml0wgA)

## Java

```java
import java.util.Scanner;

public class ClassificaTriangulo {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite os lados do triângulo: ");
            double lado1 = scanner.nextDouble();
            double lado2 = scanner.nextDouble();
            double lado3 = scanner.nextDouble();

            if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
                System.out.println("Os lados não formam um triângulo.");
            } else if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        }
        catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira números válidos para os lados do triângulo.");
        }
    }
}
```
