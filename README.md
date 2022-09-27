## Getting Started

Questão única: João tem uma livraria e necessita de uma aplicação para controlar o
estoque de livros. Implemente um programa para controlar o estoque de livros da
livraria de João. O programa irá implementar o cadastro dos livros utilizando uma lista
linear simplesmente encadeada genérica, ordenada. Uma lista de livros será ordenada
em ordem crescente. A chave de ordenação é o código do livro. O programa
implementado deverá ter o menu abaixo e um loop para permitir que o usuário manipule
o cadastro dos livros.

## Folder Structure

O programa deverá utilizar quatro classes: a classe Livro, a classe LSENode, a classe
LSEOrdenada e a classe principal (aplicação).

A classe Livro:

Sobre cada Livro deverão ser mantidas as seguintes informações: código (String), título
(String), autor (String), preço (double) e quantidade em estoque (int). Implemente, na
classe Livro, o(s) construtor(es), os métodos get e set, o método toString e o método
compareTo (o que diferencia um Livro de outro é seu código). Após criado um Livro,
seu código não poderá ser alterado.

A classe LSEOrdenada:

A classe LSEOrdenada é genérica.

A classe LSEOrdenada deverá ter os seguintes métodos:

(a) Procedimento para inserir um novo item na lista. Este procedimento deverá
receber como parâmetro o item a ser inserido. Este método é uma inserção
ordenada e irá inserir o novo item na lista de forma que a lista permaneça
ordenada após a inserção.

(b) Procedimento para exibir todos os itens cadastrados na lista.

(c) Função para, dado um item, procurá-lo na lista e, caso encontre, retornar uma
referência para o objeto encontrado. Caso não encontre, deverá retornar null.
OBS1: Para implementar esta função, utilize a lógica da busca sequencial
melhorada. OBS2: Utilize esta função na implementação dos itens 3, 4, 5 e 6 do
menu de opções.

(d) Procedimento para, dado um item, removê-lo da lista. Primeiro, o método deve
procurar o item a ser removido. NÃO utilizar a função definida no item (c).
Caso encontre o item, remova-o. Caso não encontre, avise ao usuário que o item
não pertence à lista. OBS: Ao procurar o item para remoção, utilize a lógica da
busca sequencial melhorada.

(e) Função para testar se a lista está vazia.

/* 
    public void alterarValor(String id, double valor) {

        // altera a valor de um Livro
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            Livro aux = new Livro(id, valor);
            this.primeiro = buscar(aux);
            aux = (Livro) this.primeiro.getInfo();
            System.out.println(this.primeiro.getInfo());
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
            System.out.println(this.primeiro.getInfo());
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
    public Aluno copiarLivro(){
        Livro novo = new Livro (this.id, this.titulo, this.autor, this.valor, this.estoque);
        return novo
    }
    public LSEOredenada criarUniao (LSEOredenada outra){
        LSEOredenada listaUniao = new LSEOredenada();
        LSENode<T> aux;
        Livro original,copia;

        aux = this.primeiro;
        while (aux != null){
            original = aux.getInfo();
            copia = original.copiarLivro();
            listaUniao.inserirLivroFinal(copia);
            aux =aux.getProx();
        }
        aux = outra.primeiro;
        while (aux != null){
            original = aux.getInfo();
            copia = original.copiarLivro();
            listaUniao.inserirLivroFinal(copia);
            aux = aux.getProx();
        }
    }
    return listaUniao;
}
    */