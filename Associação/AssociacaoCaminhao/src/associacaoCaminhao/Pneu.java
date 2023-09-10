package associacaoCaminhao;

    public class Pneu {
    private int diametro;
    private String fabricante;
    private Fornecedor fornecedor;

    public Pneu (int diametro, String fabricante, Fornecedor fornecedor ){
        this.diametro=diametro;
        this.fabricante=fabricante;
        this.fornecedor=fornecedor;
        
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String toString (){
        return  "\n Diâmetro:"+ getDiametro()+
                "\n Fabricante:"+getFabricante()+
                "\n ***Dados do Fornecedor***"+ getFornecedor();
        }   
    
}
