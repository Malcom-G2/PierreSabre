package histoire;

import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
	        Humain prof = new Humain("Prof", "kombucha", 54);
	        prof.direBonjour();
	        prof.acheter("boisson", 12);
	        prof.boire();
	        prof.acheter("jeu", 2);
	        prof.acheter("kimono", 50);
		
	        Commercant marco = new Commercant("Marco");
	        marco.direBonjour();
	        marco.seFaireExtorquer();
	        marco.recevoir(15);
	        marco.boire();
	        
	        Commercant polo = new Commercant("Polo Le Noir");
	        polo.recevoir(1500);
		
	        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "Warsong");
	        
	        Yakuza odanobunaga = new Yakuza("Oda Nobunaga", "Oda");
	        odanobunaga.extorquer(polo);
	        odanobunaga.extorquer(polo);
	        odanobunaga.extorquer(polo);
	        odanobunaga.extorquer(polo);
	        odanobunaga.extorquer(polo);
	        
	        yakuLeNoir.direBonjour();
	        yakuLeNoir.extorquer(marco);
		
	        Ronin roro = new Ronin("Roro");
	        roro.direBonjour();
	        roro.donner(marco);
	        
	        roro.provoquer(yakuLeNoir);
	        
	        roro.provoquer(odanobunaga);
		
	}
	
}
