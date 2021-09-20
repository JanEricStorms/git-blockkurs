package janBlatt4;

import javax.swing.JOptionPane;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int get = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein: "));
		if(get <= 31 ) {
			System.out.println(getFactorial(get));
		}else {
			System.out.println(getFactorialBig(get));
		}
		
	}

	public static int getFactorial(int x) {
		if (x > 0) {
			int result = 1;
			for (int i = 1; i <= x; i++) {
				result = result * i;
			}
				return result;
		} else {
			throw new ArithmeticException("X it kleiner als 0. Bitte wählen Sie einen Wert der Größer als 0 ist.");

		}
	}
	
	public static double getFactorialBig(int x) {
		if (x > 0) {
			double result = 1;
			for (int i = 1; i <= x; i++) {
				result = result * i;
			}
				return result;
		} else {
			throw new ArithmeticException("X it kleiner als 0. Bitte wählen Sie einen Wert der Größer als 0 ist.");

		}
	}

}
