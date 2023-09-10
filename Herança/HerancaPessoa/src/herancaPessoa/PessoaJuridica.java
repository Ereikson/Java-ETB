package herancaPessoa;

	public class PessoaJuridica extends Cliente {
		private String cnpj;
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public PessoaJuridica(String nome, String endereco, int idade, String cnpj) {
		super(nome,endereco,idade);
		this.cnpj=cnpj;
		}
	
	public String toString() {
		return 	"\n Dados da Pessoa Jurídica"+
				"\n Nome: "+getNome()+
				"\n Endereço: "+getEndereco()+
				"\n Idade: "+getIdade()+
				"\n CNPJ: "+getCnpj();
	}

}
