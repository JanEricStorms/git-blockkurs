package janBlatt12;

public class Geburtstag {
	private int tag;
	private String monat;
	
	public Geburtstag(String m, int t){
		int mo = checkMonat(m);
		try {
			for(int i = 0;i<Geb[mo].length;i++) {
				if(Geb[mo][i]==t) {
					this.monat=m;
					this.tag = t;
					break;
				}
				if(i == (Geb[mo].length -1)) {
					ArrayIndexOutOfBoundsException x = new ArrayIndexOutOfBoundsException("Bitte geben Sie einen Tag an der im Monat " + this.monat + " existiert." + "(" + (i+1) + ")");
					throw x;
					
				}
				
			}
			}catch (NullPointerException e) {
				System.out.println("Bitte geben Sie zuerst einen Monat ein!");
				throw new ExceptionInInitializerError("Ohne den Monat kann nicht Kontroliert werden, ob der Tag im Monat verfügbar ist");
			}
		
	}
	 
	private int[] m1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	private int[] m2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};
	private int[] m3 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	private int[] m4 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
	private int[] m5 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	private int[] m6 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
	private int[] m7 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	private int[] m8 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	private int[] m9 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
	private int[] m10 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	private int[] m11 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
	private int[] m12 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
	
	private int[][] Geb = {m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12};
	
	public void setMonat(String s) {
		
		try {
			int m = checkMonat(s);
			for(int i = 0;i<Geb[m].length;i++) {
				if(Geb[m][i]==this.tag) {
					break;
				}
				if(i == (Geb[m].length -1)) {
					ArrayIndexOutOfBoundsException x = new ArrayIndexOutOfBoundsException("Bitte geben Sie einen Tag an der im Monat " + s + " existiert." + "(Max. " + (i+1) + " /Ihr versuch: " +this.tag +" )");
					throw x;
					
				}
				
			}
			}catch (NullPointerException e) {
				System.out.println("Bitte geben Sie zuerst einen Monat ein!");
				throw new ExceptionInInitializerError("Ohne den Monat kann nicht Kontroliert werden, ob der Tag im Monat verfügbar ist");
			}
		this.monat = s;
	}
	
	public void setTag(int n) {
		try {
		int m =checkMonat(this.monat);
		for(int i = 0;i<Geb[m].length;i++) {
			if(Geb[m][i]==n) {
				this.tag = n;
				break;
			}
			if(i == (Geb[m].length -1)) {
				ArrayIndexOutOfBoundsException x = new ArrayIndexOutOfBoundsException("Bitte geben Sie einen Tag an der im Monat " + this.monat + " existiert." + "(Max. " + (i+1) + " /Ihr versuch: " +n +" )");
				throw x;
				
			}
			
		}
		}catch (NullPointerException e) {
			System.out.println("Bitte geben Sie zuerst einen Monat ein!");
			throw new ExceptionInInitializerError("Ohne den Monat kann nicht Kontroliert werden, ob der Tag im Monat verfügbar ist");
		}
		
	}
	
	private static int checkMonat(String s) {
		String[] M = {"Januar","Februar","März","April","Mai","Juni","Juli","August","Septemer","Oktober","Novembver","Dezember"};
		for(int i=0;i<M.length;i++) {
			if(s.equals(M[i])) {
				return i;
			}
			if(i == (M.length -1)) {
				IllegalArgumentException x = new IllegalArgumentException("Bitte geben Sie einen Existierenden Monat ein");
				throw x;
			}
		}
		
	return 404;
	}
	
	public String toString() {
		return this.tag+". "+this.monat;
	}
	
	public int getTag() {
		return this.tag;
	}
	
	public String getMonat() {
		return this.monat;
	}
	
	
}
