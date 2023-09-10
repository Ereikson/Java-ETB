package herancaVeiculo;
public class Pesado extends Veiculo{
    
    private String nome;
    private int capacidadeCarga;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public Pesado(int chassi, int ano, String nome, int capacidadeCarga){
        super(chassi, ano);
        this.nome=nome;
        this.capacidadeCarga=capacidadeCarga;
    }
    
    public String toString(){
        return "\n Dados do Veículo Pesado:" +
                "\n Chassi:" + getChassi() +
                "\n Nome:" + getNome() +
                "\n Ano:" + getAno() +
                "\n Capacidade de Carga:" + getCapacidadeCarga();
    }
}
