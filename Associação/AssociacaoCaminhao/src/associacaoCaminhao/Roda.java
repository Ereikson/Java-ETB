package associacaoCaminhao;

    public class Roda {
    private int diametro;
    private String fabricante;
    private String cor;
    private Parafuso parafuso;

    public Roda (int diametro, String fabricante,String cor, Parafuso parafuso ){
        this.diametro=diametro;
        this.fabricante=fabricante;
        this.cor=cor;
        this.parafuso=parafuso;
        
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Parafuso getParafuso() {
        return parafuso;
    }

    public void setParafuso(Parafuso parafuso) {
        this.parafuso = parafuso;
    }

    public String toString (){
        return  "\n Diâmetro:"+ getDiametro()+
                "\n Fabricante:"+getFabricante()+
                "\n Cor:"+getCor()+
                "\n ***Dados do Parafuso***"+ getParafuso();
        } 

    
}
