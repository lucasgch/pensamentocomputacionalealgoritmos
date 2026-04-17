/*  Comentário de bloco
    Pode ser feito em várias linhas
 */
class Ola {
    // Comentário de linha
    public static void main(String args[]) {
        String ola = "Olá, mundo!";
        System.out.println(ola);
        IO.println(ola +" do IO.println que chama o System.out.println!");

        for (int i=1; i<=10; i++){
            IO.println(ola + " " + i);
        }
    }
}

/* tipos de variáveis e seus tamanhos
byte - 1bytes - 8 bits
short - 2bytes - 16 bits
int - 4 bytes - 32 bits
long - 8 bytes - 64bits

float - 4 bytes - 32 bits
double - 8 bytes - 64 bits

char - 2 bytes - 16 bits
string - 8 bytes - 64 bits

boolean - 1bit
 */