package janBlatt15;

public class Schachstellung {
	
	private final String[][] feld;
	
	public Schachstellung() {
		 this.feld = new String[8][8];
		 for(int i =0;i<this.feld.length;i++) {
			 for(int j = 0;j<this.feld[i].length;j++) {
				 this.feld[i][j] = " ";
			 }
		 }
	}
	
	public void setzeSchachstellung(String s) {
		String f ="";
		int xf;
		int yf;
		for(int i = 1; i<s.length();i=i+3) {
				f = ""+ s.charAt(i-1);
				if(f.equals("K") || f.equals("D") || f.equals("T") || f.equals("S") || f.equals("L") || f.equals("B") || 
						f.equals("k") || f.equals("d") || f.equals("t") || f.equals("s") || f.equals("l") || f.equals("b")) {
						xf = Integer.parseInt(String.valueOf(s.charAt(i)));
						yf = Integer.parseInt(String.valueOf(s.charAt(i+1)));
				if(xf<=8 && xf>0 && yf<=8 && yf>0) {
					if(this.feld[xf-1][yf-1].equals(" ")) {
						this.feld[xf-1][yf-1] = f;
					}else {
						throw new IllegalArgumentException("Das Feld ist bereits besetzt. \n"
								+ "Auf dem Feld steht die Figur " + this.feld[xf-1][yf-1] + ". \n"
								+ "Setzen sie " + f + " auf ein anderes Feld." );
					}
				}else {
					throw new IllegalArgumentException("Die eingegebenen Koordianaten befinden sich nicht auf dem Spielfeld. \n"
							+ "Möglich sind eingaben von 1-8. \n"
							+ "Ihre eingebe: " + xf +"/" + yf );
				}
				}else {
					throw new IllegalArgumentException("Der eingegebene Buchstabe ist keine Gültige bezeichnung für eine Figur. \n"
							+ "Möglich sind K,D,T,S,L,B oder k,d,t,s,l,b . \n" 
							+ "Ihre eingabe: " + f );
				}
		}
	}
	
	public String toString() {
		String erg = "";
		String v;
		erg = "+---+---+---+---+---+---+---+---+\n|";
		for(int i = 0; i<this.feld.length;i++) {
			
			for(int j = 0;j<this.feld[i].length;j++) {
				if(this.feld[i][j].equals(" ")) {
					erg = erg + "   |";
				}else {
					erg = erg + " "+this.feld[i][j]+" |";
				}
			}
			erg = erg + "\n+---+---+---+---+---+---+---+---+\n|";
			
		}
		return erg;
		
	}
	
}
