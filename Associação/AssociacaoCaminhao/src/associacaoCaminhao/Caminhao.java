package associacaoCaminhao;

    public class Caminhao {
    private String modelo;
    private String fabricante;
    private Fornecedor fornecedor;
    private Parafuso parafuso;
    private Pneu pneu;
    private Roda roda;
    private Motor motor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Parafuso getParafuso() {
        return parafuso;
    }

    public void setParafuso(Parafuso parafuso) {
        this.parafuso = parafuso;
    }

    public Pneu getPneu() {
        return pneu;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public Caminhao (String modelo, String fabricante, Fornecedor fornecedor, Parafuso parafuso, 
    Pneu pneu, Roda roda, Motor motor ){
        this.modelo=modelo;
        this.fabricante=fabricante;
        this.fornecedor=fornecedor;
        this.parafuso=parafuso;
        this.pneu=pneu;
        this.roda=roda;
        this.motor=motor;

    }

    public String toString(){
       return   "\n******** Dados do Caminhao********"+
                "\n Modelo:"+getModelo()+
                "\n Fabricante:"+ getFabricante()+
                "\n ****** Dados do Fornecedor*****"+getFornecedor()+
                "\n ****** Dados do Parafuso*****:"+ getParafuso()+
                "\n ****** Dados do Pneu*******"+ getPneu()+
                "\n *******Dados da Roda*******"+ getRoda()+
                "\n *******Dados do Motor*******"+ getMotor();
         
    }

}
