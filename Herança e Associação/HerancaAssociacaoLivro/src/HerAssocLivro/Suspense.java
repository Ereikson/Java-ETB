package HerAssocLivro;

    public class Suspense extends Livro {
        private int qtdePaginas;

    public int getQtdePaginas() {
        return qtdePaginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }

    public Suspense (String nome, Autor autor, Editora editora, int qtdePaginas){
        super(nome, autor, editora);
        this.qtdePaginas=qtdePaginas;
        }

    public String toString(){
        return "\n ***Dados do Livro de Suspense: ***" +
                "\n Nome:" + getNome() +
                "\n *Autor*" + getAutor() +
                "\n *Editora*" + getEditora() +
                "\n Quantidade de Páginas:" + getQtdePaginas();
        }

}
