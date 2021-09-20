package janBlatt8;

public class Aufgabe7 {
	public static void main(String[] args) {
		double[][] feld= Aufgabe6.aufruf();
		System.out.println();
		System.out.println("Die Spur der Matrix ist: " +getTrace2(feld));
	}
	
	
	public static double getTrace(double[][] matrix) {
		double result = 0;
		for(int i = 0;i<matrix.length;i++) {
			result = result + matrix[i][i];
			//System.out.println(matrix[i][i]);
		}
		
		return result;
	}
	public static double getTrace2(double[][] matrix) {
		double result = 0;
		for(int i = 0;i<matrix.length;i++) {
			int j = i;
			if(j<matrix[i].length) {
				result = result + matrix[i][j];
				//System.out.println(matrix[i][j]);
			}
		}
		
		return result;
	}
}
