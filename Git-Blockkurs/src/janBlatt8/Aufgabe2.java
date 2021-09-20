package janBlatt8;

public class Aufgabe2 {
	public static void main(String [] args) {
		double[] feld =  {46,52,63,95,45,26,10,9,85,42,62,15,30,1,50,94,65,85,21,10,99};
		System.out.println(getMinimum(feld));
		System.out.println(getMinimumIndex(feld));
	}
	
	public static double getMinimum(double[] a) {
		double small = a[0];
		double pointer;
		for(int i = 0; i<a.length;i++) {
			pointer = a[i];
			if(pointer<small){
				small = a[i];
			}
		}
		
		
		return small;
	}
	
	public static int getMinimumIndex(double[] a) {
		double small = a[0];
		double pointer;
		int index = 0;
		for(int i = 0; i<a.length;i++) {
			pointer = a[i];
			if(pointer<small){
				small = a[i];
				index = i;
			}
		}
		
		
		return index;
	}
}
