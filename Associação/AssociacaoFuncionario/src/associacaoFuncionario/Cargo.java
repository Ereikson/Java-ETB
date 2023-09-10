package associacaoFuncionario;

	public class Cargo {
		String nome;
		Atribuicao atribuicao;
		Gratificacao gratificacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Atribuicao getAtribuicao() {
		return atribuicao;
	}
	public void setAtribuicao(Atribuicao atribuicao) {
		this.atribuicao = atribuicao;
	}
	public Gratificacao getGratificacao() {
		return gratificacao;
	}
	public void setGratificacao(Gratificacao gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	public Cargo(String nome, Atribuicao atribuicao, Gratificacao gratificacao) {
		this.nome=nome;
		this.atribuicao=atribuicao;
		this.gratificacao=gratificacao;
		}
	
	public String toString() {
		return	"\n Nome: "+getNome()+
				"\n *Dados da Atribuição* "+getAtribuicao()+
				"\n *Dados da Gratificação* "+getGratificacao();
	}
	
}
