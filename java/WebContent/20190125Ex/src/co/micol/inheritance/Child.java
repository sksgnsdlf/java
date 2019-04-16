package co.micol.inheritance;

public class Child extends Parents{ //하위클래스로 Parents를 상속
	private String company;
	private String position;
	
	public Child(String name, String company, String position) {
//		this.name = name;
		super(name);
		this.company = company;
		this.position = position;
	}

	public void yourInfo() {
		yourName();
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
	}
}
