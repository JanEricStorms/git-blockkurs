package janBlatt7;

import java.awt.*;
import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die X-Koordinate des Ersten Punktes an: ");
		int px1 = Integer.parseInt(sc.nextLine());
		System.out.println("Bitte geben Sie die Y-Koordinate des Ersten Punktes an: ");
		int py1 = Integer.parseInt(sc.nextLine());
		System.out.println("Bitte geben Sie die X-Koordinate des Zweiten Punktes an: ");
		int px2 = Integer.parseInt(sc.nextLine());
		System.out.println("Bitte geben Sie die Y-Koordinate des Zweiten Punktes an: ");
		int py2 = Integer.parseInt(sc.nextLine());
		
		Point p1 = new Point(px1, py1);
		Point p2 = new Point(px2, py2);
		
		System.out.println("Neue Koordinaten Punkt 1: ");
		p1 = move(p1);
		System.out.println("Neue Koordinaten Punkt 2: ");
		p2 = move(p2);
		
		System.out.println("Die Distanz zwischen den beiden Punkten beträgt: " +p1.distance(p2) + " Einheiten");
	}
	
	public static Point move(Point p) {
		int a = p.x;
		int b = p.y;
		
		p.setLocation(a+10, b+10);
		System.out.println("X-Koordinate: " + p.x);
		System.out.println("Y-Koordinate: " + p.y);
		System.out.println();
		return p;
	}

}
