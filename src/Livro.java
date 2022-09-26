public class Livro implements Comparable<Livro> {
    // Atributos código (String), título (String), autor (String), preço (double) e quantidade em estoque (int).
    private String id;
    private String autor;
    private double valor;
    private int estoque;

    // Métodos construtores

    public Livro(String m) {
        this.id = m;
    }

    public Livro(String id, String at) {
        this.id = id;
        this.autor = at;
    }

    public Livro(String id, String at, double vl, int stq) {
        this.id = id;
        this.autor = at;
        this.valor = vl;
        this.estoque = stq;
    }

    // Métodos GET
    public String getId() {
        return this.id;
    }

    public String getAt() {
        return this.autor;
    }

    public double getValor() {
        return this.valor;
    }

    public int getEstoque() {
        return this.estoque;
    }

    // Métodos SET
    public void setId(String id) {
        this.id = id;
    }

    public void setAt(String autor) {
        this.autor = autor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Método para comparar dois livros pela id
    @Override
    public int compareTo(Livro id) {
        int result;
        result = this.getId().compareTo(id.getId());
        return result;
    }

    @Override
    public String toString() {
        return this.id + " " + this.autor + " " + this.valor + " " + this.estoque;
    }
}
