
/**
 * classe qui traite les savoirs-faire 
 * dont l'utilisateur fait appel
 * @author FLAUBERT
 *
 */
public class Patient {
	


	//attributs
 private String nom;
 private String prenom;
 private String quartier;
 private String fonction;
 private int matricule;
// constructeurs
 
/**
 * constructeur par default 
 * de la classe patient
 */
public Patient(){
	 super();
	 
 }
 /**
 * @param nom = nom
 * @param prenom = prenom
 * @param quartier = quartier
 * @param fonction = fonction
 * @param matricule = matricule
 */
public Patient(String nom, String prenom, String quartier, String fonction, int matricule){
	 
	this.nom = nom;
   this.prenom = prenom;
   this.quartier = quartier;
   this.fonction = fonction;
   this.matricule = matricule;
   }
   // getteurs /setteurs
   /**
 * @return nom
 */
public String getNom(){
	   return nom;
	   
   }
   /**
 * @param nom = nom
 */
public void setNom(String nom){
	   this.nom = nom;
	   
   }
   /**
 * @return prenom
 */
public String getPrenom(){
	   return prenom;
   }
   /**
 * @param prenom = prenom
 */
public void setPrenom(String prenom){
	   this.prenom = prenom;
   }
   /**
 * @return quartier
 */
public String getQuartier(){
	   return quartier;
	   
   }
   /**
 * @param quartier = quartier
 */
public void setQuartier(String quartier){
	   this.quartier = quartier;
   }
   /**
 * @return fonction
 */
public String getFonction(){
	   return fonction;
   }
	/**
	 * @param fonction = fonction
	 */
	public void setFonction(String fonction){
	this.fonction = fonction;
	
}
	/**
	 * @return matricule
	 */
	public int getMatricule(){
		return matricule;
		
	}
	/**
	 * @param matricule = matricule
	 */
	public void setMatricule(int matricule){
		this.matricule = matricule;
	}



 

}
