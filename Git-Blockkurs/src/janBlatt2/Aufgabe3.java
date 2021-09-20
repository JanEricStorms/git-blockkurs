package janBlatt2;

import javax.swing.JOptionPane;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = Double.parseDouble(JOptionPane.showInputDialog("Bitte Temperatur in Grad Celsius angeben: "));
		System.out.println(getFahrenheit(x));
	
		
	}
	
	public static double getFahrenheit(double celsius) {
		System.out.println(celsius);
		celsius = celsius * ( 1.8 ) + 32;
		return celsius;
	}

}
