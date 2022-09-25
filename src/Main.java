import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("     Escolha uma das opções");
        System.out.println("");
        System.out.println("01 - Cadastrar um novo livro");
        System.out.println("02 - Remover um livro do cadastro");
        System.out.println("03 - Exibir os dados de um livro");
        System.out.println("04 - Alterar o preço de um livro");
        System.out.println("05 - Atualizar o estoque de um livro");
        System.out.println("06 - Vender um livro ");
        System.out.println("07 - Exibir todos os livros cadastrados");
        System.out.println("");
        System.out.println("00 - Encerrar programa");
        System.out.println("");
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int op;
        do {
            menu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);

    }
}
