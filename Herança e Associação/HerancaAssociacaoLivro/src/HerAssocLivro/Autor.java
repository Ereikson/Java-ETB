package HerAssocLivro;

    public class Autor {
    private String cpf;
    private String nome;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor(String cpf, String nome){
        this.cpf=cpf;
        this.nome=nome;
    }

    public String toString (){
      return "\n Cpf:"+ getCpf()+
             "\n Nome:"+getNome();
    }

}
