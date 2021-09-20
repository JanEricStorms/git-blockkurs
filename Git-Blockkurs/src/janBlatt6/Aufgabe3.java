package janBlatt6;

import javax.swing.JOptionPane;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int größe = Integer.parseInt(JOptionPane.showInputDialog("Bitte den Radius eingeben: "));
		boolean sweet;
		while(true) {
		int detail = Integer.parseInt(JOptionPane.showInputDialog("Bitte gebe 1 ein, wenn du den Sweet Mode aktivieren willst, oder 0 wenn du den Normalen benutzen willst."));
		if(detail == 0 || detail == 1) {
			if(detail == 0) {
				 sweet = false;
			}else {
				 sweet = true;
			}
			break;
		}else {
			JOptionPane.showMessageDialog(
				    null, 
				    "Bitte geben Sie einen Wert zwischen 0 und 1 an", 
				    "title",
				    JOptionPane.WARNING_MESSAGE); 
		}
		}
		printCirlce(größe, sweet);
	
	}
	public static void printCirlce(int radius, boolean sweet) {
		double distance;
		if(sweet) {
			for(int i = 0; i<=2*radius;i++) {
				
				for(int j = 0; j <= 2*radius;j++) {
					distance = Math.sqrt((i-radius)*(i-radius) + (j-radius)*(j-radius));
					
					if(distance > radius - 0.25 && distance < radius + 0.25) {
						System.out.print("#");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}else {
			for(int i = 0; i<=2*radius;i++) {
				
				for(int j = 0; j <= 2*radius;j++) {
					distance = Math.sqrt((i-radius)*(i-radius) + (j-radius)*(j-radius));
					
					if(distance > radius - 0.5 && distance < radius + 0.5) {
						System.out.print("#");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
		
	}

}
