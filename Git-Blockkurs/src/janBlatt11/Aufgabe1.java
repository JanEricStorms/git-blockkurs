package janBlatt11;

import javax.swing.JOptionPane;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die maximale Anzahl der Nachkommerstellen an: "));
		printPi(max);		
	}
	
	public static void printPi(int decimals) {
		String s = "%." + decimals + "f";
		System.out.printf(s, Math.PI);
		
	}

}
