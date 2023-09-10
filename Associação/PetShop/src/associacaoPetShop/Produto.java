package associacaoPetShop;

	public class Produto {
		private	String tipoProduto;
		private int qtdProduto;
		private Fornecedor fornecedor;
		
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Produto(String tipoProduto, int qtdProduto, Fornecedor fornecedor) {
		this.tipoProduto=tipoProduto;
		this.qtdProduto=qtdProduto;
		this.fornecedor=fornecedor;
		}
	
	public String toString() {
		return 	"\n Tipo do produto: "+getTipoProduto()+
				"\n Quantidade do produto: "+getQtdProduto()+
				"\n *Dados do Fornecedor* "+getFornecedor();
				}
		
}
