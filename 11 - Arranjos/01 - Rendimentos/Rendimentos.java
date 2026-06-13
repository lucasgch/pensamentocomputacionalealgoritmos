public class Rendimentos {

    public static void main(String[] args) {

        final double VALOR_INICIAL = 10000.0;
        final double TAXA_INICIAL = 6.0;
        final double PASSO_TAXA = 0.5;
        final int NUM_TAXAS = 5;
        final int NUM_ANOS = 4;

        double taxa[] = new double[NUM_TAXAS];
        double valor[] = new double[NUM_TAXAS];
        
        double taxaAtual = TAXA_INICIAL;
        int anoAtual = 1;
        
        for (int linha = 0; linha < NUM_TAXAS; linha++) {
            // Imprime o cabeçalho da tabela
            if (linha == 0) {
                System.out.printf("Ano %6.1f   %5.1f   %6.1f   %7.1f   %6.1f   ", taxaAtual, taxaAtual+PASSO_TAXA, taxaAtual+PASSO_TAXA*2, taxaAtual+PASSO_TAXA*3, taxaAtual+PASSO_TAXA*4, taxaAtual+PASSO_TAXA*4);
                continue; // Pula para a próxima iteração para não calcular os rendimentos no cabeçalho
            }
            valor[linha]= VALOR_INICIAL;

            for (int coluna = 0; coluna <= NUM_ANOS; coluna++) {
            
                // Imprime o número do ano
                if (coluna == 0) {
                    System.out.printf("%n%2d  ", anoAtual);
                    anoAtual++;
                }
                taxa[coluna] = TAXA_INICIAL + (coluna * PASSO_TAXA) ;
            
                double valorAtual = VALOR_INICIAL + ( VALOR_INICIAL * taxa[coluna] / 100 );
                System.out.printf("%8.2f " , valorAtual);
                
            }
            
            taxaAtual += PASSO_TAXA;
        }
        System.out.println();
        
    }
    
}