package janBlatt7;

import java.util.*;

import javax.swing.JOptionPane;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int a = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die Anzahl der zufälligen Zahlen ein: "));
		//r.ints(a, 99, 100);
		for(int i = 1; i<=a;i++) {
			System.out.println(r.nextInt(101));
		}
	}
	
	
	
}
