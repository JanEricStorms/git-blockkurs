package janBlatt4;

import javax.swing.JOptionPane;

public class Aufgabe3 {
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein: "));
		double result = 4*getPi(number);
		System.out.println(result);
	}
	
	public static double getPi(int n) {
		double zaehler =3;
		double value =1;
		for(int i=1; i<=n; i++) {
			if(i%2 == 1) {
				value = value - (1/zaehler);
				zaehler = zaehler+2;
				//System.out.println(value);
			}else {
				value = value + (1/zaehler);
				zaehler = zaehler+2;
				//System.out.println(value);
			}
		}
		return value;
	}
}
