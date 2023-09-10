package herancaItemBiblioteca;

public class TestaItemBiblioteca {

	public static void main(String[] args) {
		
		LivroDidatico LD = new LivroDidatico("Matemática Básica", "MEC", 2018, "Português", "Matemática");
		System.out.println(LD);
		
		Crepusculo C = new Crepusculo("Crepúsculo:Amanhecer", "Stephenie Meyer", 1990, "Inglês", "Vampiro que brilha", "Dura", "Especial");		
		System.out.println(C);
		
		CdInfantil CDI = new CdInfantil("Galinha Pintadinha", "Turma do Pagode", 1960, "40 minutos", "Músicas infantis", 6);
		System.out.println(CDI);
		
		Audiobook A = new Audiobook("Bíblia em áudio", "Pedro", 1999, "6 horas", "Cid moreira");
		System.out.println(A);
	}

}
