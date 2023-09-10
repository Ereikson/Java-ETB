package herancaVeiculo;
public class TestaVeiculo {
    public static void main(String[] args) {

        Pesado P = new Pesado(1010, 2023, "Bi-Trem Turbo", 2000);
        System.out.println(P);

        Gol G = new Gol(1030, 2023, 4, "Gol", 5000, 5);
        System.out.println(G);
    }
    
}