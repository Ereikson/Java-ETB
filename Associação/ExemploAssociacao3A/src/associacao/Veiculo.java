 
package associacao;
 


public class Veiculo {
    private  String cor, placa;
    private Motor motor;
    private Roda roda;
    private Porta porta ;

   
    public Veiculo(String placa, String cor, Motor motor,Roda roda, Porta porta){
      this.cor= cor;
      this.motor= motor;
      this.placa=placa;
      this.porta=porta;
      this.roda=roda;    
        
    }
   
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }
     
    public String toString(){
       return"\n******** Dados do Veiculo********"+
              "\n Placa:"+getPlaca()+
              "\n Cor:"+ getCor()+
               "\n ****** Dados do Motor*****:"+ getMotor()+
               "\n ****** Dados da Roda*******"+ getRoda()+
               "\n *******Dados da Porta*******"+ getPorta();
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
