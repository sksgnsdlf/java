package co.micol.inheritance;

public class Main {

	public static void main(String[] args) {
		SubClass cal = new SubClass(5,10,15);
		int result = cal.sum();
		int result2 = cal.mutiply();
		System.out.println("result :" + result +"     " + "result2 : " + result2);
	}
}
