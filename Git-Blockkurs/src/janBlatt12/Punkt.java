package janBlatt12;

public class Punkt {
	private double x;
	private double y;
	
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Punkt(Punkt p) {
		this.x = p.x;
		this.y = p.y;
		
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double n) {
		this.x = n;
	}
	
	public void setY(double n) {
		this.y = n;
	}
	
	public String toString() {
		return "("+this.x + "|" + this.y+")";
	}
	
	public void schiebe(double dx, double dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}
	
}
