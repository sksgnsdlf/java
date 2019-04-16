package co_micol.ex01;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String coffeeBean; //일반 객체 생성(데이터가없는 비어있는 객체) 
		Calculator myCalculator = new Calculator();	
		//Calculator의 타입인 myCalculator이란 이름으로 새로 Calculator의 타입을 생성한다는 뜻
		int x = 10;
		int y = 5;
		
		myCalculator.sub(x, y);//이건 메소드에서 print까지 전부 지정해준것
		
		int result; //결과값을 돌려받을 변수  
		result = myCalculator.sum(x, y);  //return값을 받을 변수(result)필요하다
		System.out.println("덧셈의 결과 = " + result); //이건 메소드에서 객체라는 틀만 가져와서
													 //변수값만 지정후 사용한것
		
	}

}
