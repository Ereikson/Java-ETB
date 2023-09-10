package associacaoEscola;

public class TesteCurso {

	public static void main(String[] args) {
		
		Curso C = new Curso("Java do 0 ao PRO", 2, 480, 
				new Disciplina ("Introdução ao Java", 80, 
					new Professor ("010203","Jonas","Qn 05 Lote 1", 
						new Aluno ("010394","Doroteu", 
							new Origem ("Dorian","Maria", 
								new Cidade ("Brazlândia", 
									new Estado ("Distrito Federal", "DF")))), 
				new Origem ("Sabino","Sabrina", 
					new Cidade ("Taguatinga", 
						new Estado ("Distrito Federal", "DF")))), 
				new Aluno ("043043","Beltrano", 
					new Origem ("Beltrão","Lurdes", 
						new Cidade ("Guará", 
							new Estado ("Distrito Federal", "DF"))))), 
				new Aluno ("727034","Cicrano", 
						new Origem ("Creuson","Carmem", 
								new Cidade ("Brasilinha", 
										new Estado ("Distrito Federak", "DF")))));
		
		System.out.println(C);
		
	}

}
