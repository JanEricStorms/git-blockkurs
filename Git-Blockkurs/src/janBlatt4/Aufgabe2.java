package janBlatt4;

import javax.swing.JOptionPane;

public class Aufgabe2 {
	public static void main(String[] args) {
		System.out.println(doubleBirthday(Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die Gruppengröße an: "))));
	}
	
	public static double doubleBirthday(int size) {
		
		if(size <=1) {
			throw new ArithmeticException("Es handelt sich bei 1 Person nicht um eine Gruppe!");
		}else {
			double test =1;
			for(int i = 365; i>(365-size); i--) {
				test = test * i/365;
				//System.out.println(1-test);
			}
			return (1-test);
		}
	}
}
