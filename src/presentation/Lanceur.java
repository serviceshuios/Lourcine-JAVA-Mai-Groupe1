package presentation;

import java.util.Hashtable;
import java.util.Map;

import domaine.Compte;
import domaine.CompteEpargne;
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
			resultats=service.createPersonne(p);
			resultats=service.createPersonne(p2);
		System.out.println("AFFICHAGE MAP APRES AJOUT");
			service.listePersonne(resultats);
			
			
		Map<Integer,Compte> resultatsC = new Hashtable<Integer,Compte>();		
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
			service.listeCompte(resultatsC);	
		System.out.println("AJOUT D'UN COMPTE");
			Compte c = new CompteEpargne(1, 5000.00, 0.04);
			Compte c2 = new CompteEpargne(2,8000.00,0.05);
			resultatsC=service.createCompte(c);
			resultatsC=service.createCompte(c2);
		System.out.println("AFFICHAGE MAP APRES AJOUT");
			service.listeCompte(resultatsC);	
	}

}
