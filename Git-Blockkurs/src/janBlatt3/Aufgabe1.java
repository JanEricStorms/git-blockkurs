package janBlatt3;

import javax.swing.JOptionPane;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getTemperaturText(Double.parseDouble(JOptionPane.showInputDialog("Bitte Temperatur eingeben: "))));
	}
	public static String getTemperaturText(double temp) {
		
		if(temp <= 10) {
			return "kalt";
		}else if (temp > 10 && temp <= 25){
			return "lauwarm";
		}else if (temp > 25 && temp <= 40){
			return "warm";
		}else {
			return "heiß";
		}
	}

}
