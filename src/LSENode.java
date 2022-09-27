// Classe LSENode
// Nó genérico de uma lista simplesmente encadeada
// T representa o tipo (classe) da informação que será "armazenada"
// Este T tem que ser uma classe é Comparable, ou seja, uma classe que implementa o método compareTo

public class LSENode<T extends Comparable<T>> {
    private T info;
    private LSENode<T> prox;

    public LSENode(T info) {
        this.info = info;
    }

    public void setInfo(T valor) {
        this.info = valor;
    }

    public T getInfo() {
        return this.info;
    }

    public void setProx(LSENode<T> novoProx) {
        this.prox = novoProx;
    }

    public LSENode<T> getProx() {
        return this.prox;
    }
}