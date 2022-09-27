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
    
      public void remove(T info) {
        LSENode<T> aux, anterior, atual;
        if (this.isEmpty() == true)// testa se a lista ta vazia
            System.out.println("lista vazia");
        else if (this.qtd == 1) {// lista somente com um objeto
            // testa pra ver se é o objeto q vai ser apagado
            if (info.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                this.ultimo = null;
                this.qtd = 0;
            } else
                System.out.println("Valor não pertence a lista");
        } else if (info.compareTo(this.primeiro.getInfo()) == 0) {// lista com mais de um no
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
        } // testando se o valor passado é menor q o primeiro pra ver se ele esta na lista
        else if (info.compareTo(this.primeiro.getInfo()) < 0)
            System.out.println("Valor não pertence a lista");
        // testando pra ver se o valor esta no final
        else if (info.compareTo(this.ultimo.getInfo()) == 0) { // remoção do ultimo
            aux = this.primeiro;
            // loop pra deixar um aux antes do ultimo nó
            while (aux.getProx() != this.ultimo) {
                aux = aux.getProx();
            }
            // removendo ultimo
            aux.setProx(null);
            this.ultimo = aux;
            this.qtd--;
        } else if (info.compareTo(this.ultimo.getInfo()) > 0) {
            System.out.println("Valor não pertence a lista");
        } else {// testando pra ver se o valor esta no "meio" da lista
            anterior = null;
            atual = this.primeiro;
            while (atual != null) {
                if (info.compareTo(atual.getInfo()) == 0) {// achou e remove
                    anterior.setProx(atual.getProx());
                    this.qtd--;
                    break;
                }else if(info.compareTo(atual.getInfo()) < 0){//testando se vai ter um maior pra sair e se pertence a lista
                    System.out.println("Valor não pertence a lista");
                    break;
                }
                else {
                    anterior = atual;
                    atual = atual.getProx();
                }
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
