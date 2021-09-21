package janBlatt15;

import janBlatt12.Dominostein;

public class Dominokette {
	private Dominostein[] arr = new Dominostein [1];
	
	public Dominokette(Dominostein d) {
		this.arr[0] = d;
	}
	
	public String toString() {
		String s ="";
		for(int i = 0; i<this.arr.length;i++) {
			Dominostein d = this.arr[i];
			s = s+"["+d.getX()+","+d.getY()+"] ";
		}
		return s;
	}
	
	public void fuegeRechstAn(Dominostein d2) {
		Dominostein d1 = this.arr[(this.arr.length -1)];
		if(d1.getY() == d2.getX() || d1.getY() == d2.getY()) {
			if(d1.getY() == d2.getY()) {
				d2.dreheUm();
			}
			Dominostein[] h = new Dominostein[(this.arr.length+1)];
			System.arraycopy(this.arr, 0, h, 0, this.arr.length);
			h[(h.length-1)] = d2;
			this.arr = h;
		}else {
			throw new NumberFormatException("Der Dominostein passt nicht an den rechten Stein");
		}
	}
	
	public void fuegeLinksAn(Dominostein d2) {
		Dominostein d1 = this.arr[0];
		if(d1.getX() == d2.getX() || d1.getX() == d2.getY()) {
			if(d1.getX() == d2.getX()) {
				d2.dreheUm();
			}
			Dominostein[] h = new Dominostein[(this.arr.length+1)];
			h[0] = d2;
			System.arraycopy(this.arr, 0, h, 1, this.arr.length);
			this.arr = h;
		}else {
			throw new NumberFormatException("Der Dominostein passt nicht an den linken Stein");
		}
	}
}
