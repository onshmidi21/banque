package banque1;

class CompteCourant extends Compte{
	public CompteCourant (int num ,double solde , Personne titulaire) {
		super(num,solde,titulaire);
	}
	
    public CompteCourant(int num ,Personne titulaire) {
    	this(num,0,titulaire);
    	
    }
    public boolean retirerArgent(double montant){

		if (solde > montant && montant >0 ) {
			solde = solde - montant -1;
			return true;
			
		}
		else {
			return false;
		}
    }
}
