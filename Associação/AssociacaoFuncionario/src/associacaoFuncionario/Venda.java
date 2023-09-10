package associacaoFuncionario;

	public class Venda {
		private Double valor;
		private Produto produto;
		private Funcionario funcionario;
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Venda(Double valor, Produto produto, Funcionario funcionario){
		this.valor=valor;
		this.produto=produto;
		this.funcionario=funcionario;
	}
	
	public String toString() {
		return	"\n Valor: "+getValor()+
				"\n *Dados do Produto* "+getProduto()+
				"\n *Dados do Funcionário* "+getFuncionario();
	}
	
}
