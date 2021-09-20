package janBlatt6;

import javax.swing.JOptionPane;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int erste = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die erste Zahl ein: "));
		int zweite = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die zweite Zahl ein: "));
		System.out.println(gcd(erste, zweite));
	}	
	
	public static int gcd(int a, int b) {
		if(a<1 || b<1) {
			throw new ArithmeticException("Bitte geben Sie Zahlen ein die Größer als 1 sind");
		}
		while(b!=0) {
			if(a>b) {
				a = a-b;
			}else {
				b=b-a;
			}
		}
		return a;
	}
}
