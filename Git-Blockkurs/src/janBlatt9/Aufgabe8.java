package janBlatt9;

import java.util.Scanner;

public class Aufgabe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		int in = Math.abs(Integer.parseInt(sc.nextLine()));
		int[] feld = getDigitCount(in);
		for(int i =0; i<feld.length;i++) {
			System.out.println(i + " Anzahl: " + feld[i]);
		}
	}
	
	public static int[] getDigitCount(int n) {
		int counter;
		int[] erg = new int[10]; 
		while(true) {
			if(n>=1) {
				counter = n%10;
				//System.out.println(counter);
				erg[counter] = erg[counter] + 1;
				if(n>10) {
					n = n/10;
					//System.out.println(n);
				}else {
					//System.out.println("N ist kleiner als 10");
					break;
				}
			}else {
				break;
			}
		}
		
		return erg;
	}

}
