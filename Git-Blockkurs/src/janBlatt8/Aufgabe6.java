package janBlatt8;

import java.util.Scanner;

public class Aufgabe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie den X-Wert der Matrix ein: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Bitte geben Sie den Y-Wert der Matrix ein: ");
		int b = Integer.parseInt(sc.nextLine());
		double[][] erg = getIndexSumArray(a, b);
		for(int i = 0;i<erg.length;i++) {
			for(int j = 0; j<erg[i].length;j++) {
				System.out.print(erg[i][j] + " | ");
			}
			System.out.println();
		}
		
	}
	public static int[][] getIndexSumArray1(int a, int b){
		int[][] feld = new int[a][b];
		for(int i = 0;i<feld.length;i++) {
			for(int j=0;j<feld[i].length;j++) {
				feld[i][j] = i+j+1;
			}
		}
		return feld;
	}
	
	public static double[][] getIndexSumArray(int a, int b){
		double[][] feld = new double[a][b];
		for(int i = 0;i<feld.length;i++) {
			for(int j=0;j<feld[i].length;j++) {
				feld[i][j] = i+j+1;
			}
		}
		return feld;
	}
	public static double[][] aufruf(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie den X-Wert der Matrix ein: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Bitte geben Sie den Y-Wert der Matrix ein: ");
		int b = Integer.parseInt(sc.nextLine());
		double[][] erg = getIndexSumArray(a, b);
		for(int i = 0;i<erg.length;i++) {
			for(int j = 0; j<erg[i].length;j++) {
				System.out.print(erg[i][j] + " | ");
			}
			System.out.println();
		}
		return erg;
		
	}

}
