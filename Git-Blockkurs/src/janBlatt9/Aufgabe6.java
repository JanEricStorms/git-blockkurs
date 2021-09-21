package janBlatt9;

import java.util.Scanner;

public class Aufgabe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] feld = getParameters();
		
		for(int i = 0; i<feld.length;i++) {
			System.out.println(feld[i]);
		}
		
	}
	
	public static int[] getParameters() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Parameter Werte duch ein Komma(,) getrennt an ");
		String in = sc.nextLine();
		String[] value = in.split(",");
		int[] erg = new int[value.length];
		for(int i = 0;i<value.length;i++) {
			try {
			erg[i] = Integer.parseInt(value[i]);
			}catch(NumberFormatException e) {
				throw new NumberFormatException("Bitte geben Sie keine Buchstaben an. Starten Sie das Programm erneut!");
			}
			
		}
		
		return erg;
	}

}
