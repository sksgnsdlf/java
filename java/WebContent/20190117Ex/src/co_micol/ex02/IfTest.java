package co_micol.ex02;

public class IfTest {
	int kor = 30;
	int eng = 90;
	int sungjuk = kor + eng;
	int avr = sungjuk / 2; //소수점이하가 안나옴
	String sResult;
	
	
	public void simpleIf() {
		if(avr >= 60) {
			System.out.println("Pass");
		}
	}
	
	public void blockIf() { //if ~ else
		if(avr >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
	
	public void multiIf() { //다중 if
		if(avr >= 90) {
			System.out.println("A");
		} else if(avr >= 80) {
			System.out.println("B");
		} else if(avr >= 70) {
			System.out.println("C");
		} else if(avr >= 60) {
			System.out.println("D");
		} else {
			System.out.println("학사경고");
		}
	}
	public void nestedIf() {
		if(avr >= 60) {
			if(kor >= 40) {
				if(eng >= 40) {
					System.out.println("Pass");
				} else {
					System.out.println("영어과목 과락");
				}
			}else {
				System.out.println("국어과목 과락");
			}
		}
	}
	
	public void conditionString() {
		sResult = (avr >= 60)? "PASS" : "FAIL";
		System.out.println(sResult);
	}
}
