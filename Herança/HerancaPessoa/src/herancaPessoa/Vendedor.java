package herancaPessoa;

	public class Vendedor extends Funcionario {
		private String setorVendas;
		private Double comissao, totalVendido;
	
	public String getSetorVendas() {
		return setorVendas;
	}
	public void setSetorVendas(String setorVendas) {
		this.setorVendas = setorVendas;
	}
	public Double getComissao() {
		return comissao;
	}
	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	public Double getTotalVendido() {
		return totalVendido;
	}
	public void setTotalVendido(Double totalVendido) {
		this.totalVendido = totalVendido;
	}
	
	public Vendedor(String nome, String endereco, int matr, Double salario, String setorVendas, Double comissao, Double totalVendido) {
		super(nome, endereco, matr, salario);
		this.setorVendas=setorVendas;
		this.comissao=comissao;
		this.totalVendido=totalVendido;
		}
	
	public String toString() {
		return 	"\n Dados do Vendedor: "+
				"\n Nome: "+getNome()+
				"\n Endereço: "+getEndereco()+
				"\n Matrícula: "+getMatr()+
				"\n Salário: "+getSalario()+
				"\n Gratificação: "+getSetorVendas()+
				"\n Comissão: "+getComissao()+
				"\n Total Vendidos: "+getTotalVendido();
				}
	
	
}
