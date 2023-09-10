package associacaoPetShop;

public class TestaPetShop {

	public static void main(String[] args) {
		
		Venda V = new Venda (50.0, 1, 
				new Servico ("Banho e tosa", 1, 
						new Animal ("Boris", "gato", "vira-lata", 5, 
								new Cliente ("Paloma", "(61)9999-9999", 
										new Endereco ("71000-34")))), 
				new Funcionario (3346, "banhador", "cicrano"), 
				new Produto ("Shampoo de banho", 1, 
						new Fornecedor ("Petz LTDA", "EPNB")));

		System.out.println(V);
		
	}

}
