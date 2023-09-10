package HerAssocLivro;

public class TestaLivro {

    public static void main(String[] args) {
       
    Infantil I = new Infantil ("Brincadeiras",
        new Autor("000-123-465.65","Jose Amado"),
        new Editora("Saber infantil","Rua 2 Avenida Jabuti"), "De 5 aos 7 anos");

    Drama D = new Drama ("Crepúsculo",
        new Autor("000-123-222.45","Josefino"),
        new Editora("Dramas Terríveis","Rua 3 Avenida Sol"), "Deveras emocionante");

    Suspense S =  new Suspense("A volta dos que não foram",
    new Autor("000-123-433.66","Stipen Quing"), 
    new Editora("Suspenses Aterradores", "Rua3 Avenida2"), 600);


        System.out.println(I);
        System.out.println(D);
        System.out.println(S);

    }
    
}
