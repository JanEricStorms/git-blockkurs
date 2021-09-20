package janBlatt9;

import java.util.Scanner;

public class Aufgabe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen Text ein der Umgewandelt werden soll: ");
		System.out.println(newGermanOrthography(sc.nextLine()));
	}

	public static String newGermanOrthography(String s) {
		String erg= "";
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='s' || s.charAt(i)=='S') {
				try {
					if(s.charAt((i+1))=='c') {
						if(s.charAt((i+2))=='h') {
							erg = erg + s.charAt(i) + s.charAt((i+2));
							i = i +2;
							continue;
						}
					}
				}catch(StringIndexOutOfBoundsException e) {
					
				}
			}
			erg = erg + s.charAt(i);
		}
		
		
		return erg;
	}

}
