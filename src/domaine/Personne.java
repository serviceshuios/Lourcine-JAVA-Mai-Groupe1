package domaine;

public class Personne {
	
	// Attributs
	private int idPerrsonne;
	private String nom;
	private String prenom;
	private int age;
	
	
	// Constructeurs	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(int idPerrsonne, String nom, String prenom, int age) {
		super();
		this.idPerrsonne = idPerrsonne;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	// Getters & Setters
	public int getIdPerrsonne() {
		return idPerrsonne;
	}
	public void setIdPerrsonne(int idPerrsonne) {
		this.idPerrsonne = idPerrsonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// toString
	@Override
	public String toString() {
		return "Personne [idPerrsonne=" + idPerrsonne + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
