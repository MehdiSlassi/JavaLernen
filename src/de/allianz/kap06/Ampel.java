package de.allianz.kap06;

public class Ampel {
	
public enum AmpelFarbe {ROT, GELB, GRUEN}
	
	private AmpelFarbe farbe;
	
	public void setAmpelFarbe(AmpelFarbe ampelFarbe) {
		farbe = ampelFarbe;	
	}
	
	public AmpelFarbe getAmpelFarbe() {
		return farbe;
	}
	
	public static void main(String[] args) {
		Ampel ampel = new Ampel();
		
		ampel.setAmpelFarbe(AmpelFarbe.ROT);
		System.out.println("die Farbe der Ampel ist: " + ampel.getAmpelFarbe() );
		
		System.out.println("test reset");
		
	}

}
