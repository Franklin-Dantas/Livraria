public class LSEOrdenada<T extends Comparable<T>> {
    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int qtd;

    public boolean isEmpty() {
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) { // testando todas possibilidades
            return true;
        } else {
            return false;
        }
    }

    // inserir ordenado crescente sem repetir
    public void inserirOrdenado(T valor) {
        LSENode anterior = null, atual = null;
        LSENode novo = new LSENode<T>(valor);
        // ja tem um valor na lista
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;

        } else if (valor.compareTo(this.primeiro.getInfo()) < 0) {
            // vai inserir no inicio da lista
            novo.setProx((this.primeiro));
            this.primeiro = novo;
            this.qtd++;
        } else if (valor.compareTo(this.ultimo.getInfo()) > 0) {
            // vai inserir no final da lista
            novo.setProx((novo));
            this.ultimo = novo;
            this.qtd++;
        } else { // insersir no "meio" da lista
            atual = this.primeiro;

            while (atual != null) {
                if (atual.getInfo().compareTo(valor) > 0) {// inserir
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
}
