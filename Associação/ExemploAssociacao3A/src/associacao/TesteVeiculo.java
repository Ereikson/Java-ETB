
package associacao;


public class TesteVeiculo {

    
    public static void main(String[] args) {
        // Variaveis de cada Construtor
        Veiculo v = new Veiculo("SGD1A33", "Rosa",// Construtor de veiculo
                new Motor(150.0, "Flex"),// Construtor de Motor 
                new Roda(17, 5),// Construtor de Veiculo
                new Porta("Esquerdo"));// Construtor de Porta 
        
        
        System.out.println(v); // Impressão 
                 
        
       /* Veiculo v = new Veiculo("SGD1A33", "Rosa",// Construtor de veiculo
                new Motor(150.0, "Flex"),// Construtor de Motor 
                new Roda(17, 5),// Construtor de Veiculo
                new Porta("Esquerdo"));// Construtor de Porta 
             
        Esses atributos serão subsituidos aqui, pois aqui no Construtor V ele irá 
        chamar o toString das classes associadas, por isso não tem necessidade de 
        instanciar  la no toString.
        
        É regra aqui na associação, atrribuir as variaveis aqui nos Construtores
        
                      **********ANTES***********
        ex:  new Motor(Double potencia, String tipoCombustivel)
            
                   *********** DEPOIS **********
        new Motor(150.0, "Flex") Tirei o tipo e o nome da variavel, atribuindo informaçoes 
        especifícas para a impressão no resultado final.
        
        **/
         
        
    }
    
}
