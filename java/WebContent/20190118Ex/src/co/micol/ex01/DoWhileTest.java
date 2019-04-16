package co.micol.ex01;

public class DoWhileTest {
	public void doWhileSigma() {
		int i = 1;
		int sum = 0;
		boolean b = true;
		do {
			sum += i;
			if(i++ > 100) b = false; //1부터 101까지 더함
 		} while(b);
		System.out.println("doWhile 문합 " + sum + " 입니다.");
	}
}
