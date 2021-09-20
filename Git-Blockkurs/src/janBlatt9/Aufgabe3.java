package janBlatt9;

public class Aufgabe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAscii();
	}
	
	public static void printAscii() {
		for(int i = 0;i<=127;i++) {
			System.out.println("ASCII-Wert: " + i + ", ASCII-Zeichen: " + (char) i);
		}
	}

}
