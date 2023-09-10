package associacaoPetShop;

	public class Venda {
		private Double valor;
		private int quantidade;
		private Servico servico;
		private Funcionario funcionario;
		private Produto produto;
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Venda(Double valor, int quantidade, Servico servico, Funcionario funcionario, Produto produto) {
		this.valor=valor;
		this.quantidade=quantidade;
		this.servico=servico;
		this.funcionario=funcionario;
		this.produto=produto;
		}
	
	public String toString() {
		return"\n Valor: "+getValor()+
				"\n Quantidade: "+getQuantidade()+
				"\n *Dados do Serviço* "+getServico()+
				"\n *Dados do Funcionário* "+getFuncionario()+
				"\n *Dados do Produto* "+getProduto();
				}
	
}
