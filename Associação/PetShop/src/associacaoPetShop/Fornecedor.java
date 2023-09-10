package associacaoPetShop;

	public class Fornecedor {
		private String nome, endereco;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Fornecedor(String nome, String endereco) {
		this.nome=nome;
		this.endereco=endereco;
		}
	
	public String toString() {
		return	"\n Nome: "+getNome()+
				"\n Endereço: "+getEndereco();
				}
}
