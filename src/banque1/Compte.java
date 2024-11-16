package banque1;


abstract class Compte {
	protected int num;
	protected double solde ;
   protected Personne titulaire ;
	public Compte (int num ,double solde , Personne titulaire) {
		this.num=num;
		this.solde=solde;
		this.titulaire=titulaire;
		
	}
	public Compte (int num  , Personne titulaire) {
		this(num,0,titulaire);
	}
	public int getNum() {
		return num;
		
	}
	public double getSolde() {
		return solde;
		
	}
	public Personne getPersonne() {
		return titulaire;
	}
	public boolean deposerArgent(double montant) {
       if ( montant >0) {
		  solde += montant;
		  return true ;}
       else { 
       	return false;
       }

		
	}
	abstract public boolean retirerArgent(double montant);
}   
