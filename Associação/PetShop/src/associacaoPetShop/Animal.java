package associacaoPetShop;

	public class Animal {
		private String nome, tipo, raca;
		private int idade;
		private Cliente cliente;
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Animal(String nome, String tipo, String raca, int idade, Cliente cliente) {
		this.nome=nome;
		this.tipo=tipo;
		this.raca=raca;
		this.idade=idade;
		this.cliente=cliente;
		}
	
	public String toString() {
		return	"\n Nome: "+getNome()+
				"\n Tipo: "+getTipo()+
				"\n Raça: "+getRaca()+
				"\n Idade: "+getIdade()+
				"\n *Dados do Cliente* "+getCliente();
				}
	
}
