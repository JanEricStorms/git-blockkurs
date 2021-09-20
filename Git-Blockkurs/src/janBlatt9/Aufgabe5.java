package janBlatt9;

import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Text ein: ");
		System.out.println(clozeText(sc.nextLine()));
	}
	
	public static String clozeText(String s) {
		String erg = "";
		for(int i =0;i<s.length();i++) {
			if(i%4 == 0) {
				erg = erg + " ";
			}else {
				erg = erg + s.charAt(i);
			}
			
		}
		
		
		return erg;
	}

}
