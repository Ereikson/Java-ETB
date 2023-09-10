package herancaItemBiblioteca;

	public class Audiobook extends Cd {
		String vozDublagem;
	
	public String getVozDublagem() {
		return vozDublagem;
	}
	
	public void setVozDublagem(String vozDublagem) {
		this.vozDublagem = vozDublagem;
	}
	
	public Audiobook(String titulo, String autor, int anoPubli, String duracao, String vozDublagem) {
		super(titulo, autor, anoPubli, duracao);
		this.vozDublagem=vozDublagem;
		}
	
	public String toString() {
		return "\n Dados do Audiobook"+
				"\n Título: "+getTitulo()+
				"\n Autor: "+getAutor()+
				"\n Ano de Publicação: "+getAnoPubli()+
				"\n Duração: "+getDuracao()+
				"\n Dublador: "+getVozDublagem();
				}
	
}
