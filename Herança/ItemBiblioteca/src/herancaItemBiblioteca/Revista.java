package herancaItemBiblioteca;

	public class Revista extends ItemBiblioteca {
		String editora;
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public Revista(String titulo, String autor, int anoPubli, String editora) {
		super(titulo,autor,anoPubli);
		this.editora=editora;
		}
	
	public String toString() {
		return 	"\n Dados da Revista "+
				"\n Título: "+getTitulo()+
				"\n Autor: "+getAutor()+
				"\n Ano de publicação: "+getAnoPubli()+
				"\n Editora: "+getEditora();
				}
}
