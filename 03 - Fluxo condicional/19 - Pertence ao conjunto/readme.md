# 19 - Pertence ao conjunto

Considere os conjuntos $\mathcal{A} = \{x \in \mathbb{Z} \mid n_1 \leq x \leq n_2\}$ e $\mathcal{B} = \{x \in \mathbb{Z} \mid n_3 \leq x \leq n_4\}$, em que $n_1, n_2, n_3$ e $n_4$ são inteiros. Elabore um pseudocódigo para um algoritmo que LÊ os valores de $n_1, n_2, n_3, n_4$, bem como de um inteiro $x$ e ESCREVE se $x$ pertence somente ao conjunto $\mathcal{A}$, somente ao conjunto $\mathcal{B}$, a ambos os conjuntos, ou a nenhum deles.

## Pseudocódigo

```pseudocódigo
    Variáveis
        n1, n2, n3, n4, x: número
        resultado: texto
        pertenceAA, pertenceAB: lógico
    Início
        Escreva "Informe os valores n1 n2 n3 n4:"
        Leia n1, n2, n3, n4
        Escreva "Informe o valor de x"
        Leia x
        pertenceAA = x >= n1 && x <= n2
        pertenceAB = x >= n3 && x <= n4

        Se (pertenceAA) && (pertenceAB)
            resultado = "X pertence ao conjunto A e B"
        SenãoSe pertenceAA
            resultado = "x pertence somente ao conjunto A"
        SenãoSe pertenceAB
            resultado = "X pertence somente ao conjunto B"
        Senão
            resultado = "X não pertence ao conjunto A ou B"
        FimSe

        Escreva resultado
    Fim
```

## Java

```Java
import java.util.Scanner;

public class PertenceAoConjunto {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Informe os valores de n1 n2 n3 n4 separado por espaço: ");
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            int n4 = scanner.nextInt();
            System.out.print("Informe o valor de x: ");
            int x = scanner.nextInt();

            boolean pertenceAA = (x>= n1 && x <= n2);
            boolean pertenceAB = (x>= n3 && x <= n4);

            if (pertenceAA && pertenceAB) {
                System.out.println("Pertence ao conjunto A e ao conjunto B");
            } else if (pertenceAA) {
                System.out.println("Pertence ao conjunto A");
            } else if (pertenceAB) {
                System.out.println("Pertence ao conjunto B");
            } else {
                System.out.println("Não pertence a nenhum dos conjuntos");
            }

        }
    }
}
```
