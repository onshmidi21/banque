package banque1;
public class App {
    public static void main(String[] args) throws Exception {
        //tester le constructeur de Personne
        System.out.println("-----------constructeur Personne-----------------------------");
        Personne p=new Personne(123,"ons","abc");
        afficherPersonne(p);
        System.out.println("------------mutateur nom---------------------------");
        //tester le mutateur du nom
        p.setNom("hmd");
        afficherPersonne(p);
        System.out.println("--------------constructeur compte courant------------------------"); 
        Compte compteCourant=new CompteCourant (210202, p);
        afficherCompte( compteCourant);
        System.out.println("--------------constructeur compte epargne------------------------"); 
        Personne p1=new Personne(132,"ons","hmidi",21);
        afficherPersonne(p1);
        Compte compteEpargne=new CompteEpargne (121212,10.0, p1);
        afficherCompte( compteEpargne);
        //tester les methodes de compte courant 
        // Effectuer un dépôt
        System.out.println("------------ tester deposer  dans un compte courant  ---------------------------");
        double montantDepot=100;
        double montantRetrait =10;
        if (compteCourant.deposerArgent( montantDepot)){
     	   System.out.println("montant "+montantDepot +"deposé avec succes");
        }
        else 
     	   System.out.println("montant "+montantDepot +"n'est  pas deposé   ");
        System.out.println("------------ tester  retirer dans un compte d epargne  ---------------------------");

         if(compteCourant.retirerArgent( montantRetrait )){
      	   System.out.println("montant "+montantRetrait +"retiré avec succes");

         	
         }
         else 
  	        System.out.println("montant "+montantRetrait +"n'est pas retiré");
       //tester les methodes de compte epargne 
         // Effectuer un dépôt
         System.out.println("------------ tester deposer  dans un compte courant  ---------------------------");
         
         if (compteEpargne.deposerArgent( montantDepot)){
      	   System.out.println("montant "+montantDepot +"deposé avec succes");
         }
         else 
      	   System.out.println("montant "+montantDepot +"n'est  pas deposé   ");
         System.out.println("------------ tester  retirer dans un compte d epargne  ---------------------------");

          if(compteEpargne.retirerArgent( montantRetrait )){
       	   System.out.println("montant "+montantRetrait +"retiré avec succes");

          	
          }
          else 
   	        System.out.println("montant "+montantRetrait +"n'est pas retiré");
        

        
        
        //tester les methodes de banque 
        System.out.println("------------banque ---------------------------");
        Banque banque=new Banque ("banqueCalsse");
        afficherBanque(banque);
        System.out.println("------------ouvrir de 2 comptes ---------------------------");
        banque.ouvrirCompte( compteEpargne);
        banque.ouvrirCompte( compteCourant);
        afficherCompteBanque(banque);
      

        
        System.out.println("------------fermeture de compte c  independant de type ---------------------------");
        
        boolean compteFerme = banque.fermerCompte(210202);
        if (compteFerme) {
        	System. out .println("compte est Fermé");
        }
        else 
        	System. out .println("compte n'existe pas");
        	
        System.out.println("------------fermeture de compte qui n'existe pas  ---------------------------");
        if (banque.fermerCompte(213202)) {
        	System. out .println("compte est fermé");
        

        }
        else 
        	System. out .println("compte n'existe pas");

        
        System.out.println("------------ tester deposer de la banque  dans un compte d epargne  ---------------------------");
        int numero=121212;
       if (banque.deposerArgent( numero,  montantDepot)){
    	   System.out.println("montant "+montantDepot +"deposé avec succes");
    	   System.out.println("le nouveau solde est " + banque.rechercherCompte(numero).getSolde());
       }
       else 
    	   System.out.println("montant "+montantDepot +"n'est  pas deposé   ");
       System.out.println("------------ tester  retirer dans un compte d epargne  ---------------------------");

        if(banque.retirerArgent( numero,montantRetrait )){
     	   System.out.println("montant "+montantRetrait +"retiré avec succes");
    	   System.out.println("le nouveau solde est " + banque.rechercherCompte(numero).getSolde());

        	
        }
        else 
 	        System.out.println("montant "+montantRetrait +"n'est pas retiré");

        System.out.println("------------ tester deposer et retirer dans dans compte qui n'existe pas------------------------");
        int numero2=1212;
        
        if (banque.deposerArgent( numero2,  montantDepot)){
     	   System.out.println("montant "+montantDepot +"deposé avec succes");
        }
        else 
     	   System.out.println("montant "+montantDepot +"n'est  pas deposé   ");
        System.out.println("------------ tester  retirer dans un compte d epargne  ---------------------------");

         if(banque.retirerArgent( numero2,montantRetrait )){
      	   System.out.println("montant "+montantRetrait +"retiré avec succes");

         	
         }
         else 
  	        System.out.println("montant "+montantRetrait +"n'est pas retiré");



        
        
    }

    private static void afficherPersonne(Personne p) {
        System.out.println("nom : "+p.getNom());
        System.out.println("prenom : "+p.getPrenom());
        System.out.println("cin : "+p.getCin());
        System.out.println("age : "+p.getAge());
    }
    private static void afficherCompte(Compte compte1) {
    	System.out.println("num : "+compte1.getNum());
        System.out.println("solde : "+compte1.getSolde());
        System.out.println("titulaire : ");
        afficherPersonne(compte1.getPersonne());

    }
    private static void afficherBanque(Banque b) {
        System.out.println("nom : "+b.getNom());
    }
    private static void afficherCompteBanque(Banque b){
    	int i=0 ;
    	
    	for ( i =0 ; i <( b.getN()) ; i++) {
            System.out.println("le compte n"+i+ "est : " );

    		afficherCompte (b.getComptes()[i]) ;
    		
    	}
    		
    }
}