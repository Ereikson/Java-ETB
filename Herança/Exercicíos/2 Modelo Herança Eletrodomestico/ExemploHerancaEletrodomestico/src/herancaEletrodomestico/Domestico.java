package herancaEletrodomestico;
public class Domestico extends Fogao{
    
private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Domestico(int numeroSerie, int peso, String marca, String nome,
        int qtdBocas, double largura, String tipo){
            super(numeroSerie, peso, marca, nome, qtdBocas, largura);
            this.tipo=tipo;
        }

    public String toString(){
        return "\n Dados do fogão Domestico:" +
                "\n Número de série:" + getNumeroSerie() +
                "\n Peso:" + getPeso() +
                "\n Marca:" + getMarca() +
                "\n Nome:" + getNome()+
                "\n Quantidade de Bocas:" + getQtdBocas()+
                "\n Largura do fogão:" +getLargura()+
                "\n Tipo do fogão:"+getTipo();
                }

}
