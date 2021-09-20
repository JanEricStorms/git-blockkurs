package janBlatt3;

import javax.swing.JOptionPane;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("X hat den Wert: " + solveLinearEquation(Double.parseDouble(JOptionPane.showInputDialog("Bitte geben sei einen Wert für a ein: ")),Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie einen Wert für b ein: "))));
	}
	
	public static double solveLinearEquation(double a, double b) {
		
		double x = 0;
		
		x = (-b) / a;
			 
		if(String.valueOf(Math.abs(x))== "Infinity") {
			throw new ArithmeticException("Gleichung nicht eindeutig loesbar!");

		}else {
			return x;
		}
	}
}
