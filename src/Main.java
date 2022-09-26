import java.util.Scanner;

public class Main {

    public static void menu() {
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
        System.out.println("     Escolha uma das opções: ");

    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        LSEOrdenada listaLivros = new LSEOrdenada();
        Livro livro;
        String autor, id, ttl;
        double valor = 0.0;
        int op, estoque = 1;
        do {
            menu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Digite o id do livro: ");
                    id = in.nextLine();
                    System.out.println("Digite o nome do livro: ");
                    ttl = in.nextLine();
                    System.out.println("Informe o nome do autor : ");
                    autor = in.nextLine();
                    livro = new Livro(id, ttl, autor);
                    listaLivros.inserirOrdenado(livro);
                    break;
                case 2:
                    System.out.println("Informe o id do produto: ");// não funciona
                    id = in.nextLine();
                    listaLivros.remover(id);
                    break;
                case 3:
                    System.out.println("Informe o id do livro: ");
                    id = in.nextLine();
                    listaLivros.exibir();
                    break;
                case 4:
                    System.out.println("Informe o id do livro: ");
                    id = in.nextLine();
                    System.out.println("Informe o novo valor: ");
                    valor = in.nextDouble();
                    listaLivros.alterarValor(id, valor);
                    break;
                case 5:
                    System.out.println("Informe o id do livro: ");
                    id = in.nextLine();
                    System.out.println("Informe quantidade dele no estoque: ");
                    valor = in.nextDouble();
                    listaLivros.alterarEstoque(id, estoque);
                    break;
                case 6:
                    System.out.println("Informe o id do livro: ");
                    id = in.nextLine();
                    listaLivros.venderLivro(id, estoque);
                    break;
                case 7:
                    // mostrar todos os dados dos livros
                    listaLivros.exibirTodos();// não está mostrando todos os resultado
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
