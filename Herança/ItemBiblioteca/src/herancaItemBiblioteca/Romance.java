package herancaItemBiblioteca;

	public class Romance extends Livro {
		String subGenero;
	
	public String getSubGenero() {
		return subGenero;
	}
	
	public void setSubGenero(String subGenero) {
		this.subGenero = subGenero;
	}
	
	public Romance(String titulo, String autor, int anoPubli, String idioma, String subGenero) {
		super(titulo, autor, anoPubli, idioma);
		this.subGenero=subGenero;
		}
	
	
}
