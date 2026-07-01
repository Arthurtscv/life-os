import java.util.Scanner;

void main() {
    Scanner teclado = new Scanner(System.in);
    System.out.printf("========= LIFE OS =========%n%n");
    System.out.println("1 - Cadastrar receita");
    System.out.println("2 - Consultar despesa");
    System.out.println("3 - Ver saldo");
    System.out.printf("0 - Sair%n%n");
    System.out.print("Escolha uma opção: ");
    int opcao = teclado.nextInt();
    switch (opcao) {
        case 0:
            System.out.println("Saindo do sistema");
            break;

        case 1:
            System.out.println("Você escolheu cadastrar receita");
            break;

        case 2:
            System.out.println("Você escolheu cadastrar despesa");
            break;

        case 3:
            System.out.println("Você escolheu ver saldo");
            break;

        default:
            System.out.println("Opção inválida");
            break;
    }
}
