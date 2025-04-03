package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
	/*
		Humain prof=new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
	*/	
		
		
		

		Commercant perso=new Commercant("Marco", 54);
		perso.direBonjour();
		perso.seFaireExtorquer();
		perso.recevoir(15);
		perso.boire();
		
		
		
		Yakuza yaku=new Yakuza("Yaku Le Noir",whisky,"Clan");
		yaku.direBonjour();
		yaku.extorquer(perso);
		
		
		
	}
	
}
