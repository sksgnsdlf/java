package co.micol.friends;

public class ComapyFriends extends Friends{
	protected String department;
	
	public ComapyFriends(String name, String phone, String dept) {
		super(name, phone);
		this.department = dept;		
	}
	
	public void showInfo() { //메소드 오버라이딩
		super.showInfo();
		System.out.println("근무부서 : " + department);
	}
}
