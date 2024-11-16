package banque1;

class Personne {
	private String nom ;
	private String prenom ;
	private int age ;
	private int cin ;
    public Personne () {
    	cin= -1 ;
    	age = -1 ;
    	nom="anonyme";
    	prenom="anonyme";
    	//constructeur par defaut necessaire car lorsque on definit un constructeur avec parametre le constructeur par defaut ne sea pas disponible 
    	
    }
    public Personne (int cin , String nom , String prenom , int age ) {
    	this.cin =cin ;
    	this.age=age;
    	this.nom=nom;
    	this.prenom=prenom;
    	//un constucteur qui definit tous les attributs 
    }
    public Personne (int cin , String nom , String prenom ) {
    	this(cin,nom,prenom,-1); //appeler le constructeur avec tous les parametre dans ce constructeur 
    	
    }
	public String getNom () {
		return nom;
		
	}
	public void setNom(String nom) {
		this.nom=nom;
		
	}
	public String getPrenom () {
		return prenom;
		
	}
	public void setPrenom(String prenom) {
		this.prenom=prenom;
		
	}
	public int getCin() {
		return cin ;
	}
	public int getAge(){
        return age ;
    }
}