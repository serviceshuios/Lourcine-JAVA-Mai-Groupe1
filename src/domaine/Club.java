package domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Club {
	
	private int idClub;
	private String nomClub;
	// Plusieurs personnes peuvent appartenir au Club
	private Collection<Personne> personnes = new ArrayList<Personne>();
	
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
	
	public Collection<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Collection<Personne> personnes) {
		this.personnes = personnes;
	}

	// toString
	@Override
	public String toString() {
		return "Club [idClub=" + idClub + ", nomClub=" + nomClub + "]";
	}
	
	

}
