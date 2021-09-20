package janBlatt4;

import javax.swing.JOptionPane;

public class Aufgabe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programm();
	}
	public static void Programm() {
		//boolean killswitch = true;
		double summe = 0;
		int count = 0;
		while(true) {
			double eingabe = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein: "));
			if(eingabe == 0) {
				break;
			}else {
			summe = summe + Math.abs(eingabe);
			count = count + 1;
			}
		
		}
		System.out.println("Die Summe der eingegebenen Zahlen ist: " + summe);
		System.out.println("Der Durchschnitt der eingegebenen Zahlen ist: " + summe/count);
	
	}

}
