package associacaoPetShop;

	public class Funcionario {
		private int matricula;
		private String cargo, nome;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Funcionario(int matricula, String cargo, String nome) {
		this.matricula=matricula;
		this.cargo=cargo;
		this.nome=nome;
		}
	
	public String toString() {
		return	"\n Matrícula: "+getMatricula()+
				"\n Cargo: "+getCargo()+
				"\n Nome: "+getNome();
				}
	
}
