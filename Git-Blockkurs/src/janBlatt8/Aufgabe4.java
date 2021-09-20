package janBlatt8;

import java.util.Scanner;

public class Aufgabe4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Zahl für den Monat ein: ");
		int in = Integer.parseInt(sc.nextLine());
		System.out.println(getNameOfMonth(in));
	}
	
	public static String getNameOfMonth(int no) {
		String month = "";
		String[] year = {"Januar","Februar","März","April","Mai","Juni","Juli","August","Septemer","Oktober","Novembver","Dezember"};
		try{
			month = year[(no-1)];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Die Angegebene Zahl passt zu keinem Monat. Starten sie das Programm neu und versuchen Sie es erneut!");
		}
		
		return month;
	}
}
