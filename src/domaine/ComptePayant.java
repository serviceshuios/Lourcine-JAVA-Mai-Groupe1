package domaine;

public class ComptePayant extends Compte {
	
	private double taux;

	public ComptePayant() {
		// TODO Auto-generated constructor stub
	}

	public ComptePayant(int idCompte, double solde, double taux) {
		super(idCompte, solde);
		this.taux = taux;
	}
	
	//GETTER AND SETTER

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "ComptePayant [ idCompte = "+ super.getIdCompte() + " ; soldeCompte = " + super.getSolde() + " ; tauxComission=" + taux*100 + "%]";
	}
	

}
