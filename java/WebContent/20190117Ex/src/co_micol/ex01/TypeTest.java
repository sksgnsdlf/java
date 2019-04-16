package co_micol.ex01;

public class TypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10; //초기화 한것
		char a;  //초기화 안한것
		boolean t = true; //초기값이 true이다
		float b;
		double c;
		long d;
		
		String name; //Object Type, String 자체가 클래스이다)

		a='b'; //char 형 , 초기화방법1
		name = "대한민국은 좁다."; //초기화방법2(값자체를 넣어버림)
		
		System.out.println(a);
		System.out.println(name.charAt(4)); //index값출력
	}
}
