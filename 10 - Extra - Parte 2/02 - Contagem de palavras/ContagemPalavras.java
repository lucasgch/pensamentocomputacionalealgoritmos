import java.io.IOException;

public class ContagemPalavras {
    public static void main(String[] args) throws IOException {
        
        System.out.print("Entre com um texto: ");

        int totalPalavras = 0;
        
        // Inicializamos o caractere anterior como espaço para contar corretamente 
        // caso a frase já comece com uma letra (ex: "O gato...")
        char anterior = ' '; 
        int lido;

        // System.in.read() lê um caractere por vez e retorna seu código ASCII (int)
        // O loop continua até encontrar a quebra de linha ('\n' ou '\r')
        while ((lido = System.in.read()) != -1) {
            char atual = (char) lido;

            // Se chegou ao fim da linha, interrompe a leitura
            if (atual == '\n' || atual == '\r') {
                break;
            }

            // Uma nova palavra começa se o atual NÃO for espaço E o anterior FOR espaço
            if (atual != ' ' && anterior == ' ') {
                totalPalavras++;
            }

            // O caractere atual vira o anterior para a próxima repetição
            anterior = atual;
        }

        System.out.println("Número de palavras: " + totalPalavras);
    }
    
}
