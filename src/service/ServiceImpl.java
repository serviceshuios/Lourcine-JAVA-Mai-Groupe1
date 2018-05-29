package service;

import java.util.Hashtable;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public class ServiceImpl implements Iservice{

	//DECLARER ET INITIALISER LA LISTE DES PERSONNES
	private Map<Integer,Personne> personnes = new Hashtable<Integer,Personne>();
    private Map<Integer,Compte> comptes = new Hashtable<Integer,Compte>();
	
	
	public Map<Integer, Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Map<Integer, Personne> personnes) {
		this.personnes = personnes;
	}
	

	public Map<Integer, Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Map<Integer, Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public Map<Integer,Personne> createPersonne(Personne p) {
		// TODO Auto-generated method stub
		personnes.put(p.getIdPersonne(), p);
		return personnes;
	}

	@Override
	public void readPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listePersonne(Map<Integer,Personne> personnes) {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, Personne> entry : personnes.entrySet()) {
			 System.out.println(entry);
			 if(entry.getValue().getComptes()!=null)
			 {
				 for (Compte compte : entry.getValue().getComptes()) {
					System.out.println(compte);
				}
			 }
		 }
	}

	@Override
	public void affilierClub(Personne p, Club c) {
		// TODO Auto-generated method stub
		p.getClubs().add(c);
		c.getPersonnes().add(p);
	}

	@Override
	public void attribuerCompte(Personne p, Compte c) {
		// TODO Auto-generated method stub
		p.getComptes().add(c);
		//opération inverse pour être synchronysé car pas encore de bdd
		c.setProprietaire(p);
	}

	@Override
	public Map<Integer, Compte> createCompte(Compte c) {
		comptes.put(c.getIdCompte(), c);
		return comptes;
	}

	@Override
	public void readCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listeCompte(Map<Integer, Compte> comptes) {
		for (Map.Entry<Integer, Compte> entry : comptes.entrySet()) {
			 System.out.println(entry);
			 if(entry.getValue().getProprietaire()!=null)
			 {
				 System.out.println("proriétaire="+entry.getValue().getProprietaire());
			 }
		 }
		
	}

	@Override
	public void crediterCompte(Compte c, double mt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debiterCompte(Compte c, double mt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterTitulaire(Compte c, Personne p) {
		       // TODO Auto-generated method stub
				p.getComptes().add(c);
				//opération inverse pour être synchronysé car pas encore de bdd
				c.setProprietaire(p);
	}

	@Override
	public void createClub(Club c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readClub(Club c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClub(Club c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteClub(Club c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listeClub(Club c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterPersonneClub(Personne p, Club c) {
		// TODO Auto-generated method stub
		p.getClubs().add(c);
		c.getPersonnes().add(p);
	}

	@Override
	public void createLogin(Login l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readLogin(Login l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLogin(Login l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLogin(Login l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listeLogin(Login l) {
		// TODO Auto-generated method stub
		
	}

}
