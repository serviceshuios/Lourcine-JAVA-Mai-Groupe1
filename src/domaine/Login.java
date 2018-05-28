package domaine;

public class Login {
	
	// Attributs
	private int idLogin;
	private String pseudo;
	private String mdp;
	// Le compte est attribué à une personne
	private Personne personne;
	
	// Constructeurs
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(int idLogin, String pseudo, String mdp) {
		super();
		this.idLogin = idLogin;
		this.pseudo = pseudo;
		this.mdp = mdp;
	}
	// Getters & Setters
	public int getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	// toString
	@Override
	public String toString() {
		return "Login [idLogin=" + idLogin + ", pseudo=" + pseudo + ", mdp=" + mdp + "]";
	}
	
	

}
