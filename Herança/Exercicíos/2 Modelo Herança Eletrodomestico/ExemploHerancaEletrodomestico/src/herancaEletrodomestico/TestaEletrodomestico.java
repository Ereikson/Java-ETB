package herancaEletrodomestico;
public class TestaEletrodomestico {
public static void main(String[] args) {

        Televisao T = new Televisao(123, 30, "Televisão LG", "LG 3000", 56,"Led");
        System.out.println(T);
        
        MaquinaLavar Mq = new MaquinaLavar (1234, 35, "Máquina Electrolux", 
        "Lava e seca Electrolux", "Lava e seca", "Titanium");
        System.out.println(Mq);

        Domestico D = new Domestico (12345, 20, "Itatiaia", "Fogao de piso itatiaia",
         4, 2, "Elétrico");
        System.out.println(D);

        Industrial I = new Industrial (12365, 37, "Itatiaia", "Fogao profissional itatiaia",
         4, 2, 1.5);
        System.out.println(I);

    }
    
}
