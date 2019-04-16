package co.micol.interfaceTest;

public class Radio implements Power {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("소리가 들린다.");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("소리가 꺼진다.");
	}
	
	public void channel() {
		System.out.println("주파수가 변경 됩니다.");
	}

}
