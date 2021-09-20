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
	
	
}
