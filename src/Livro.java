public class Livro implements Comparable<Livro> {
    // Atributos código (String), título (String), autor (String), preço (double) e
    // quantidade em estoque (int).
    private String id;
    private String titulo;
    private String autor;
    private double valor = 0.0;
    private int estoque = 1;

    // Métodos construtores

    public Livro(String id) {
        this.id = id;
    }

    public Livro(String id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public Livro(String id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String id, String titulo, String autor, double valor, int estoque) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
        this.estoque = estoque;
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
        return " Id: " + this.id + 
        "\n Título: " + this.titulo + 
        "\n Autor: " + this.autor + 
        "\n Valor: " + this.valor + 
        "\n Qtd Estoque: " + this.estoque+
        "\n";
    }
}
