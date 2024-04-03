package iut.bad;

public class Femme extends Humain {
	public Femme(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public String toString() {
		return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	}
	public static void main(String[] args) {
        Femme femme = new Femme("Kanto", "Sharon", 30);
        Homme homme = new Homme("Fred", "Ced", 35);
        femme.ami(homme, 100);
    }

	
}
