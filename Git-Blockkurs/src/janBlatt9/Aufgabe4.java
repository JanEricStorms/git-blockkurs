package janBlatt9;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Satz oder ein Wort ein das invertiert werden soll: ");
		String eingabe = sc.nextLine();
		System.out.println(reverse(eingabe));
	}
	
	public static String reverse(String s) {
		String erg = "";
		for(int i = 1;i<=s.length();i++) {
			erg = erg + s.charAt(s.length()-i);
		}
		
		
		return erg;
	}

}
