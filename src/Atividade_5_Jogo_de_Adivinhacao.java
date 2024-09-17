import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Atividade_5_Jogo_de_Adivinhacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroAleatorio = rand.nextInt(100)+1;
        int numeroPalpite = 0;

        System.out.println("\n** Bem vindo ao jogo da Adivinhação **");
        System.out.println("Tente adivinhar um número de 1 a 100\n");

        do {
            System.out.print("Digite seu palpite: ");
            numeroPalpite = sc.nextInt();

            if (numeroPalpite == numeroAleatorio) {
                System.out.println("Parabéns você acertou!!");
            } else if (numeroPalpite > numeroAleatorio) {
                System.out.println("Tente um numero menor\n");
            } else if (numeroPalpite < numeroAleatorio) {
                System.out.println("Tente um numero maior\n");
            }

        }while (numeroAleatorio != numeroPalpite);

    }
}
