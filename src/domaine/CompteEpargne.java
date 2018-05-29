package domaine;

/**
 * La classe CompteEpargne herite de la classe Compte en y ajoutant
 * 
 * @author Adminl
 *
 */

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

		@Override
	public String toString() {
		return "CompteEpargne [ idCompte = "+ super.getIdCompte() + " ; soldeCompte = " + super.getSolde() +" ; pourcentage = " + pourcentage*100 + "%]";
	}
	
	
}
