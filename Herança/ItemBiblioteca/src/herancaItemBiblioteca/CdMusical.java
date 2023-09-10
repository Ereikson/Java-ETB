package herancaItemBiblioteca;

	public class CdMusical extends Cd {
		String generoMusical;
	
	public String getGeneroMusical() {
		return generoMusical;
	}
	
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}
	
	public CdMusical(String titulo, String autor, int anoPubli, String duracao, String generoMusical) {
		super(titulo, autor, anoPubli, duracao);
		this.generoMusical=generoMusical;
		}
	
	
}
