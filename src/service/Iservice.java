package service;

import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public interface Iservice {
	
	//PERSONNE
	
	public Map<Integer,Personne> createPersonne(Personne p);
	public void readPersonne(Personne p);
	public void updatePersonne(Personne p);
	public void deletePersonne(Personne p);
	public void listePersonne(Map<Integer,Personne> personnes);
	public void affilierClub(Personne p, Club c);
	public void attribuerCompte(Personne p,Compte c);
	
	//COMPTE
	
	public void createCompte(Compte c);
	public void readCompte(Compte c);
	public void updateCompte(Compte c);
	public void deleteCompte(Compte c);
	public void listeCompte(Compte c);
	public void crediterCompte(Compte c, double mt);
	public void debiterCompte(Compte c, double mt);
	public void ajouterTitulaire(Compte c, Personne p);
	
	//CLUB
	
	public void createClub(Club c);
	public void readClub(Club c);
	public void updateClub(Club c);
	public void deleteClub(Club c);
	public void listeClub(Club c);
	public void ajouterPersonneClub(Personne p, Club c);
	
	// LOGIN
	
	public void createLogin(Login l);
	public void readLogin(Login l);
	public void updateLogin(Login l);
	public void deleteLogin(Login l);
	public void listeLogin(Login l);
	

	

}
