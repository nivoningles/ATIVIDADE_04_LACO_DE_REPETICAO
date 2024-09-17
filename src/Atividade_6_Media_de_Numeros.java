import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_6_Media_de_Numeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("\n** Seja bem vindo a calculadora de média **");

        int primeiroNumero = 0;
        Double[] segundoNumero = new Double[0];
        String afirmativa = "";
        Double valor = 0.0;
        Double valorFinal = 0.0;
        String valorFinalFormatado = "";

        do {

            System.out.print("\nDigite quantos números serão feito a média: ");

            primeiroNumero = sc.nextInt();
            segundoNumero = new Double[primeiroNumero];

            for (int i = 0; i <= (primeiroNumero-1); i++) {
                System.out.print("Informe o número "+(i+1)+": ");
                segundoNumero[i] = sc.nextDouble();
                valor += segundoNumero[i];
            }

            valorFinal = valor/primeiroNumero;
            valorFinalFormatado = df.format(valorFinal);

            System.out.println("A média dos números foram: "+valorFinalFormatado);

            System.out.print("\nDeseja realizar mais um média digite (s/n): ");
            afirmativa = sc.next().trim().toLowerCase();

            if (afirmativa.equals("n")){
                sc.close();
            }
                while (!afirmativa.equals("n") && !afirmativa.equals("s")){
                    System.out.println("Informe uma letra valida 's' ou 'n': ");
                    afirmativa = sc.next().trim().toLowerCase();
                };

        }while (afirmativa.equals("s"));

    }
}
