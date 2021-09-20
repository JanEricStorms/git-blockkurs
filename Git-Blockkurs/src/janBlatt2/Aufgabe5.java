package janBlatt2;

import javax.swing.JOptionPane;

public class Aufgabe5 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Double Random Zahl");
		System.out.println(getDoubleRandom(Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Minimale Zahl an")),Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die Maximale Zahl an"))));
		
		JOptionPane.showMessageDialog(null, "Int Random Zahl");
		System.out.println(getIntRandom(Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die Minimale Zahl an")),Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die Maximale Zahl an"))));
	}
	public static double getDoubleRandom(double min, double max) {
		double x = Math.random() * (max-min)+min;
		return x;
		
	}
	public static int getIntRandom(int min, int max) {
		int x = (int) (Math.random() * (max-min)+min);
		return x;
		
	}
	
}
