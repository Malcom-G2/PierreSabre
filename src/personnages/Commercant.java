package personnages;

public class Commercant extends Humain {

    public Commercant(String nom) {
        super(nom, "thé", 20);
    }

    public int seFaireExtorquer() {
        int argentPerdu = this.getArgent();
        this.perdreArgent(argentPerdu);
        parler("J’ai tout perdu! Le monde est trop injuste...");
        return argentPerdu;
    }

    public void recevoir(int argent) {
        this.gagnerArgent(argent);
        parler(argent + " sous ! Je te remercie généreux donateur!");
    }
}

