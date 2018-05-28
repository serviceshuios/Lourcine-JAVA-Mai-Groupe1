package service;

import domaine.Club;
import domaine.Compte;
import domaine.Personne;

public interface Iservice {
	
	//PERSONNE
	
	public void createPersonne(Personne p);
	public void readPersonne(Personne p);
	public void updatePersonne(Personne p);
	public void deletePersonne(Personne p);
	public void listePersonne(Personne p);
	
	//COMPTE
	
	public void createCompte(Compte c);
	public void readCompte(Compte c);
	public void updateCompte(Compte c);
	public void deleteCompte(Compte c);
	public void listeCompte(Compte c);
	
	//CLUB
	
	public void createClub(Club c);
	public void readClub(Club c);
	public void updateClub(Club c);
	public void deleteClub(Club c);
	public void listeClub(Club c);

	

}
