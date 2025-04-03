package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public Humain(String n,String boisson,int arg) {
		this.nom=n;
		this.boissonFav=boisson;
		this.argent=arg;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle "+ getNom() + " et j’aime boire du "+ this.boissonFav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ this.boissonFav + " ! GLOUPS !");
	}

	protected void gagnerArgent(int gain) {
		this.argent+=gain;
	}
	

	protected void perdreArgent(int perte) {
		this.argent-=perte;
	}
	
	protected void parler(String texte) {
		System.out.println(String.format("(%s) - %s", getNom(),texte));
	}
	
	public void acheter(String bien, int prix) {
		if (prix <=getArgent()) {
			parler(String.format("J'ai %d sous en poche. Je vais pouvoir m'offrir %s à %d sous", this.argent,bien,prix));
			perdreArgent(prix);
		}
		else {
			parler(String.format("Je n'ai plus que %d sous en poche. Je ne peux même pas m'offrir %s à %d sous", this.argent,bien,prix));
		}
	}
}
