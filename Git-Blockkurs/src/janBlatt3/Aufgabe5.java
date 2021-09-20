package janBlatt3;

import javax.swing.JOptionPane;

public class Aufgabe5 {
	public static void main(String[] args) {
		System.out.println(getNameOfMonth(Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sein eine Zahl ein :"))));
	}
	
	public static String getNameOfMonth(int nr) {
		switch(nr) {
		case 1:
			return "Januar";
		case 2: 
			return "Februar";
		case 3:
			return "März";
		case 4:
			return "April";
		case 5:
			return "Mai";
		case 6:
			return "Juni";
		case 7:
			return "Juli";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "Oktober";
		case 11:
			return "November";
		case 12:
			return "Dezember";
		default:
			throw new ArithmeticException("Der eingegebene Wert liegt nicht zwischen 1-12");

		}
	}
}
