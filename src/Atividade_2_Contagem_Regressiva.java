import java.util.Locale;
import java.util.Scanner;

public class Atividade_2_Contagem_Regressiva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero = 0;

        System.out.print("Informe o um número: ");
        numero = sc.nextInt();

        while (numero >= 0){
            System.out.println(numero);
            numero = numero - 1;

        }

    }
}
