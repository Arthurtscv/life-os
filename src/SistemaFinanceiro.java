import java.util.Scanner;


public class SistemaFinanceiro {

    public void iniciar() {

        Scanner teclado = new Scanner(System.in);
        String opcao;

        do {
            Menu.mostraMenu();
            opcao = teclado.nextLine();
            switch (opcao) {
                case "0":
                    Menu.sairMenu();
                    break;

                case "1":
                    Operacoes.receita(teclado);
                    break;

                case "2":
                    Operacoes.despesa(teclado);
                    break;

                case "3":
                    Operacoes.resumo();
                    break;

                case "4":
                    Operacoes.extrato();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.printf("------------------------------%n");
                    break;
            }
        } while (!opcao.equals("0"));
        teclado.close();
    }

}
