package herancaItemBiblioteca;

	public class Cd extends ItemBiblioteca {
		String duracao;
	
	public String getDuracao() {
		return duracao;
	}
	
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public Cd(String titulo, String autor, int anoPubli, String duracao) {
		super(titulo, autor, anoPubli);
		this.duracao=duracao;
		}
	
}
