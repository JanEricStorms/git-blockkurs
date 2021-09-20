package janBlatt2;

import javax.swing.JOptionPane;

public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w = Double.parseDouble(JOptionPane.showInputDialog("Bitte eine Zahl eingeben: "));
		double x = Math.abs(w);
		System.out.println("Absoluterwert: " + x + ", Natürlicher Logarithmus: " + Math.log(x) + ", Sinus Hyperbolikus: " + Math.sinh(w));
	}

}
