package domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Personne {
	
	// Attributs
	private int idPersonne;
	private String nom;
	private String prenom;
	private int age;
	private Login login;
	// Une personne peut détenir plusieurs compte(s)/club(s)
	private Collection<Compte> comptes = new ArrayList<Compte>();
	private Collection<Club> clubs = new ArrayList<Club>();
	
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	public Collection<Club> getClubs() {
		return clubs;
	}
	public void setClubs(Collection<Club> clubs) {
		this.clubs = clubs;
	}
	// Constructeurs	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(int idPersonne, String nom, String prenom, int age) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	// Getters & Setters

	public String getNom() {
		return nom;
	}
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
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
		return "Personne [idPersonne=" + idPersonne + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
