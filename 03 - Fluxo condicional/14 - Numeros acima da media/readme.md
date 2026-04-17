# Quantidade de números acima da média

Elabore um fluxograma para um algoritmo que LÊ cinco números reais e ESCREVE a média e a quantidade de números (dentre estes cinco números) que estão acima da média. Em seguida, efetue um teste de mesa com a entrada `3.4 2.0 1.5 4.0 2.1`; a saída deverá ser `2.6 2`, pois a média é **2.6** e há dois números acima da média.

## Fluxograma

- [Link para fluxograma no fluxolab](https://fluxolab.app/?lzs=NoIhBplA7BGCAMBdSJoCZEpgZi66AFnxgFYSQBbAUwBMBLAQwsYGN7LGARRgWTqZZswBOBzh0ADlGx0osKgBGAewAuq5ZRBJsscIQnSJCeXHAACDBejjLBy+SVqNWnZHTgAbIdHpP8mgZGcwBecwAKOABqDBicGMIY0gBKAHpHUBV1TW1scW8pURw5cBA2Dm4+AUYQhAhM5xy3YAMAdh99E1K4AD5AwSdsrVKAJ3oAcwALVVzIUi8OwiMy9k4efiCQ8rWqoKj4QZdZ4Hb2wq9lmz7q+pANAAcIEDGpmebJcDOjaVNCa6DblkjqMJtNjgBOT4dcElNCkf4DBpDJ4vMHNbxfUSkfzddAI5iHHIg17HWCibw4LqeWHbSobJhbVZ06r7QGNVy6PQUrqtQjyWnraqMiqCvYHJFHZqyBbnSQ4lYi3YMgVKxiswkcyCwfIdMldBU7ek1FVG9USpq6Azzc5k5YAHRARoAXOYHRZ+owLA7zABBJnmWjBXgAS6CLrd5hNNw1pPmHxtsHl9R0whkMl04DJEmwHizOGwBlgelI2HmWc82G8RczyEg7WrRc5NfAkmwHwb6F0udE4OwkIb+a14izsEI2HrHlbkHbHl7kH7ubHkCrHlaeWbS5amY8Fa1ac+lubsBLOiAA)

## Java

```Java
import java.util.Scanner;

public class AcimaDaMedia {

    public static void main(String[] args){
        int n1, n2, n3, n4, n5;
        double media, acimaMedia = 0;

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite 5 números inteiros separados por espaço: ");
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            n3 = scanner.nextInt();
            n4 = scanner.nextInt();
            n5 = scanner.nextInt();
        }

        media = (n1 + n2 + n3 + n4 + n5) / 5.0;

        if (n1 > media) {
            acimaMedia++;
        }
        if (n2 > media) {
            acimaMedia++;
        }
        if (n3 > media) {
            acimaMedia++;
        }
        if (n4 > media) {
            acimaMedia++;
        }
        if (n5 > media) {
            acimaMedia++;
        }

        System.out.println("Média: " + media);
        System.out.println("Quantidade de números acima da média: " + (int)acimaMedia);

    }
}
```
