package co.micol.grammer;

import java.util.Scanner;

public class MainIf {
//클래스 정리해도 된다.
	static IfTestClass iftest = new IfTestClass();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b;
		b = iftest.ifTest(20, 5); // 리턴값을 받기위함
		System.out.println("테스트 결과 " + b);

		int result;
		result = iftest.ifElseTest(19, 29);
		System.out.println("둘중 큰값은 " + result);

//		Scanner login = new Scanner(System.in);
//		String loginid = login.next();
//		String loginpw = login.next();

		iftest.loginCheck("user01", "1234");
		iftest.loginCheck("user011", "1234");
		iftest.loginCheck("user01", "12314");
		iftest.loginCheck("user011", "12314");
		System.out.println("================");
//		System.out.println("값을 적으세요(1~100)");
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		iftest.randomNumberSol(n);

	}
}
