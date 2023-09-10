package herancaItemBiblioteca;
	
	public class LivroDidatico extends Livro {
		String disciplina;
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public LivroDidatico(String titulo, String autor, int anoPubli, String idioma, String disciplina) {
		super(titulo, autor, anoPubli, idioma);
		this.disciplina=disciplina;
		}
	
	public String toString() {
		return "\n Dados do Livro Didático "+
				"\n Título: "+getTitulo()+
				"\n Autor: "+getAutor()+
				"\n Ano de publicação: "+getAnoPubli()+
				"\n Idioma: "+getIdioma()+
				"\n Disciplina: "+getDisciplina();
				}
	
}
