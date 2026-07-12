import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movimentacoes {

    static Scanner teclado = new Scanner(System.in);

    static double saldo_atual = 0;
    static double totalReceitas = 0;
    static double totalDespesas = 0;
    static double maiorDespesa = 0;
    static String tipo_receita;
    static String tipo_despesa;

    static List<String> movi =  new ArrayList<>();

    public static void receita() {

        double valor_receita;
            System.out.print("Qual o valor da receita? R$");
            valor_receita = teclado.nextDouble();
            if (valor_receita <= 0) {
                System.out.println("Valor inválido. A receita deve ser maior que zero.");
                System.out.printf("Saldo atual: R$%.2f%n", saldo_atual);
                System.out.printf("------------------------------%n");
                return;
            }
            System.out.print("Qual o tipo da receita? ");
            tipo_receita = teclado.next();
            saldo_atual += valor_receita;
            totalReceitas +=valor_receita;
            movi.add("Receita | " + tipo_receita + " | Valor = R$" + valor_receita);
            System.out.printf("Saldo atual: R$%.2f%n", saldo_atual);
            System.out.printf("------------------------------%n");

    }


    public static void despesa() {

        double valor_despesa;

            System.out.print("Qual o valor da despesa? R$");
            valor_despesa = teclado.nextDouble();
            if (valor_despesa <= 0 ) {
                System.out.println("Valor inválido. A despesa deve ser maior que zero.");
                System.out.printf("Saldo atual: R$%.2f%n", saldo_atual);
                System.out.printf("------------------------------%n");
                return;
            }

            System.out.print("Qual o tipo da despesa? ");
            tipo_despesa = teclado.next();
            saldo_atual -= valor_despesa;
            totalDespesas += valor_despesa;
            if (valor_despesa > maiorDespesa) {
                maiorDespesa = valor_despesa;
            }
            movi.add("Despesa | " + tipo_despesa + " | Valor = R$-" + valor_despesa);
            System.out.printf("Saldo atual: R$%.2f%n", saldo_atual);
            System.out.printf("------------------------------%n");

    }

    public static void resumo() {

        System.out.println("========= RESUMO =========");
        System.out.println("Total de receitas: " + totalReceitas);
        System.out.println("Total de despesas: " + totalDespesas);
        System.out.printf("Saldo atual: R$%.2f%n", saldo_atual);
        System.out.println("Quantidade de movimentações: " + movi.size());
        System.out.println("Maior despesa: R$" + maiorDespesa);
        if (saldo_atual > 0) {
            System.out.println("Situação: Positivo");
        } else if (saldo_atual == 0) {
            System.out.println("Situação: Zerado");
        } else {
            System.out.println("Situação: Negativo");
        }
        System.out.printf("------------------------------%n");

    }

    public static void movimentacoes() {

        if (!movi.isEmpty()) {
            System.out.println("========= EXTRATO =========");
            for (int i = 0; i < movi.size(); i++) {
                System.out.println((i+1) + " - " + movi.get(i));
            }
            System.out.println("===========================");
        } else {
            System.out.println("Nenhuma movimentação cadastrada.");
        }
    }
}



