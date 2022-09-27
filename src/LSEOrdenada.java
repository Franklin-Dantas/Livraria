public class LSEOrdenada<T extends Comparable<T>> {
    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int qtd;

    ///////////////////////////////////////////////// Métodos //////////////////////////////////////////////////////////////////////////////////////

    public boolean isEmpty() {
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) { // testando todas possibilidades
            return true;
        } else {
            return false;
        }
    }

    public LSENode buscar(Livro livro) {

        // busca um libvro na lista
        // testando pra ver se essa vazia retornal null
        if (this.isEmpty() == true) {
            return null;
        } else {
            LSENode aux;
            aux = this.primeiro;
            while (aux != null) {
                // testando pra ver se ja existe livro
                if (aux.getInfo().compareTo(livro) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void exibir() {

        // exibe o conteúdo de todos os nós da lista
        LSENode aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void inserirOrdenado(T valor) {
        LSENode novo = new LSENode(valor);
        LSENode anterior = null, atual;
        if (this.isEmpty() == true) { // inserção na lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (valor.compareTo(this.primeiro.getInfo()) < 0) { // inserção no início
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
        } else if (valor.compareTo(this.ultimo.getInfo()) > 0) { // inserção no final
            this.ultimo.setProx(novo);
            this.ultimo = novo;
            this.qtd++;
        } else { // inserção no "meio" da lsta
            atual = this.primeiro;
            while (atual != null) {
                if (atual.getInfo().compareTo(valor) > 0) { // inserir
                    anterior.setProx(novo);
                    novo.setProx(atual);
                    this.qtd++;
                    return;
                } else {
                    anterior = atual;
                    atual = atual.getProx();
                }
            }
        }
    }

    public void exibirTodos() {
        LSENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void alterarValor(String id, double valor) {

        // altera a valor de um Livro
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            Livro aux = new Livro(id, valor);
            this.primeiro = buscar(aux);
            aux = (Livro) this.primeiro.getInfo();
            aux.setValor(valor);
        }
    }

    public void remover(String id) {

        // remove um livro
        Livro aux = new Livro(id);
        if (this.isEmpty() == true)
            System.out.println("Lista vazia!");
        else if (this.primeiro.getInfo().compareTo((T) aux) == 0) {
            this.primeiro = null;
            System.out.println("Livro removido!");

        } else {
            LSENode aux1 = this.primeiro;
            LSENode penultimo = aux1;
            if (this.primeiro.getInfo().compareTo((T) aux) == 0) {
                aux1 = this.primeiro;
                this.primeiro = null;
                aux1 = aux1.getProx();
                this.primeiro = aux1;
            } else {
                while (aux1 != null) {
                    if (aux1.getInfo().compareTo(aux) == 0) {
                        penultimo.getProx();
                        System.out.println("Livro removido!");
                        break;
                    }
                    penultimo = aux1;
                    aux1 = aux1.getProx();
                }
            }
        }
    }

    public void venderLivro(String id, int estoque) {
        // altera a quantidade do estoque de um Livro
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            Livro aux = new Livro(id, estoque);
            this.primeiro = buscar(aux);
            aux = (Livro) this.primeiro.getInfo();
            aux.setEstoque(estoque--);
        }
    }

    public void alterarEstoque(String id, int estoque) {
        // altera a quantidade do estoque de um Livro
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            Livro aux = new Livro(id, estoque);
            this.primeiro = buscar(aux);
            aux = (Livro) this.primeiro.getInfo();
            aux.setEstoque(estoque);
        }
    }

}
