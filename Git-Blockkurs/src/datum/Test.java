package datum;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datum test = new Datum(29, 2, 2016);
		System.out.println(test);
		test.gestern();
		System.out.println(test);
		test.morgen();
		System.out.println(test);
		System.out.println(test.isSchaltjahr(2016));
	}

}
