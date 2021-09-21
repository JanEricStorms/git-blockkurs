package janBlatt15;

import janBlatt12.Dominostein;
import janBlatt12.Punkt;

public class TestProgFuerAufgabe15 {
	
	public static void main(String[] args) {
		Dominostein d = new Dominostein(5,6);
		Dominostein d2 = new Dominostein(2,3);
		Dominostein d3 = new Dominostein(6,4);
		Dominostein d4 = new Dominostein(4,3);
		Dominostein d5 = new Dominostein(5,2);
		
		Dominokette dk = new Dominokette(d);
		System.out.println(dk);
		dk.fuegeRechstAn(d3);
		System.out.println(dk);
		dk.fuegeLinksAn(d5);
		System.out.println(dk);
		dk.fuegeLinksAn(d2);
		System.out.println(dk);
		dk.fuegeRechstAn(d4);
		System.out.println(d);
	}
}
