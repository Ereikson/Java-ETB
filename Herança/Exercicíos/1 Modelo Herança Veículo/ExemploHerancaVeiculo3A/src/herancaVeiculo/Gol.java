package herancaVeiculo;
public class Gol extends Leve{
    private String marca;
    private double kmRodados;
    private int qtdPassageiros;

    /**
     * @return the marca
     */
    public String getmarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setmarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the kmRodados
     */
    public double getkmRodados() {
        return kmRodados;
    }

    /**
     * @param kmRodados the kmRodados to set
     */
    public void setkmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }

    /**
     * @return the qtdPassageiros
     */
    public int getqtdPassageiros() {
        return qtdPassageiros;
    }

    /**
     * @param qtdPassageiros the qtdPassageiros to set
     */
    public void setqtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }


    public Gol(int chassi, int ano, int qtdPortas, String marca, double kmRodados,
 int qtdPassageiros){
        super(chassi, ano, qtdPortas);
        this.marca=marca;
        this.kmRodados=kmRodados;
        this.qtdPassageiros=qtdPassageiros;   
    }

    public String toString(){
        return "\n Dados do Veículo Leve Gol:" +
                "\n Chassi:" + getChassi() +
                "\n Ano:" + getAno() +
                "\n Quantidade de Portas:" + getqtdPortas()+
                "\n Marca:" + getmarca()+
                "\n Quantidade de KM Rodados:" + getkmRodados()+
                "\n Quantidade de Passageiros:" + getqtdPassageiros();
    }

}
