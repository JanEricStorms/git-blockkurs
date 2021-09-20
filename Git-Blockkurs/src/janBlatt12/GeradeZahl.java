package janBlatt12;

public class GeradeZahl {
	private int n;
	
	public GeradeZahl(int n) {
		if(n%2 == 0) {
			this.n = n;	
		}else {
			n = n-1;
			this.n = n;
		}
	}
	
	public GeradeZahl(GeradeZahl g) {
		this.n = g.n;
	}
	
	public String toString() {
		
		return ""+this.n;
	}
	
	public int getG() {
		return this.n;
	}
	public int setG(int n) {
		if(n%2 == 0) {
			this.n = n;	
		}else {
			n = n-1;
			this.n = n;
		}
		return n;
	}
	
	public GeradeZahl getNachfolger() {
		
		GeradeZahl erg = new GeradeZahl((this.n + 2));
		
		return erg;
	}
	
	public GeradeZahl getSum(GeradeZahl g2) {
		
		GeradeZahl erg = new GeradeZahl((this.n + g2.n));
		
		
		return erg;
	}
	
	public GeradeZahl getProd(GeradeZahl g2) {
	
		GeradeZahl erg = new GeradeZahl((this.n * g2.n));
		
		return erg;
	}
	
	
	
}
