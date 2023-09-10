package associacaoCaminhao;

    public class Parafuso {
        private String tamanho;
        private String tipoMaterial;
        private Fornecedor fornecedor;
  
    

    public Parafuso (String tamanho, String tipoMaterial, Fornecedor fornecedor ){
        this.tamanho=tamanho;
        this.tipoMaterial=tipoMaterial;
        this.fornecedor=fornecedor;
        
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String toString (){
        return  "\n Tamanho:"+ getTamanho()+
                "\n Tipo de Material:"+getTipoMaterial()+
                "\n ***Dados do Fornecedor***"+ getFornecedor();
        }

}

