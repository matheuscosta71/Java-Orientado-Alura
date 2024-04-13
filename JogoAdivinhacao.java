import java.util.Scanner;
import java.util.Random;
public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tentativas=0;
        int numeroDigitado=0;
        int numeroGerado = new Random().nextInt(100);

        while (tentativas<5){
            System.out.print("Digite um numero entre 0 e 100: ");
            numeroDigitado = sc.nextInt();
            tentativas ++;

            if(numeroGerado==numeroDigitado){
                System.out.print("Parabéns, você acertou!");
                break;
            }
            else if (numeroDigitado<numeroGerado){
                System.out.print("O número digitado é maior \n");
            }else {
                System.out.print("O número digitado é menor \n");
            }
        }
        if(tentativas==5 && numeroGerado!=numeroDigitado){
            System.out.println("Infelizmente você não conseguiu acertar em 5 tentativas, o número digitado era " + numeroGerado);
        }


    }
}
