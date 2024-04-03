package iut.bad;

public class Homme extends Humain {
	public Homme(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public String toString() {
		return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
	}
}
