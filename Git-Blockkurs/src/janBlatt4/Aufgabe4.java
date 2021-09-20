package janBlatt4;

import javax.swing.JOptionPane;

public class Aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNextPartialSum(Integer.parseInt(JOptionPane.showInputDialog("Bitte eine Zahl eingeben: "))));
	}
	
	public static int getNextPartialSum(int v) {
		int sum = 0;
		if( v <=1) {
			throw new ArithmeticException("Bitte einen Wert eingeben der Größer ist als 1!");
		}
		for( int i = 1; i <= v; i++) {
			sum+=i;
		}
		
		return sum;
	}
}
