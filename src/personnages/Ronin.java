package personnages;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom) {
        super(nom, "shochu", 60);
        this.honneur = 1;
    }

    public void donner(Commercant beneficiaire) {
        int don = (int) (this.getArgent() * 0.10);
        this.perdreArgent(don);
        beneficiaire.recevoir(don);
        parler(this.getNom() + " prend ces " + don + " sous.");
    }
}
