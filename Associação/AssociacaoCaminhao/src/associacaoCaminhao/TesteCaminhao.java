package associacaoCaminhao;

    public class TesteCaminhao {
    public static void main(String[] args) {
        
            Caminhao C = new Caminhao("Caminhão de carga", "Mercedes", 
            new Fornecedor("000000-0001.69","Forn LTDA"), 
            new Parafuso ("3pol","aço",
                new Fornecedor ("000000-0002.68","Forn LTDA 2 ")), 
            new Pneu (5,"Pireli",
                new Fornecedor("0000000-0003.67","Forn LTDA 3")), 
            new Roda (19,"pireli","cinza",
                new Parafuso("4pol","aço",
                    new Fornecedor("0000000-0001.69","Forn LTDA 4"))), 
            new Motor (300,150,"diesel",
                new Parafuso("4pol","aço",
                    new Fornecedor("000000-0003.54","Forn LTDA 5"))));
       
        System.out.println(C);
        
    }
    
}
