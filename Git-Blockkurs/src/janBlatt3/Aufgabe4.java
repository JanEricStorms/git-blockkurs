package janBlatt3;

import javax.swing.JOptionPane;

public class Aufgabe4 {
	public static void main(String[] args) {
		int result = getPostage(Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie den Wert Ihrer Bestellung in Cent ein: ")));
		if(result == 0) {
			System.out.println("Ihre Bestellung ist Portofrei");
		}else {
			System.out.println("Auf Ihre Bestellung fallen " + result + " Cent proto an");
		}
	}
	
	public static int getPostage(int order) {
		int value = order / 100;
		if(value <= 100) {
			return 550;
		}else if( value > 100 && value <= 200) {
			return 300;
		}else {
			return 0;
		}
		
		
	}
}
