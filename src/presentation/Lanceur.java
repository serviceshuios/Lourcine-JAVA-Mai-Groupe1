package presentation;

import java.util.Hashtable;
import java.util.Map;

import domaine.Compte;
import domaine.CompteEpargne;
import domaine.ComptePayant;
import domaine.CompteSimple;
import domaine.Personne;
import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iservice service = new ServiceImpl();
		Map<Integer,Personne> resultats = new Hashtable<Integer,Personne>();		
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
			service.listePersonne(resultats);	
		System.out.println("AJOUT D'UNE PERSONNE");
			Personne p = new Personne(1,"ZEC","UNION",20);
			Personne p2 = new Personne(2,"ZEC2","UNION2",22);
			//Personne p3 = new Personne(3,"ZEC3","UNION3",23);
			resultats=service.createPersonne(p);
			//resultats=service.createPersonne(p3);
		System.out.println("AFFICHAGE MAP APRES AJOUT");
			service.listePersonne(resultats);
			
			
		Map<Integer,Compte> resultatsC = new Hashtable<Integer,Compte>();		
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
			service.listeCompte(resultatsC);	
		System.out.println("AJOUT D'UN COMPTE");
			Compte c = new CompteEpargne(1, 5000.00, 0.04);
			Compte c2 = new CompteSimple(2,8000.00, 1000.00);
			Compte c3 = new ComptePayant(3,12000.00, 0.02);
			resultatsC=service.createCompte(c);
			resultatsC=service.createCompte(c2);
			resultatsC=service.createCompte(c3);
		System.out.println("AFFICHAGE MAP APRES AJOUT");
			service.listeCompte(resultatsC);	
			
			//ASSOCIER UNE COMPTE A UNE PERSONNE
			service.ajouterTitulaire(c, p2);
			service.ajouterTitulaire(c2, p2);
			//ajouter la personne � la liste des Comptes
			resultats=service.createPersonne(p2);
			System.out.println("AFFICHAGE MAP APRES AJOUT PERSONNE AYANT UN COMPTE");
			service.listePersonne(resultats);
			service.listeCompte(resultatsC);
	}

}
