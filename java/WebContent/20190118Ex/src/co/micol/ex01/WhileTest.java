package co.micol.ex01;

public class WhileTest {
	
	public void whileSimga() {
		int sum = 0; //변수 초기화
		int i = 1; //변수 초기화
		boolean b = true; //
		while (b) {
			sum += i;
		//	if(++i > 100) b = false;
			if(++i > 100) break; //1부터 100까지 더함
		}
		System.out.println("While 문합 " + sum + " 입니다.");
	}
}
