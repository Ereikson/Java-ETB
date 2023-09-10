package associacaoFuncionario;

	public class Funcionario {
		private int matricula;
		private String nome;
		Cargo cargo;
		Salario salario;
		Endereco endereco;
		Dependente dependente;
		Formacao formacao;

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Salario getSalario() {
		return salario;
	}
	public void setSalario(Salario salario) {
		this.salario = salario;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Dependente getDependente() {
		return dependente;
	}
	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}
	public Formacao getFormacao() {
		return formacao;
	}
	public void setFormacao(Formacao formacao) {
		this.formacao = formacao;
	}
	
	public Funcionario(int matricula, String nome, Cargo cargo, Salario salario, Endereco endereco, Dependente dependente, Formacao formacao) {
		this.matricula=matricula;
		this.nome=nome;
		this.cargo=cargo;
		this.salario=salario;
		this.endereco=endereco;
		this.dependente=dependente;
		this.formacao=formacao;
		}
	
	public String toString() {
		return	"\n Matrícula: "+getMatricula()+
				"\n Nome: "+getNome()+
				"\n *Dados do Cargo* "+getCargo()+
				"\n *Dados do Salário* "+getSalario()+
				"\n *Dados do Endereço* "+getEndereco()+
				"\n *Dados do(s) Dependente(s)* "+getDependente()+
				"\n *Dados da Formação* "+getFormacao();
				}
	
}
