package co.micol.textbook;

public class Main {

	public static void main(String[] args) {
		Animal cat =new Cat();
		cat.sound();
		System.out.println("============"); //추상메소드의 차이
		Animal dog2 = new Dog();
		dog2.sound();
	}
}
