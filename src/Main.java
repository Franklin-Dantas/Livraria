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
        String id, autor, titulo;
        double valor = 0.0;
        int op, estoque;
        Livro livro;

        do {
            menu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Digite o id do livro: ");
                    id = in.nextLine();
                    System.out.println("Digite o nome do livro: ");
                    titulo = in.nextLine();
                    System.out.println("Informe o nome do autor : ");
                    autor = in.nextLine();
                    livro = new Livro(id, titulo, autor);
                    listaLivros.inserirOrdenado(livro);
                    break;
                case 2:
                    System.out.println("Informe o id do produto: ");
                    id = in.nextLine();
                    Livro l2 = new Livro(id);
                    listaLivros.remover(l2);
                    break;
                case 3:
                    System.out.println("Informe o id do livro: ");
                    id = in.nextLine();
                    Livro l3 = new Livro(id);
                    listaLivros.exibir(l3);
                    break;
                case 4:
                    System.out.println("Informe o código do livro:");
                    id = in.nextLine();
                    Livro l4 = new Livro(id);
                    LSENode<Livro> aux = listaLivros.pesquisaAprimorada(l4);
                    if (aux != null) {
                        System.out.println("Informe o novo preço do livro: ");
                        valor = Double.parseDouble(in.nextLine());
                        aux.getInfo().setValor(valor);
                    } else
                        System.out.println("Livro não encontrado!");
                    break;
                case 5:
                    System.out.println("Informe o id do livro: ");
                    id = in.nextLine();
                    Livro l5 = new Livro(id);
                    LSENode<Livro> aux1 = listaLivros.pesquisaAprimorada(l5);
                    if (aux1 != null) {
                        System.out.println("Informe quantidade dele no estoque: ");
                        estoque = Integer.parseInt(in.nextLine());
                        estoque += aux1.getInfo().getEstoque();
                        aux1.getInfo().setEstoque(estoque);
                    } else
                        System.out.println("Livro não encontrado!");
                    break;
                case 6:
                    System.out.println("Informe o id do livro: ");
                    id = in.nextLine();
                    Livro l6 = new Livro(id);
                    LSENode<Livro> aux2 = listaLivros.pesquisaAprimorada(l6);
                    if (aux2 != null) {
                        System.out.println("Quantidade do livro: ");
                        estoque = Integer.parseInt(in.nextLine());
                        if (aux2.getInfo().getEstoque() - estoque >= 0) {
                            aux2.getInfo().setEstoque(aux2.getInfo().getEstoque() - estoque);
                            System.out.println("Compra realizada!");
                        } else {
                            System.out.println("Estoque indisponível!");
                        }
                        break;
                    }
                case 7:
                    // mostrar todos os dados dos livros
                    listaLivros.exibirTodos();
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
