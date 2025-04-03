package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String clan) {
        super(nom, "whisky", 30);
        this.clan = clan;
        this.reputation = 0;
    }

    public void extorquer(Commercant victime) {
        int argentPique = victime.seFaireExtorquer();
        this.gagnerArgent(argentPique);
        this.reputation++;
        parler("J’ai piqué les " + argentPique + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

    public void perdre() {
        this.perdreArgent(this.getArgent());
        this.reputation--;
        parler("J’ai perdu mon duel et mes " + this.getArgent() + " sous, snif... J'ai déshonoré le clan de " + this.clan + ".");
    }

    public void gagner(int gain) {
        this.gagnerArgent(gain);
        this.reputation++;
        parler("Je l'ai dépouillé de ses " + gain + " sous. Hi ! Hi !");
    }

    public int getReputation() {
        return reputation;
    }
}

