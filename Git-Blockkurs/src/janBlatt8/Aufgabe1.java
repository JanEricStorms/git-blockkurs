package janBlatt8;

import java.util.Scanner;

public class Aufgabe1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die erste Variable X ein: ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Bitte geben Sie die zweite Variable Y ein: ");
		int y = Integer.parseInt(sc.nextLine());
		double [][] feld = getDoubleArrray(x, y);
		for(int i = 0; i<feld.length;i++) {
			for(int j = 0; j<feld[i].length; j++) {
				System.out.print(feld[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	public static double[][] getDoubleArrray(int x, int y){
		double[][] feld = new double[x][y];
		return feld;
		
	}
}
