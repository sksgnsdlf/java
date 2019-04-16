package co.micol.friends;

public class Friends {
	protected String name;
	protected String phone;
	
	public Friends(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void showInfo() {
		System.out.println("친구 이름 : " + name);
		System.out.println("폰 번호는 : " + phone);
	}
}
