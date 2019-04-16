package co.micol.contruct;

public class ConstructTest {
	private String name;
	private String phone;
	
	public ConstructTest() {
		
	}
	
	public ConstructTest(String name, String phone) { //생성자
		this.name = name;
		this.phone = phone;
//		toString();
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String toString() {
		System.out.println("Your Name is " + name);
		System.out.println("Your Phone Number is " + phone);
		return null;
	}
}
