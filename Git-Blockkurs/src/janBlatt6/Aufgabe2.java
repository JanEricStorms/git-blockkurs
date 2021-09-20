package janBlatt6;

import javax.swing.JOptionPane;

public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int in = Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl eingeben: "));
		zahlendreieck(/*in*/);
		zahlenpyramide();
	}
	
	public static void zahlendreieck(/*int value*/) {
		int value = 5;
		int count =1;
		for(int i =1; i<=value;i++) {
			for(int a=1; a<=count;a++) {
				System.out.print(i + " ");
			}
			System.out.println();
			count++;
		}
	}
	public static void zahlenpyramide(/*int value*/) {
		int value = 5;
		int count =1;
		for(int i =1; i<=value;i++) {
			String spaces = "%" + (value+1-i) + "d";
			for(int a=1; a<=count;a++) {
				
				System.out.printf(spaces ,i);
				spaces = "%" + (2) + "d"; 
			}
			System.out.println();
			count++;
		}
	}

}
