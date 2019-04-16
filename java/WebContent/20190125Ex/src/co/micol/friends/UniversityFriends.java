package co.micol.friends;

public class UniversityFriends extends Friends{
	protected String major;
	
	public UniversityFriends(String name, String phone, String major) {
		super(name, phone); //부모 클래스 생성
		this.major = major;
	}
	
	public void showInfo() {
		super.showInfo(); //이거안하면 major만 출력된다.
		System.out.println("대학 전공 : " + major);
	}
}
