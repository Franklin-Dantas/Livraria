public class LSEOrdenada<T extends Comparable<T>> {
    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int qtd;

//////////////////////////////////////////////////////   Métodos   /////////////////////////////////////////////////////////////////////////////

    public boolean isEmpty() {
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) { // testando todas possibilidades
            return true;
        } else {
            return false;
        }
    }

    public LSENode<T> pesquisaAprimorada(T info) {
        LSENode<T> aux;
        if (isEmpty()) {
            return null;
        } else {
            aux = this.primeiro;
            for (int i = 1; i <= this.qtd; i++) {
                if (aux.getInfo().compareTo(info) == 0) {
                    return aux;
                }
                if (aux.getInfo().compareTo(info) > 0) {
                    return null;
                }
                aux = aux.getProx();
            }
            return null;
        }
    }
    
    public void inserirOrdenado(T valor) {
        LSENode<T> novo = new LSENode(valor);
        LSENode<T> anterior = null, atual;
        LSENode result = this.pesquisaAprimorada(valor);
        if (result != null) {
            System.out.println("LIVRO JÁ CADASTRADO!");
        }
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
                if (atual.getInfo().compareTo(valor) > 0) { // insere
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
    
    public void remover(T id) {
        
        if (this.isEmpty() == true)
            System.out.println("Lista vazia!");
        else if (this.primeiro.getProx() == null) {
            if (this.primeiro.getInfo().compareTo(id) == 0) {
                this.primeiro = null;
                this.ultimo = null;
                this.qtd = 0;
                System.out.println("Livro removido!");
            } else
                System.out.println("Livro não existe!");
        } else {
            LSENode<T> atual = this.primeiro;
            LSENode<T> anterior = null;
            if (this.primeiro.getInfo().compareTo(id) == 0) {
                this.primeiro = this.primeiro.getProx();
                System.out.println("Livro removido!");
            }
            while (atual != null) {
                if (atual.getInfo().compareTo(id) == 0) {
                    anterior.setProx(atual.getProx());
                    System.out.println("Livro removido!");
                    this.qtd--;
                    return;
                }
                if (atual.getInfo().compareTo(id) > 0) {
                    System.out.println("Livro não existe!");
                    break;
                }
                anterior = atual;
                atual = atual.getProx();
            }
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

    public void exibir(T info) {

        // exibe o conteúdo de todos os nós da lista
        LSENode<T> aux = this.pesquisaAprimorada(info);
        if (aux != null) {
            System.out.println(aux.getInfo());
        } else {
            System.out.println("Não existe o livro na lista");
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
}
