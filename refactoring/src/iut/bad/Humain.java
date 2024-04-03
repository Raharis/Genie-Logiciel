package iut.bad;

public class Humain implements Consommation {

	protected String nom;
	protected String prenom;
	protected int age;
	protected Humain ami;

	public Humain() {
		super();
	}
	public void details() {
	    toString();
	}
	@Override
	public void manger() {
	    System.out.println("Je mange");
	}

	@Override
	public void boire() {
	    System.out.println("Je bois");
	}
	public void ami(Humain autre, int duree) {
		this.setAmi(autre);
	    System.out.println(this.nom + " est maintenant ami avec " + autre+" pour une durée "+duree+ " jours");
	}
	public Humain getAmi() {
		return ami;
	}
	public void setAmi(Humain ami) {
		this.ami = ami;
	}
	public String getNom() {
		return nom;
	}
	
	
}