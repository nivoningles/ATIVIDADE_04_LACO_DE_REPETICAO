import java.util.Locale;
import java.util.Scanner;

public class Atividade_1_Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite um numero: ");

        int numero = sc.nextInt();

        for (int i=0 ; i <= 10 ; i++ ){

            System.out.println(numero+" x "+i+" = "+(numero*i));
        }

    }
}
