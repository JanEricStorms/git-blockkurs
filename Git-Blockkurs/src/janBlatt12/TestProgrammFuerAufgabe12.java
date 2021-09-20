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
		A6();
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
		P.schiebe(-5, 10);
		System.out.println(P);
	}
	
	public static void A2() {
		System.out.println("Was komplexe Zahl ?");
	}
	
	public static void A3() {
		GeradeZahl G = new GeradeZahl(12);
		GeradeZahl G2 = new GeradeZahl(10);
		System.out.println(G);
		G.setG(-5);
		System.out.println(G.getG());
		System.out.println(G.getNachfolger());
		System.out.println(G.getSum(G2));
		System.out.println(G.getProd(G2));
	}
	
	public static void A4() {
		Note N = new Note(1.3);
		N.setNote(2.3);
		System.out.println(N.getNote());
		N.setNote(3.0);
		System.out.println(N);
		//N.setNote(2.5);
		System.out.println(N.hatBestanden());
	}
	
	public static void A5() {
		Geburtstag G = new Geburtstag("Januar",27);
		Geburtstag G2 = new Geburtstag("September", 7);
		System.out.println(G);
		G.setTag(30);
		G.setMonat("September");
		System.out.println(G.getTag());
		System.out.println(G.getMonat());
		G.setTag(7);
		System.out.println(G);
		System.out.println(G.equals(G2));
		
	}
	
	public static void A6() {
		Dominostein D = new Dominostein(2,6);
		System.out.println(D);
		D.setX(5);
		System.out.println(D.getX());
		D.setY(0);
		System.out.println(D.getY());
		System.out.println(D);
		D.dreheUm();
		System.out.println(D);
		int[] ret = D.getValues();
		for(int i=0; i<ret.length;i++) {
			System.out.println(ret[i]);
		}
		
	}
}
