package herancaEletrodomestico;
public class Fogao extends Eletrodomestico {

private int qtdBocas;
private double largura;

    public int getQtdBocas() {
        return qtdBocas;
    }

    public void setQtdBocas(int qtdBocas) {
        this.qtdBocas = qtdBocas;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
        public Fogao(int numeroSerie, int peso, String marca, String nome,
        int qtdBocas, double largura){
        super(numeroSerie, peso, marca, nome);
            this.qtdBocas=qtdBocas;
            this.largura=largura;
        }

}
