import java.util.Locale;
import java.util.Scanner;

public class Atividade_1_Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite um numero: ");

        Double numero = sc.nextDouble();

        for (int i=1 ; i <= 10 ; i++ ){

            System.out.println(numero+" x "+i+" = "+(numero*i));
        }

    }
}
