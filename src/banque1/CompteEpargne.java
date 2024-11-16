package banque1;
class CompteEpargne extends Compte {

	public CompteEpargne(int num, double solde, Personne titulaire) {
		super(num, solde, titulaire);
	}
	public boolean retirerArgent(double montant){

		if (solde > montant && montant >0 ) {
			solde -= montant ;
			return true;
			
		}
		else {
			return false;
		}
   }
	
}
	