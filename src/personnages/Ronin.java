package personnages;

public class Ronin extends Humain {
    private int honneur = 1;

    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
    }

    public void donner(Commercant beneficiaire) {
        int don = getArgent() / 10;
        perdreArgent(don);
        beneficiaire.recevoir(don);
        parler("Marco prend ces " + don + " sous.");
    }

    public void provoquer(Yakuza adversaire) {
        int force = honneur * 2;
        if (force >= adversaire.reputation) {
            int argentGagne = adversaire.perdre();
            gagnerArgent(argentGagne);
            honneur++;
            parler("Je t’ai eu petit yakusa!");
        } else {
            perdreArgent(getArgent());
            honneur--;
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
            adversaire.gagner(getArgent());
        }
    }
}
