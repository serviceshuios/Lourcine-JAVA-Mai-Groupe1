package domaine;

public class CompteEpargne extends Compte {

	private double pourcentage;
	
	//CONSTRUCTOR
	
	public CompteEpargne() {
		
	}

	public CompteEpargne(int idCompte, double solde, double pourcentage) {
		super(idCompte, solde);
		this.pourcentage = pourcentage;
	}
	
	//GETTER AND SETTER

	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

	
	
	
}
