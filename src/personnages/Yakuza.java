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
}
