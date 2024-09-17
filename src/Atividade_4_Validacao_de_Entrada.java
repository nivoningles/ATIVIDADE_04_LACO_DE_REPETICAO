import java.util.Locale;
import java.util.Scanner;

public class Atividade_4_Validacao_de_Entrada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = 0;

        do {
            System.out.print("Informe uma idade valida: ");
            idade = sc.nextInt();
        }while (idade < 0);

        System.out.println("Idade Valida");

    }
}
