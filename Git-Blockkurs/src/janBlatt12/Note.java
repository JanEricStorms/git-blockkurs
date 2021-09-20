package janBlatt12;

public class Note {
	private double n;
	private double[] Noten = {1.0,1.3,1.7,2.0,2.3,2.7,3.0,3.3,3.7,4.0,5.0};
	
	public Note(double n) {
		for(int i = 0;i<Noten.length;i++) {
			if(n == Noten[i]) {
				this.n = n;
				break;
			}
			if(i == (Noten.length -1)) {
				NumberFormatException x = new NumberFormatException("Diese Note existiert nicht: " + n);
				throw x;
			
			}
		}
	}
	
	public Note (Note n) {
		this.n = n.n;
	}
	
	public double getNote() {
		return this.n;
	}
	
	public void setNote(double n) {
		for(int i = 0;i<Noten.length;i++) {
			if(n == Noten[i]) {
				this.n = n;
				break;
			}
			if(i == (Noten.length -1)) {
				NumberFormatException x = new NumberFormatException("Diese Note existiert nicht: " + n);
				throw x;
			
			}
		}
	}
	
	public String toString() {
		return ""+this.n;
	}
	
	public boolean hatBestanden() {
		if(this.n <= 4.0) {
			return true;
		}else {
			return false;
		}
	}
}
