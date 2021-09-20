package janBlatt9;

import java.util.Scanner;

public class Aufgabe1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben sie ein Wort oder einen Satz ein: ");
		String eingabe = sc.nextLine();
		System.out.println("Bitte geben Sie einen Buchstaben ein der gezählt werden soll: ");
		char c = sc.nextLine().charAt(0);
		System.out.println("Der Buchstabe " + c + " kommt " + getCharCount(eingabe, c) + " mal im Wort beziehungsweise Satz vor.");
		//System.out.println(eingabe.length());
	}
	
	public static int getCharCount(String s,char c) {
		int result = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				result++;
			}
		}
		
		
		return result;
	}
}
