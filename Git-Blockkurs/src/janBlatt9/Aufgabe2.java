package janBlatt9;

import java.util.Scanner;

public class Aufgabe2 {
	public static void main(String[] args) {
		System.out.println(getCapitalString());
	}
	
	public static String getCapitalString() {
		String erg = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein Wort oder einen Satz ein: ");
		String s = sc.nextLine();
		for(int i =0; i<s.length();i++) {
			if(s.charAt(i)>=97 && s.charAt(0)<=122) {
				erg = erg + (char) (s.charAt(i) - 32);
			}else {
				erg = erg + s.charAt(i);
			}
		}
		
		return erg;
	}
}
