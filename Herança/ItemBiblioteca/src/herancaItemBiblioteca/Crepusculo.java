package herancaItemBiblioteca;

	public class Crepusculo extends Romance {
		String capa, edicao;
	
	public String getCapa() {
		return capa;
	}
	
	public void setCapa(String capa) {
		this.capa = capa;
	}
	
	public String getEdicao() {
		return edicao;
	}
	
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	public Crepusculo(String titulo, String autor, int anoPubli, String idioma, String subgenero, String capa, String edicao) {
		super(titulo, autor, anoPubli, idioma, subgenero);
		this.capa=capa;
		this.edicao=edicao;
		}
	
	public String toString() {
		return 	"\n Dados Crepúsculo"+
				"\n Título: "+getTitulo()+
				"\n Autor: "+getAutor()+
				"\n Ano de Publicação: "+getAnoPubli()+
				"\n Idioma: "+getIdioma()+
				"\n Subgênero: "+getSubGenero()+
				"\n Capa: "+getCapa()+
				"\n Edição: "+getEdicao();
				}
	
}
