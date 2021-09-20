package janBlatt12;

public class TestProgrammFuerAufgabe12 {
	
	public static void main(String[] args) {
	
		A1();
		System.out.println();
		A2();
		System.out.println();
		A3();
		System.out.println();
		A4();
		System.out.println();
		A5();
		System.out.println();
		
	}
	
	public static void A1() {
		Punkt P = new Punkt(5,4);
		System.out.println("X: "+  P.getX());
		System.out.println("Y: "+ P.getY());
		System.out.println("Punkt: " + P);
		P.setX(1);
		P.setY(-25);
		System.out.println("X: "+ P.getX());
		System.out.println("Y: "+ P.getY());
		System.out.println("Punkt: "+ P);
	}
	
	public static void A2() {
		System.out.println("Was komplexe Zahl ?");
	}
	
	public static void A3() {
		GeradeZahl G = new GeradeZahl(12);
		System.out.println(G);
		G.setG(-5);
		System.out.println(G.getG());
	}
	
	public static void A4() {
		Note N = new Note();
		N.setNote(2.3);
		System.out.println(N.getNote());
		N.setNote(3.0);
		System.out.println(N);
		//N.setNote(2.5);
	}
	
	public static void A5() {
		Geburtstag G = new Geburtstag("Januar",27);
		System.out.println(G);
		G.setTag(31);
		G.setMonat("Dezember");
		System.out.println(G.getTag());
		System.out.println(G.getMonat());
		G.setTag(6);
		System.out.println(G);
	}
}
