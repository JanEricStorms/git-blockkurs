
public class test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = Math.sqrt(Math.pow(-4, 2)+Math.pow(0, 2));
		double phi = Math.atan(2/-4) + Math.PI;
		String[] arr = new String[2];
		arr[0] = "" +Math.sqrt(r)*(Math.cos((phi+2*0*Math.PI)/2))+ " " +Math.sqrt(r)*(Math.sin((phi+2*0*Math.PI)/2));
		arr[1] =  "" +Math.sqrt(r)*(Math.cos((phi+(2*Math.PI))/2))+ " " +Math.sqrt(r)*(Math.sin((phi+(2*Math.PI))/2));
		System.out.println(arr[0].toString());
		System.out.println(arr[1].toString());
	}

}
