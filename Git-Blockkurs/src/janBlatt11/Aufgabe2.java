package janBlatt11;

import java.util.Scanner;
import janBlatt8.Aufgabe6;


public class Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie einen X-Wert an: ");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("Bitte geben Sie einen Y-Wert an: ");
		int y = Integer.parseInt(sc.nextLine());
		printArray(Aufgabe6.getIndexSumArray1(x,y));
	}

	public static void printArray(int[][] arr) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		while (true) {
			if (max > 9) {
				max = max / 10;
				count++;
			} else if (max < 10 && max >= 0) {
				count++;
				break;
			}

		}
		String s = "%-" + count + "d";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("|");
				System.out.printf(s, arr[i][j]);
				System.out.print("|");
			}
			System.out.println();
		}
	}

}
