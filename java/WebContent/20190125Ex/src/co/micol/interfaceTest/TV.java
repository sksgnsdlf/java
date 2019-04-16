package co.micol.interfaceTest;

public class TV implements Power {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("소리가 들린다.");
		System.out.println("영상이 나온다.");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("화면이 사라진다.");
	}
	
	public void show() {
		System.out.println("채널을 변경합니다.");
	}
}
