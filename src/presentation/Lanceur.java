package presentation;

import java.util.Hashtable;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.CompteEpargne;
import domaine.ComptePayant;
import domaine.CompteSimple;
import domaine.Login;
import domaine.Personne;
import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IMPLEMENTATION DE L'INTERFACE SERVICE		
		Iservice service = new ServiceImpl();
		
		
		//-------------PERSONNE-------------
		System.out.println("-------------PERSONNE-------------");
		
		Map<Integer, Personne> resultats = new Hashtable<Integer, Personne>();
		
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
		service.listePersonne(resultats);
		System.out.println("AJOUT D'UNE PERSONNE");
		Personne p = new Personne(1, "ZEC", "UNION", 20);
		Personne p2 = new Personne(2, "ZEC2", "UNION2", 22);
		
		resultats = service.createPersonne(p);
		resultats = service.createPersonne(p2);
		
		System.out.println("AFFICHAGE MAP APRES AJOUT");
		service.listePersonne(resultats);
		
		
		//-------------COMPTE-------------
		System.out.println("-------------COMPTE-------------");
		
		Map<Integer, Compte> resultatsC = new Hashtable<Integer, Compte>();
		
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
		service.listeCompte(resultatsC);
		System.out.println("AJOUT D'UN COMPTE");
		Compte c = new CompteEpargne(1, 5000.00, 0.04);
		Compte c2 = new CompteSimple(2, 8000.00, 1000.00);
		Compte c3 = new ComptePayant(3, 12000.00, 0.02);
		resultatsC = service.createCompte(c);
		resultatsC = service.createCompte(c2);
		resultatsC = service.createCompte(c3);
		System.out.println("AFFICHAGE MAP APRES AJOUT");
		service.listeCompte(resultatsC);

		// ASSOCIER UN COMPTE A UNE PERSONNE
		service.ajouterTitulaire(c, p2);
		service.ajouterTitulaire(c2, p2);

		// TEST AFFICHAGE COMPTE APRES AJOUT PROPRIETAIRE
		resultats = service.createPersonne(p2);
		System.out.println("AFFICHAGE MAP APRES AJOUT PERSONNE AYANT UN COMPTE");
		service.listePersonne(resultats);
		service.listeCompte(resultatsC);
		
		
		//-------------LOGINS-------------
		System.out.println("-------------LOGIN-------------");
		
		// creation d'une collection pour stocker nos logins (BDD simu)
		Map<Integer, Login> resultatsL = new Hashtable<Integer, Login>();

		// Création + affichage login
		Login l = new Login(1, "lolo", "pepe");
		Login l1 = new Login(2, "dede", "yaya");
		service.createLogin(l);
		service.createLogin(l1);

		// ajout des logins à la collection
		resultatsL = service.createLogin(l);
		resultatsL = service.createLogin(l1);

		// affichage de la collection logins
		System.out.println("AFFICHAGE MAP APRES AJOUT login");
		service.listeLogin(resultatsL);
		
		//-------------CLUB-------------
		System.out.println("-------------CLUB-------------");
		
		// creation d'une collection pour stocker nos logins (BDD simu)
		Map<Integer, Club> resultatsCl = new Hashtable<Integer, Club>();

		// Création + affichage login
		Club cl1 = new Club(1,"Paris Club");
		Club cl2 = new Club(2, "Marseille Club");
		service.createClub(cl1);
		service.createClub(cl2);

		// ajout des Clubs à la collection
		resultatsCl = service.createClub(cl1);
		resultatsCl = service.createClub(cl2);
		
		//ajouter des membres au club
		service.ajouterPersonneClub(p2, cl1);
		service.ajouterPersonneClub(p, cl2);
		

		// affichage de la collection Clubs
		System.out.println("AFFICHAGE MAP APRES AJOUT Club");
		service.listeClub(resultatsCl);

	}

}
