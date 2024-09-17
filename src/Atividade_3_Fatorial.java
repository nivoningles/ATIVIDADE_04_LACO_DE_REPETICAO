import java.util.Locale;
import java.util.Scanner;

public class Atividade_3_Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero = 0;

        System.out.print("Informe o um número: ");
        numero = sc.nextInt();
        int multiplcacao = 0;
        int valor = 0;

        do {
            valor = numero * (numero - 1);

            System.out.println(valor);

        } while (numero == 0);
    }

    }

