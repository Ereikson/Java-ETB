package herancaPessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Fornecedor F = new Fornecedor ("Forn LTDA", "Setor de Indústrias", "0000.0000.0001-67","Brasil");
		System.out.println(F);
		
		Vendedor V = new Vendedor ("Jose", "Qn 01 Lote 05", 010012, 2000.0, "Móveis", 200.0, 20.000);
		System.out.println(V);
		
		Diretor D = new Diretor ("Ananias", "Qi 03 Lago Sul", 010001, 15000.0, 1.500);
		System.out.println(D);
		
		PessoaFisica PF = new PessoaFisica ("Godofredo", "Rua 12 Quadra 45", 36, "004.334.533-76");
		System.out.println(PF);
		
		PessoaJuridica PJ = new PessoaJuridica ("Moveis do Cicrano", "Comercial Taguatinga", 10, "0000.2300.0001-34");
		System.out.println(PJ);
		

	}

}
