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

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public LSENode<T> getProx() {
        return prox;
    }

    public void setProx(LSENode<T> prox) {
        this.prox = prox;
    }

}