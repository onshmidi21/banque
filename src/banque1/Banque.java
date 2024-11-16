package banque1;

public class Banque {
	private String nom;
    private Compte comptes [] = new Compte[100] ;
	private int n=0;
	public Banque(String nom){
	    this.nom = nom ;
	}
	public void ouvrirCompte(Compte compte){
	    comptes[n]=compte;
	    n++;
	}
	public Compte rechercherCompte(int numero){
	    for(int i=0;i<n; i++){
	        if( comptes[i].getNum()== numero){
	            return comptes[i];
	        }
	    }
	    return null ;
	}
	public boolean fermerCompte(int numero) {
	    for (int i = 0; i < n; i++) {
	        if (comptes[i].getNum() == numero) {
	            comptes[i] = comptes[n - 1]; // le dernier compte prend la place du compte fermé
	            comptes[n - 1] = null;
	            n--;
	            return true ;
	        }
	    }
	    return false;
	}
	
	public boolean deposerArgent(int numeroCompte, double montant) {
	    Compte compte = rechercherCompte(numeroCompte);
	    if (compte != null) {
	        compte.deposerArgent(montant);
	        return true; // Dépôt réussi
	    } else {
	        return false; // Dépôt échoué
	    }
	}
	
	public boolean retirerArgent(int numeroCompte, double montant) {
	    Compte compte = rechercherCompte(numeroCompte);
	    if (compte != null) {
	        compte.retirerArgent(montant);
	           return true;
	    } else {
	
	        return false;        }
	
	}
	public String getNom() {
		return nom;
	}
	public int getN() {
		return n ;
	}
	 public Compte[] getComptes() {
	        return comptes;
	    }
	}
	
	
