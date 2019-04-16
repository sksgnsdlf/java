package co.micol.ex01;

public class SwitchTest {
	int sw = 91;
	
	public void jump() {
		sw /= 10; //10으로 나누면 학점계산기처럼 가능
		switch (sw) { //여기서 나눠도되지만 좋은 방법은 아니다.
		case 9:  //sw>=90
			System.out.println("Grade A");
			break;
		case 8: //sw>=80
			System.out.println("Grade B");
			break;
		case 7: 
			System.out.println("Grade C");
			break;
		case 6: 
			System.out.println("Grade D");
			break;
		default :
			System.out.println("Grade E");
		}
	}
}
