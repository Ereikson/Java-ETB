package associacaoEscola;

	public class Origem {
		private String nomePai, nomeMae;
		private Cidade cidade;

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Origem(String nomePai,String nomeMae, Cidade cidade) {
		this.nomePai=nomePai;
		this.nomeMae=nomeMae;
		this.cidade=cidade;
		}
	
	public String toString() {
		return 	"\n Nome do pai: "+getNomePai()+
				"\n Nome da mãe: "+getNomeMae()+
				"\n *Dados da Cidade:"+getCidade();
				}
	
}
