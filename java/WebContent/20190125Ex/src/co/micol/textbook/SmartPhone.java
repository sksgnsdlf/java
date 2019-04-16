package co.micol.textbook;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷을 검색합니다.");
	}
	
	public void encabslation() { //캡슐화
		turnOn();
		internetSearch();
		turnOff();
	}
}
