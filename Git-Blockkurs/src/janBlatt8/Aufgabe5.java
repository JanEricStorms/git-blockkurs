package janBlatt8;

public class Aufgabe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x1 = {1,2,3,4,5,6,7,8,9,10};
		int[] x2 = {9,8,7,6,5,4,3,2,1,0};
		int[] erg = concat(x1, x2);
		for(int i = 0; i<erg.length;i++) {
			System.out.println(erg[i]);
		}
		
	}
	
	public static int[] concat(int[] x1, int[] x2) {
		int total = x1.length + x2.length;
		//System.out.println(total);
		int[] result = new int[total];
		System.arraycopy(x1, 0, result, 0, x1.length);
		System.arraycopy(x2, 0, result, x1.length, x2.length);
		
		
		return result;
	}

}
