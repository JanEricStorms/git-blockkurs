package janBlatt4;

import javax.swing.JOptionPane;

public class Aufgabe6 {
	public static void main(String[] args) {
		getAsci();
	}

	public static void getAsci() {
		
		while (true) {
			int eingabe = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein: "));
			if (eingabe == 0) {
				System.out.println("Das Programm wird beendet");
				break;
			} else {
				System.out.println((char) eingabe);

			}
		}
	} 
}
