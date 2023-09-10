package herancaVeiculo;
public class Leve extends Veiculo{
private int qtdPortas;

    public int getqtdPortas() {
        return qtdPortas;
    }

    public void setqtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
 
    public Leve(int chassi, int ano, int qtdPortas){
        super(chassi, ano);
        this.qtdPortas=qtdPortas;   
    }

    public String toString(){
        return "\n Dados do Veículo Leve:" +
                "\n Chassi:" + getChassi() +
                "\n Ano:" + getAno() +
                "\n Quantidade de Portas:" + getqtdPortas();
    }

}


