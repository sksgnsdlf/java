package co_micol.ex02;

public class IfMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfTest myIf = new IfTest(); //인스턴스 생성
		myIf.simpleIf(); //메소드만 출력한것이다
		System.out.println("---------------");
		myIf.blockIf();
		System.out.println("---------------");
		myIf.multiIf();
		System.out.println("---------------");
		myIf.nestedIf();
		System.out.println("---------------");
		myIf.conditionString();
	}

}
