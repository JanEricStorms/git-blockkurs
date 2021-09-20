package janBlatt12;

public class Punkt {
	private int x;
	private int y;
	
	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int n) {
		this.x = n;
	}
	
	public void setY(int n) {
		this.y = n;
	}
	
	public String toString() {
		return "("+this.x + "|" + this.y+")";
	}
	
}
