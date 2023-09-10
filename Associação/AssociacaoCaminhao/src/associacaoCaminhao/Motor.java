package associacaoCaminhao;

    public class Motor {
        private int potencia;
        private int cilindrada;
        private String tipoCombustivel;
        private Parafuso parafuso;
    

    public Motor (int potencia, int cilindrada, String tipoCombustivel, Parafuso parafuso ){
        this.potencia=potencia;
        this.cilindrada=cilindrada;
        this.tipoCombustivel=tipoCombustivel;
        this.parafuso=parafuso;
        
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Parafuso getParafuso() {
        return parafuso;
    }

    public void setParafuso(Parafuso parafuso) {
        this.parafuso = parafuso;
    }

    public String toString (){
        return  "\n Potencia:"+ getPotencia()+
                "\n Cilindrada:"+getCilindrada()+
                "\n Tipo de Combustível:"+getTipoCombustivel()+
                "\n ***Dados do Parafuso***"+ getParafuso();
        }


}
