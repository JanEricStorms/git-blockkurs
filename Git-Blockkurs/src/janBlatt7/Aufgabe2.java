package janBlatt7;

public class Aufgabe2 {
	
	public static void main(String[] args) {
		Bruch b = new Bruch(1,3);
		Bruch b1 = b;
		Bruch b2 = new Bruch(b);
		System.out.println("Orginal==Alias");
		System.out.println(b==b1);
		
		System.out.println("Orginal == Klon");
		System.out.println(b==b2);
		
		System.out.println("Alias == Klon");
		System.out.println(b1==b2);
		
		System.out.println("Orginal equals Alisa");
		System.out.println(b.equals(b1));
		
		System.out.println("Orginal equals Klon");
		System.out.println(b.equals(b2));
		
		System.out.println("Alias equals Klon");
		System.out.println(b1.equals(b2));
	}
	
}
