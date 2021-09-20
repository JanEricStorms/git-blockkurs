package janBlatt12;

public class Dominostein {
	private int x;
	private int y;
	
	public Dominostein(int x, int y) {
		if(0<=x && x<=6) {
			this.x = x;
		}else {
			throw new ExceptionInInitializerError("Der Dominostein kann nur werte von 0 bis 6 annehmen.");
		}
		if(0<=y && y<=6) {
			this.y = y;
		}else {
			throw new ExceptionInInitializerError("Der Dominostein kann nur werte von 0 bis 6 annehmen.");
		}
	}
	
	public Dominostein(Dominostein d) {
		this.x = d.x;
		this.y = d.y;
		
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int n) {
		if(0<=n && n<=6) {
			this.x = n;
		}else {
			throw new ExceptionInInitializerError("Der Dominostein kann nur werte von 0 bis 6 annehmen.");
		}
	}
	
	public void setY(int n)  {
		if(0<=n && n<=6) {
			this.y= n;
		}else {
			throw new ExceptionInInitializerError("Der Dominostein kann nur werte von 0 bis 6 annehmen.");
		}
	}
	
	public String toString() {
		return "| "+this.x+" | "+this.y+" |";
	}
	
	public void dreheUm() {
		int spacer = this.x;
		
		this.x = this.y;
		this.y = spacer;
	}
	
	public int[] getValues() {
		int[] erg = new int[2];
		erg[0] = this.x;
		erg[1] = this.y;
		
		return erg;
	}
}
