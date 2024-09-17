import java.util.Locale;
import java.util.Scanner;

public class Atividade_3_Fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.print("Informe o um número: ");
        int numero = sc.nextInt();
        int valor = 1;
        int numeroInicial = numero;

        do {
            valor = valor * numero;
            numero--;

        } while (numero > 0);

        System.out.println(numeroInicial+"! = "+valor);
    }

    }

