package janBlatt7;

import javax.swing.JOptionPane;
import janBlatt7.Bruch;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bruch b = bruchErzeugen();
		System.out.println(b);
		System.out.println(bruchVergrößern(b));
	}
	
	public static Bruch bruchErzeugen() {
		int p1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie den Zähler ein: "));
		int p2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie den Nenner ein: "));
		Bruch b = new Bruch(p1, p2);
		return b;
	}
	
	public static Bruch bruchVergrößern(Bruch b) {
		Bruch b1 = new Bruch(b);
		Bruch add = new Bruch(1,10);
		b1.add(add);
		if(b.getNenner()>b1.getNenner()) {
			System.out.println("Der Nenner des ersten Bruches ist größer als der des Zweiten!");
		}else if(b.getNenner()==b1.getNenner()) {
			System.out.println("Die Nenner sind gleich!");
		}else if(b.getNenner()<b1.getNenner()) {
			System.out.println("Der Nenner des ersten Bruches ist kleiner als der des Zweiten!");
		}
		
		return b1;
	}

}
