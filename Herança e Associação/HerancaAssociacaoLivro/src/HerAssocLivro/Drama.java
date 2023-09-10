package HerAssocLivro;

    public class Drama extends Livro {
        private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Drama (String nome, Autor autor, Editora editora, String descricao){
        super(nome, autor, editora);
        this.descricao=descricao;
        }

    public String toString(){
        return "\n ***Dados do Livro de Drama: ***" +
                "\n Nome:" + getNome() +
                "\n *Autor*" + getAutor() +
                "\n *Editora*" + getEditora() +
                "\n Descrição do Livro:" + getDescricao();
        }

}
