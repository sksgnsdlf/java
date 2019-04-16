package co.micol.ex01;

public class ForTest {
	int sum = 0;
	
	public void sigma() {
		for(int i =1; i <=100; i++) {
			sum += i;
		}	
		System.out.println("총합은 " + sum + " 이다.");
	}
}
