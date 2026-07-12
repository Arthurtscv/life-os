import java.util.Scanner;


public class SistemaFinanceiro {

    public void iniciar() {

        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            Menu.mostraMenu();
            opcao = teclado.nextInt();
            switch (opcao) {
                case 0:
                    Menu.sairMenu();
                    break;

                case 1:
                    Movimentacoes.receita();
                    break;

                case 2:
                    Movimentacoes.despesa();
                    break;

                case 3:
                    Movimentacoes.resumo();
                    break;

                case 4:
                    Movimentacoes.movimentacoes();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.printf("------------------------------%n");
                    break;
            }
        } while (opcao != 0);
        teclado.close();
    }

}
