package associacaoPetShop;

	public class Servico {
		private String tipoServico;
		private int qtdServico;
		private Animal animal;
		
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	public int getQtdServico() {
		return qtdServico;
	}
	public void setQtdServico(int qtdServico) {
		this.qtdServico = qtdServico;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public Servico(String tipoServico, int qtdServico, Animal animal) {
		this.tipoServico=tipoServico;
		this.qtdServico=qtdServico;
		this.animal=animal;
		}
	
	public String toString() {
		return"\n Tipo de Serviço: "+getTipoServico()+
				"\n Quantidade: "+getQtdServico()+
				"\n *Dados do Animal* "+getAnimal();
				}
	
}
