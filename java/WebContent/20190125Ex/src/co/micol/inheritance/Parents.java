package co.micol.inheritance;

public class Parents { //상위 클래스
	String name;
	
	public Parents (String name) {
		this.name = name;
	}
	public void yourName() {
		System.out.println("My name is " + name);
	}
}
