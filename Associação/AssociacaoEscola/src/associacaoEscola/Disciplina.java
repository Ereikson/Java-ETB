package associacaoEscola;

	public class Disciplina {
		private String nome;
		private int cargaHoraria;
		private Professor professor;
		private Aluno aluno;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
	public Disciplina(String nome, int cargaHoraria, Professor professor, Aluno aluno) {
		this.nome=nome;
		this.cargaHoraria=cargaHoraria;
		this.professor=professor;
		this.aluno=aluno;
		}
	
	public String toString() {
		return 	"\n Nome:"+getNome()+
				"\n Carga Horária:"+getCargaHoraria()+
				"\n *Dados do Professor*"+getProfessor()+
				"\n *Dados do Aluno*"+getAluno();
	}

}
