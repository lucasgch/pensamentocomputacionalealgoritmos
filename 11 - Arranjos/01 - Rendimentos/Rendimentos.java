public class Rendimentos {

    public static void main(String[] args) {

        final double VALOR_INICIAL = 10000.0;
        final double TAXA_INICIAL = 6.0;
        final double PASSO_TAXA = 0.5;
        final int NUM_TAXAS = 5;
        final int NUM_ANOS = 4;

        double taxa[] = new double[NUM_TAXAS];
        double valor[] = new double[NUM_TAXAS];

        for (int linhaAno = 0; linhaAno <= NUM_ANOS; linhaAno++) {

            if (linhaAno == 0) { // Imprime o cabeçalho da linha
                System.out.printf("%-5s", "Ano");
            } else {
                System.out.printf("%2d   ", linhaAno);
            }

            for (int colunaTaxa = 0; colunaTaxa < NUM_TAXAS; colunaTaxa++) {

                if (linhaAno == 0) { // Imprime o cabeçalho da coluna
                    taxa[colunaTaxa] = TAXA_INICIAL + (colunaTaxa * PASSO_TAXA);
                    valor[colunaTaxa] = VALOR_INICIAL;
                    System.out.printf("%10.1f%%", taxa[colunaTaxa]);
                } else {
                    valor[colunaTaxa] *= 1 + (taxa[colunaTaxa] / 100.0);
                    System.out.printf("%11.2f", valor[colunaTaxa]);
                }
            }

            System.out.println();
        }
    }
}