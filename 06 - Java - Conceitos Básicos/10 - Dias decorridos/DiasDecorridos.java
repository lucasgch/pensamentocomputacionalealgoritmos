import java.util.Scanner;

public class DiasDecorridos{
    public static void main(String args[]) {
        
        System.out.print("Entre com a data (dd/mm/aaaa): ");
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] partes = entrada.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        scanner.close();

        System.out.println("Ano "+ano+" é bissexto? "+ehBissexto(ano));
        System.out.println("O mês "+mes+" tem "+numDias(mes, ano)+" dias no ano de "+ano+".");
        System.out.println("A data "+dia+"/"+mes+"/"+ano+" é válida? "+ehDataValida(dia, mes, ano));
        System.out.println("Dias decorridos no ano "+dia+"/"+mes+"/"+ano+": "+diasDecorridos(dia, mes, ano));
    }

    /**
     * Verifica se o ano é bissexto
     * @param ano
     * @return
     */

    static boolean ehBissexto(int ano){
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    /*
     * Retorna o número de dias em um mês específico
     * @param mes
     * @param ano
     * @return
     */
    static int numDias(int mes, int ano){
        
        if (mes == 2){
            return ehBissexto(ano)? 29 : 28;
        }
        int dias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
        return dias;
    }

    /**
     * Verifica se a data é válida
     * @param dia
     * @param mes
     * @param ano
     * @return
     */
    static boolean ehDataValida(int dia, int mes, int ano){
        if (mes<1 || mes>12){
            return false;
        }
        if (dia > numDias(mes, ano) || dia < 1){
            return false;
        }
        return true;
    }

    /**
     * Calcula os dias decorridos no ano até a data fornecida
     * @param dia
     * @param mes
     * @param ano
     * @return
     */
    static int diasDecorridos(int dia, int mes, int ano){
        int totalDias = 0;
        mes--;
        switch (mes) {
            case 12:{
                totalDias += numDias(12, ano);
            } 
            case 11: {
                totalDias += numDias(11, ano);
            }
            case 10: {
                totalDias += numDias(10, ano);
            }
            case 9: {
                totalDias += numDias(9, ano);
            }
            case 8: {
                totalDias += numDias(8, ano);
            }
            case 7: {
                totalDias += numDias(7, ano);
            }
            case 6: {
                totalDias += numDias(6, ano);
            }
            case 5: {
                totalDias += numDias(5, ano);
            }
            case 4: {
                totalDias += numDias(4, ano);
            }
            case 3: {
                totalDias += numDias(3, ano);
            }
            case 2: {
                totalDias += numDias(2, ano);
            }   
            case 1:{
                totalDias += numDias(1, ano);
            } 
        }

        return totalDias+dia;
    }

}