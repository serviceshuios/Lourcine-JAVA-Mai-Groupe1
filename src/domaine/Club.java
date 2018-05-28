package domaine;

public class Club {
	
	private int idClub;
	private String nomClub;
	
	// Constructeurs
	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Club(int idClub, String nomClub) {
		super();
		this.idClub = idClub;
		this.nomClub = nomClub;
	}

	//Getters & Setters
	public int getIdClub() {
		return idClub;
	}
	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}
	public String getNomClub() {
		return nomClub;
	}
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	
	// toString
	@Override
	public String toString() {
		return "Club [idClub=" + idClub + ", nomClub=" + nomClub + "]";
	}
	
	

}
