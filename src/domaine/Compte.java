package domaine;

public class Compte {

	private int idCompte;
	private double solde;
	//le compte à un seul propriétaire
	private Personne proprietaire;
	
	public Compte() {
		super();
	}

	public Compte(int idCompte, double solde) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	

	public Personne getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}

	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", solde=" + solde + "]";
	}

}
