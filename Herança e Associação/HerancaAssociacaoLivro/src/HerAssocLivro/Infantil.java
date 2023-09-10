package HerAssocLivro;

    public class Infantil extends Livro {
        private String faixaEtaria;

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    
    public Infantil(String nome, Autor autor, Editora editora, String faixaEtaria){
        super(nome, autor, editora);
        this.faixaEtaria=faixaEtaria;

    }

    public String toString(){
        return "\n ***Dados do Livro Infantil: ***" +
                "\n Nome:" + getNome() +
                "\n *Autor*" + getAutor() +
                "\n *Editora*" + getEditora() +
                "\n Faixa etária:" + getNome();
        }

    }


