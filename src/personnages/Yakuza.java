package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	public Yakuza(String n, String boisson,int argent,String clan) {
		super(n,boisson,argent);
		this.clan=clan;
	}
	 public void extorquer(Commercant victime) {
		 parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		 int arg = victime.seFaireExtorquer();
		 this.gagnerArgent(arg);
		 parler(String.format("J’ai piqué les %d sous de %s, ce qui me fait %d sous dans ma poche. Hi ! Hi !", null)"")
	 }
}
