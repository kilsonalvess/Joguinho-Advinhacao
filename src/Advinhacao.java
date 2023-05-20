import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {

        int dado = new Random().nextInt(100);

        System.out.println("RANDOM: " + dado);

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite um numero inteiro entre 0 é 100: ");

            Scanner leitura = new Scanner(System.in);

            int comparacao = leitura.nextInt();

            if (comparacao == dado) {
                System.out.println("ACERTOUU PÈ DE RATO");
                break;

            }


            else {
                System.out.println("ERROUUUUUUUUUUUUU");
            }


        }

    }

}