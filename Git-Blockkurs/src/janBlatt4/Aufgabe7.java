package janBlatt4;

import javax.swing.JOptionPane;

public class Aufgabe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFibonacciNuber(Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein: "))));
	}	
	public static int getFibonacciNuber(int n) {
		int result = 0;
		int a= 1;
		int b = 0;
		for(int i =1; i<=n; i++){
			result= a+b;
			a=b;
			b=result;
			
			//System.out.println(result);
		}
		return result;
	}
}
