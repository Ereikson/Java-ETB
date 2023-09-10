package associacaoFuncionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario F = new Funcionario (234567,"Jose", 
				new Cargo("Gerente", 
						new Atribuicao("Fiscaliza vendedores"), 
						new Gratificacao (200.0, 1, "quando bater meta do setor")), 
				new Salario (2000.0), 
				new Endereco ("Qn 05", 3, 
						new Cep (71805124)), 
				new Dependente (3), 
				new Formacao ("Superior em Administração", 
						new InstituicaoEnsino ("Universidade Estácio", 
								new Endereco ("Rua das Palmeiras", 06, 
										new Cep (7100078)))));
		System.out.println(F);

	}

}
