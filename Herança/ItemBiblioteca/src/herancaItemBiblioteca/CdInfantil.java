package herancaItemBiblioteca;

	public class CdInfantil extends CdMusical {
		int faixaEtaria;
	
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	public CdInfantil(String titulo, String autor, int anoPubli, String duracao, String generoMusical, int faixaEtaria) {
		super(titulo, autor, anoPubli, duracao, generoMusical);
		this.faixaEtaria=faixaEtaria;
		}
	
	public String toString() {
		return 	"\n Dados do Cd Infantil "+
				"\n Título: "+getTitulo()+
				"\n Autor: "+getAutor()+
				"\n Ano de Publicação: "+getAnoPubli()+
				"\n Duração: "+getDuracao()+
				"\n Gênero Musical: "+getGeneroMusical()+
				"\n Faixa Etária: "+getFaixaEtaria();
				}
	
}
