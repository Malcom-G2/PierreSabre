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
    
    public void provoquer(Yakuza adversaire) {
        int forceRonin = 2 * this.honneur; // La force du Ronin est 2 fois son honneur
        if (forceRonin >= adversaire.getReputation()) {
            gagner(adversaire);
        } else {
            perdre(adversaire);
        }
    }

    private void gagner(Yakuza adversaire) {
        this.gagnerArgent(adversaire.getArgent());
        this.honneur++;
        adversaire.perdre();
        parler("Je t’ai eu petit yakuza!");
    }

    private void perdre(Yakuza adversaire) {
        this.perdreArgent(this.getArgent());
        this.honneur--;
        adversaire.gagner(this.getArgent());
        parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
    }
}
