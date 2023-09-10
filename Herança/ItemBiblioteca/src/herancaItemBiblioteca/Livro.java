package herancaItemBiblioteca;

	public class Livro extends ItemBiblioteca {
		String idioma;
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public Livro (String titulo, String autor, int anoPubli, String idioma) {
		super(titulo, autor, anoPubli);
		this.idioma=idioma;
		}
	
}
