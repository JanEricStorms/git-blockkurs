package janBlatt8;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die erste Länge ein: ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Bitte geben Sie die zweite Länge ein: ");
		int y = Integer.parseInt(sc.nextLine());
		int[][] feld = new int[x][y];
		
		if(isSquare(feld)==true) {
			System.out.println("Das Feld ist quadratisch");
		}else {
			System.out.println("Das Feld ist nicht quadratisch");
		}
	}
	
	public static boolean isSquare(int[][] test) {
		int maxi = test.length;
		int maxj = test[0].length;
		int pointer;
		
		for(int i=0; i<test.length;i++) {
				pointer = test[i].length;
				if(pointer>maxj) {
					maxj = test[i].length;
			}
		}
		if(maxi == maxj) {
			return true;
		}else {
			return false;
		}
		
	}
}
