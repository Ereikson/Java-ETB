package associacaoPetShop;

	public class Endereco {
		private String cep;
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Endereco (String cep) {
		this.cep=cep;
	}
	
	public String toString() {
		return	"\n CEP: "+getCep();
				}
	
}
