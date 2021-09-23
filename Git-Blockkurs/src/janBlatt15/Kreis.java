package janBlatt15;

import janBlatt12.Punkt;

public class Kreis {
	private double radius;
	private Punkt mittelpunkt = new Punkt(0,0);
	
	public Kreis(double r,Punkt m) {
		this.radius = r;
		this.mittelpunkt = m;
		
	}
	
	public Kreis(Kreis k) {
		this.radius = k.radius;
		this.mittelpunkt = k.mittelpunkt;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double r) {
		this.radius = Math.abs(r);
	}
	
	public Punkt getMittelpunkt() {
		return this.mittelpunkt;
	}
	
	public void setMittelpunkt(Punkt m) {
		this.mittelpunkt = m;
	}
	
	public double getFlache() {
		return (Math.PI * (this.radius*this.radius));
	}
	
	public double getUmfang() {
		return (2 * Math.PI * this.radius);
	}
	
	public double getAbstand(Punkt p2) {
		Punkt p1 = this.mittelpunkt;
		double x1 = p1.getX();
		double y1 = p1.getY();
		double x2 = p2.getX();
		double y2 = p2.getY();
		double erg = (Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))) - this.radius;
		
		return erg;	
	}
}
