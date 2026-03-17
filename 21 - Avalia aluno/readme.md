# 21 - Avalia aluno

Em uma certa disciplina, os alunos são avaliados por meio de três avaliações individuais e sem consulta, com pontuações inteiras de até 10 pontos. Cada avaliação possui uma recuperação, onde o maior valor obtido entre a avaliação original e a recuperação é considerado. O resultado final da disciplina é calculado pela média aritmética simples das três avaliações, arredondada para o inteiro mais próximo. O resultado mínimo para aprovação na disciplina é 6. Alunos com frequência inferior a 75% receberão o resultado 0.

Elabore um pseudocódigo para um algoritmo que LÊ os valores das três avaliações, das três recuperações e da frequência do aluno e ESCREVE o resultado final da disciplina e a situação do aluno (**Aprovado** ou **Reprovado**). Assuma que, caso o aluno não tenha realizado a recuperação de uma das avaliações, a nota será entrada como zero. Assuma também a existência da função round (que arredonda um número real para o inteiro mais próximo).

## Pseudocódigo

```pseudocódigo
Variáveis
    avaliacao1, avaliacao2, avaliacao3, recuperacao1, recuperacao2, recuperacao3, percentualFrequencia, media: número
    reprovado: lógico
Início
    Escreva "Informe os valores das avaliações 1, 2 e 3: "
    Leia avaliacao1, avaliacao2, avaliacao3
    
    recuperacao1 = 0
    Escreva "Informe o valor da recuperação 1: "
    Leia recuperacao1

    recuperacao2 = 0
    Escreva "Informe o valor da recuperação 2: "
    Leia recuperacao2
    
    recuperacao3 = 0
    Escreva "Informe o valor da recuperação 3: "
    Leia recuperacao3

    Escreva "Informe a frequência: "
    Leia percentualFrequencia

    Se percentualFrequencia < 75
        Escreva "**Reprovado**"
    Senão
        Se avaliacao1<recuperacao1
            avaliacao1 = recuperacao1
        FimSe
        Se avaliacao2<recuperacao2
            avaliacao2 = recuperacao2
        FimSe
        Se avaliacao3<recuperacao3
           avaliacao3=recuperacao3
        FimSe
        media = round(avaliacao1+avaliacao2+avaliacao3 / 3)
        Se media >= 6
            Escreva "**Aprovado**"
        FimSe    
    FimSe
Fim
```

## Java

```Java
import java.util.Scanner;

public class AvaliaAluno {

    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            
            System.out.println("Digite as notas do aluno: ");
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double nota3 = scanner.nextDouble();
            
            double recuperacao1;
            double recuperacao2;
            double recuperacao3;

            System.out.println("Digite as recuperações: ");
            recuperacao1 = scanner.nextDouble();
            recuperacao2 = scanner.nextDouble();
            recuperacao3 = scanner.nextDouble();

            System.out.println("Informe a frequência: ");
            int frequencia = scanner.nextInt();

            if (frequencia < 75) {
                System.out.println("Reprovado por falta");
            }
            else {

                if(nota1 < recuperacao1){
                    nota1 = recuperacao1;
                }
                if(nota2 < recuperacao2){
                    nota2 = recuperacao2;
                }
                if(nota3 < recuperacao3){
                    nota3 = recuperacao3;
                }

                double media = Math.round((nota1 + nota2 + nota3) / 3)*10;               
                
                System.out.println("Média do aluno: " + media);
                System.out.println(media >= 60 ? "Aprovado" : "Reprovado");
            }
        }
    }
}
```
