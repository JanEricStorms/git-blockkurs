package janBlatt3;

import javax.swing.JOptionPane;

public class Aufgabe2 {
	public static void main(String[] args) {
		System.out.println(getWaitingTime(Integer.parseInt(JOptionPane.showInputDialog("Bitte die aktuelle Stunde eingeben: ")),Integer.parseInt(JOptionPane.showInputDialog("Bitte die aktuelle Minute angeben: "))));
	}
	
	public static int getWaitingTime(int h, int min) {
		int time;
		int a = 60 - min;
		if(a >= 30) {
			if(a == 60) {
				time=0;
			}else {
			time = a-30;
			}
		}else {
			time = a;
		}
		return time;
	}
}
