import java.util.Scanner;
public class HorariosVoo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o horário atual (HH:MM): ");
        String entrada = scanner.nextLine();        

        String partida[] = {"08:00", "09:43", "11:19", "12:47", "14:00", "15:45", "19:00", "21:45"};
        String chegada[] = {"10:16", "11:52", "13:31", "15:00", "16:08", "17:55", "21:20", "23:58"};

        for (int i =0; i<partida.length; i++){
            if ( horarioParaMinutos(entrada)>=horarioParaMinutos(partida[i]) ){
                System.out.printf("Próxima partida: %s %n", partida[i]);
                System.out.printf("Próxima chegada: %s %n", chegada[i]);
                break;
            }
            else if (i==partida.length-1){
                System.out.println("Não há mais voos disponíveis hoje");
            }
        }
        
    }
    
    static int horarioParaMinutos(String horario){
        String partes[] = horario.split(":");
        int hora = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int tempoRestante = (24 - hora)*60 + minutos;
        return tempoRestante;
    }
}
