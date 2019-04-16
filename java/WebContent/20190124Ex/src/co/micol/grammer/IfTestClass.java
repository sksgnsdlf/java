package co.micol.grammer;

public class IfTestClass {
//멤버변수
	public int number;
	public String userId = "user01";
	public String passward = "1234";
	public boolean a = true;
	private boolean b = false;
//생성자 그룹

//멤버메소드
	public boolean ifTest(int x, int y) {
		if (x > y)
			b = true;
		return b;
	}

	public int ifElseTest(int n, int m) {
		if (n > m) {
			number = n;
		} else
			number = m;
		return number;
	}

	public void loginCheck(String user, String pw) {
		if (userId.equals(user) && passward.equals(pw))
			System.out.println("환영합니다.");
		else if (userId.equals(user)) {
			if (passward.equals(pw) == false) {
				System.out.println("비번 틀림");
			}
		} else if (passward.equals(pw))
			System.out.println("아이디 틀림");
		else
			System.out.println("둘다 틀렸다");
	}
	
	public void randomNumberSol(int n) {
		double randNum = Math.random(); //0~1사이 무작위수를 발생
		number =(int) (randNum * 100) + 1;
		if(n >= number) {
			System.out.println("스캐너한 값이 크거나 같다.");
		}
		else System.out.println("랜덤값이 더 크다.");
	}
	
//	public void randomNumber() { 
//		double randNum = Math.random(); //0~1사이 무작위수를 발생
//		number =(int) (randNum * 100) + 1; //최소1 ~ 최대100사이 랜덤
//		System.out.println(number);
//	}
	
	
}
