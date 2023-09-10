package herancaPessoa;

	public class Diretor extends Funcionario {
		private Double gratificacao;
	
	public Double getGratificacao() {
		return gratificacao;
	}
	
	public void setGratificacao(Double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	public Diretor(String nome, String endereco, int matr, Double salario, Double gratificacao) {
		super(nome, endereco, matr, salario);
		this.gratificacao=gratificacao;
		}
	
	public String toString() {
		return 	"\n Dados do Diretor: "+
				"\n Nome: "+getNome()+
				"\n Endereço: "+getEndereco()+
				"\n Matrícula: "+getMatr()+
				"\n Salário: "+getSalario()+
				"\n Gratificação: "+getGratificacao();
				}
	
}
