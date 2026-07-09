import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

void main() {
    Scanner teclado = new Scanner(System.in);
    int opcao;
    double saldo_atual = 0;
    double totalReceitas = 0;
    double totalDespesas = 0;
    double maiorDespesa = 0;
    String tipo_receita;
    String tipo_despesa;
    List<String> movimentacoes =  new ArrayList<>();
    do {
    System.out.printf("========= LIFE OS =========%n%n");
    System.out.println("1 - Cadastrar receita");
    System.out.println("2 - Cadastrar despesa");
    System.out.println("3 - Ver resumo");
    System.out.println("4 - Ver extrato");
    System.out.printf("0 - Sair%n%n");
    System.out.print("Escolha uma opção: ");
    opcao = teclado.nextInt();
    switch (opcao) {
        case 0:
            System.out.println("Saindo do LifeOS");
            System.out.printf("------------------------------%n");
            break;

        case 1:
            System.out.print("Qual o valor da receita? R$");
            double valor_receita = teclado.nextDouble();
            if (valor_receita <= 0) {
                System.out.println("Valor inválido. A receita deve ser maior que zero.");
                System.out.printf("Saldo atual: R$%.2f%n", saldo_atual);
                System.out.printf("------------------------------%n");
                break;
            }
            System.out.print("Qual o tipo da receita? ");
            tipo_receita = teclado.next();
            saldo_atual += valor_receita;
            totalReceitas +=valor_receita;
            movimentacoes.add("Receita | " + tipo_receita + " | Valor = R$" + valor_receita);
            System.out.printf("Saldo atual: R$%.2f%n", saldo_atual);
            System.out.printf("------------------------------%n");
            break;

        case 2:
            System.out.print("Qual o valor da despesa? R$");
            double valor_despesa = teclado.nextDouble();
            if (valor_despesa <= 0) {
                System.out.println("Valor inválido. A despesa deve ser maior que zero.");
                System.out.printf("Saldo atual: R$%.2f%n", saldo_atual);
                System.out.printf("------------------------------%n");
                break;
            }
            System.out.print("Qual o tipo da despesa? ");
            tipo_despesa = teclado.next();
            saldo_atual -= valor_despesa;
            totalDespesas += valor_despesa;
            if (valor_despesa > maiorDespesa) {
                maiorDespesa = valor_despesa;
            }
            movimentacoes.add("Despesa | " + tipo_despesa + " | Valor = R$-" + valor_despesa);
            System.out.printf("Saldo atual: R$%.2f%n", saldo_atual);
            System.out.printf("------------------------------%n");
            break;

        case 3:
            System.out.println("========= RESUMO =========");
            System.out.println("Total de receitas: " + totalReceitas);
            System.out.println("Total de despesas: " + totalDespesas);
            System.out.printf("Saldo atual: R$%.2f%n", saldo_atual);
            System.out.println("Quantidade de movimentações: " + movimentacoes.size());
            System.out.println("Maior despesa: R$" + maiorDespesa);
            if (saldo_atual > 0) {
                System.out.println("Situação: Positivo");
            } else if (saldo_atual == 0) {
                System.out.println("Situação: Zerado");
            } else {
                System.out.println("Situação: Negativo");
            }
            System.out.printf("------------------------------%n");
            break;

        case 4:
            if (!movimentacoes.isEmpty()) {
                System.out.println("========= EXTRATO =========");
                    for (int i = 0; i < movimentacoes.size(); i++) {
                        System.out.println((i+1) + " - " + movimentacoes.get(i));
                    }
                System.out.println("===========================");
            } else {
                System.out.println("Nenhuma movimentação cadastrada.");
            }
            break;

        default:
            System.out.println("Opção inválida. Tente novamente.");
            System.out.printf("------------------------------%n");
            break;
    }
    } while (opcao != 0);
    teclado.close();
}
