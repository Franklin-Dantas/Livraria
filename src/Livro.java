public class Livro implements Comparable<Livro> {
    // Atributos código (String), título (String), autor (String), preço (double) e
    // quantidade em estoque (int).
    private String id;
    private String titulo;
    private String autor;
    private double valor;
    private int estoque;

    // Métodos construtores

    public Livro(String id) {
        this.id = id;
    }

    public Livro(String id, double vl) {
        this.id = id;
        this.valor = vl;
    }

    public Livro(String id, String ttl, String at) {
        this.id = id;
        this.id = ttl;
        this.autor = at;
    }

    public Livro(String id, String ttl, String at, double vl, int stq) {
        this.id = id;
        this.id = ttl;
        this.autor = at;
        this.valor = vl;
        this.estoque = stq;
    }

    // Métodos GET
    public String getId() {
        return this.id;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getTitulo() {
        return titulo;
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
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
    public int compareTo(Livro livro) {

        int result;
        result = this.getId().compareTo(livro.getId());
        return result;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + "\nTítulo: " + this.titulo + "\nAutor: " + this.autor + " \nValor: " + this.valor
                + " \nQtd Estoque: " + this.estoque;
    }
}
