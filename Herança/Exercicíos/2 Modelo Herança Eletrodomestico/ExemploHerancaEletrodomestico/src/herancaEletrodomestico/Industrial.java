package herancaEletrodomestico;
public class Industrial extends Fogao{

private double profundidade;

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public Industrial(int numeroSerie, int peso, String marca, String nome,
        int qtdBocas, double largura, double profundidade){
            super(numeroSerie, peso, marca, nome, qtdBocas, largura);
            this.profundidade=profundidade;
        }

    public String toString(){
        return "\n Dados do fogão Industrial:" +
                "\n Número de série:" + getNumeroSerie() +
                "\n Peso:" + getPeso() +
                "\n Marca:" + getMarca() +
                "\n Nome:" + getNome()+
                "\n Quantidade de Bocas:" + getQtdBocas()+
                "\n Largura do fogão:" +getLargura()+
                "\n Profundidade do fogão:"+getProfundidade();
                }


    
}
