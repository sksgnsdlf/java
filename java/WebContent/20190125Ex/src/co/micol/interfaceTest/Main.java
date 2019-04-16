package co.micol.interfaceTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power tv = new TV();
		tv.on();
		
		System.out.println("============");
		
		Power ra = new Radio();
		ra.on();

	}
}
