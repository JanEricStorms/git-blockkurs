package janBlatt2;

import javax.swing.JOptionPane;

public class Aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x1 = JOptionPane.showInputDialog("Bitte geben Sie die x Koordinate des ersten Punktes ein: ");
		String y1 = JOptionPane.showInputDialog("Bitte geben Sie die y Koordinate des ersten Punktes ein: ");
		System.out.println("Der Punkt 1 hat die Koordinaten: " + x1 + "," + y1);
		
		String x2 = JOptionPane.showInputDialog("Bitte geben Sie die x Koordinate des zweiten Punktes ein: ");
		String y2 = JOptionPane.showInputDialog("Bitte geben Sie die y Koordinate des zweiten Punktes ein: ");
		System.out.println("Der Punkt 1 hat die Koordinaten: " + x2 + "," + y2);
		
		System.out.println("Die Distanz zwischen den Punkten beträgt: " + getDistance(Double.parseDouble(x1) ,Double.parseDouble(y1) ,Double.parseDouble(x2) ,Double.parseDouble(y2)));
	}
	public static double getDistance(double x1, double y1, double x2, double y2) {
		
		double value = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
		double Distance = Math.sqrt(value);
		return Distance;
		
	}
}
