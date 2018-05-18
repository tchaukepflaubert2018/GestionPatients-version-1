import java.io.*;
import java.util.Scanner;


/**
*	classe principale de mon application
 * @author FLAUBERT
 *
 */
public class Patient2{ 
	
public static void main(String args[]){
	
   System.out.println ("Bienvenu dans mon application de gestion des patients dans les hopitaux clinic et centre de santé");
   char reponse; // declaration d'une variable de type character
   Patient p1 = new Patient(); // instanciation 
   Scanner scc = new Scanner(System.in); // instanciation d'un objet de type Scanner 
   Scanner sci = new Scanner(System.in); //instanciation d'un objet de type Scanner 
   
   System.out.println ("Voulez-vous enregistré un patient ? (O/N)");
    reponse = scc.nextLine().charAt(0);
    if(reponse== 'O') {
	while(reponse == 'O'){
	
	  System.out.println("Donnez un nom : ");//On affiche une instruction
	  //On récupère le nom saisi
	 p1.setNom(scc.nextLine());
	 // on affiche une instruction
	 System.out.println("Donnez un prenom : ");
	 //on recupère le prenom saisi
	 p1.setPrenom(scc.nextLine());
	 // on affiche une instruction
	 System.out.println("Donnez le quartier: ");
	 // on recupère le quartier saisi
	 p1.setQuartier(scc.nextLine());
	 //on affiche une instruction
	 System.out.println("Donnez la fonction: ");
	 //on recupère la fonction saisi
	 p1.setFonction(scc.nextLine());
	 //on affiche une instruction
	 System.out.println("Donnez le matricule: ");
	 // on recupère le matricule saisi
	 p1.setMatricule(sci.nextInt());
	  System.out.println ("Voulez-vous corriger les informatn ? (O/N)");
    reponse = scc.nextLine().charAt(0);
	}
	// instruction d'affichage
	/* System.out.println("Nom :"+ " " +p1.getNom());
	 System.out.println("Prenom :"+" " +p1.getPrenom());
	 System.out.println("Quartier :"+" " +p1.getQuartier());
	 System.out.println("Fonction :"+" " +p1.getFonction());
	 System.out.println("Matricule :"+" " +p1.getMatricule());*/
	 // instruction d'affichage
	// System.out.println(" le patient est bien enregistre");
	  // instruction d'affichage
	 System.out.println( "le patient"+" " +p1.getNom()+" "+p1.getPrenom()+" "+"resident a:"+" "+p1.getQuartier()+" "+"avec pour fonction:"+" "+p1.getFonction()+" "+"ayant le matricule:"+" "+p1.getMatricule()+" "+ "est bien enregistre");
    }
	 else {
   
	   System.out.println("A bientot pour le prochain enregistrement");
	 }
}
}

	 
	 
   
    
   
   
   
   
  
   
   
 



