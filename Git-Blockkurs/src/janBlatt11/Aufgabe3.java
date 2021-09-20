package janBlatt11;

import java.math.*;
import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger big = new BigInteger("1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl ein von der Sie die Fakultät haben möchten: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println(fakultät(n));
		
	}
	
	public static BigInteger fakultät(int n) {
		BigInteger erg = new BigInteger("1");
		BigInteger res = new BigInteger("1");
		for(int i = 1;i<=n;i++) {
			String s = "" + i;
			BigInteger value = new BigInteger(s);
			//System.out.println(value);
			res = erg.multiply(value);
			//System.out.println(erg);
			erg = res;
		}
		return res;
	}
	
	

}
