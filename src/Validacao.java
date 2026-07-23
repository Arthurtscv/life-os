import java.util.Scanner;

public class Validacao {

    public static String lerTexto(Scanner teclado, String mensagem) {

        String texto, textoLimpo;

        while(true) {

            System.out.print(mensagem);
            texto = teclado.nextLine();
            textoLimpo = texto.trim();

            if(!textoLimpo.isEmpty()) {
                return textoLimpo;
            }

            System.out.println("Erro: Este campo não pode ficar vazio");

        }
    }

    public static double lerValorPositivo(Scanner teclado, String mensagem) {

        while (true) {

            System.out.print(mensagem);

            if (teclado.hasNextDouble()) {

                double valor = teclado.nextDouble();
                teclado.nextLine();

                if (valor > 0) {
                    return valor;
                }

                System.out.println("O valor deve ser maior que zero.");

            } else {

                System.out.println("Digite apenas números.");
                teclado.nextLine();

            }

        }

    }

}
