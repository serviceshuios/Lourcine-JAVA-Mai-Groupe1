package domaine;

public class CompteSimple extends Compte {

	private double decouvert;
	
	public CompteSimple() {
		// TODO Auto-generated constructor stub
	}

	public CompteSimple(int idCompte, double solde, double decouvert) {
		super(idCompte, solde);
		this.decouvert = decouvert;
	}
	
	public CompteSimple(double decouvert) {
		super();
		this.decouvert = decouvert;
	}

	//GETTER AND SETTER

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteSimple [ idCompte = "+ super.getIdCompte() + " ; soldeCompte = " + super.getSolde() +" ; decouvert = " + decouvert + "]";
	}
	
	

}
