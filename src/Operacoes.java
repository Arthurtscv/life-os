import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operacoes {

    static double saldoAtual = 0;
    static double totalReceitas = 0;
    static double totalDespesas = 0;
    static double maiorDespesa = 0;

    static List<String> movimentacoes =  new ArrayList<>();

    public static void receita(Scanner teclado) {

        double valorReceita = Validacao.lerValorPositivo(teclado, "Qual o valor da receita? R$");

            String tipoReceita = Validacao.lerTexto(teclado, "Qual o tipo da receita? ");
            saldoAtual += valorReceita;
            totalReceitas +=valorReceita;
            movimentacoes.add("Receita | " + tipoReceita + " | Valor = R$" + valorReceita);
            System.out.printf("Saldo atual: R$%.2f%n", saldoAtual);
            Menu.mostrarSeparador();

    }

    public static void despesa(Scanner teclado) {

        double valorDespesa = Validacao.lerValorPositivo(teclado, "Qual o valor da despesa? R$");

            String tipoDespesa = Validacao.lerTexto(teclado, "Qual o tipo da despesa? ");
            saldoAtual -= valorDespesa;
            totalDespesas += valorDespesa;
            if (valorDespesa > maiorDespesa) {
                maiorDespesa = valorDespesa;
            }
            movimentacoes.add("Despesa | " + tipoDespesa + " | Valor = R$-" + valorDespesa);
            System.out.printf("Saldo atual: R$%.2f%n", saldoAtual);
            Menu.mostrarSeparador();

    }

    public static void resumo() {

        System.out.println("========= RESUMO =========");
        System.out.println("Total de receitas: " + totalReceitas);
        System.out.println("Total de despesas: " + totalDespesas);
        System.out.printf("Saldo atual: R$%.2f%n", saldoAtual);
        System.out.println("Quantidade de movimentações: " + movimentacoes.size());
        if (totalDespesas > 0) {
            System.out.println("Maior despesa: R$" + maiorDespesa);
        } else {
            System.out.println("Nenhuma despesa cadastrada!");
        }
        String situacao = definirSituacao(saldoAtual);
        System.out.println("Situacao: " + situacao);
        Menu.mostrarSeparador();

    }

    public static String definirSituacao(double saldoAtual) {
            if (saldoAtual > 0) {
                return "Positivo";
            } else if (saldoAtual == 0) {
                return "Zerado";
            } else {
                return "Negativo";
            }
    }

    public static void extrato() {

        if (!movimentacoes.isEmpty()) {
            System.out.println("========= EXTRATO =========");
            for (int i = 0; i < movimentacoes.size(); i++) {
                System.out.println((i+1) + " - " + movimentacoes.get(i));
            }
            System.out.println("===========================");
        } else {
            System.out.println("Nenhuma movimentação cadastrada.");
        }
    }
}



