package janBlatt2;

import javax.swing.JOptionPane;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wert = JOptionPane.showInputDialog("Bitte Zahl eingeben: ");
		double x = Double.parseDouble(wert);
		
		System.out.println("Zahl: " + wert + ", Reziproke Zahl: " + (1/x));
	
	}

}
