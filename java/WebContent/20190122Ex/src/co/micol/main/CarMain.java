package co.micol.main;

import co.micol.carpart.CarPrivate;
import co.micol.carpart.CarProtected;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car myCar = new Car();
//		myCar.model = "Sonata"; //Car클래스에 넘겨줌
//		myCar.company = "Hyendai"; //Car클래스에 넘겨줌
//		myCar.year = "2019"; //Car클래스에 넘겨줌
//		//System.out.println(myCar.year); 이미 toString()으로 출력하기때문에 사용안함
//		
//		myCar.zeroBack(); //Car클래스에 있는걸 출력
//		myCar.toString(); //Car클래스에 있는걸 출력
//		myCar. (model,year,company를 사용못함 / 다른패키지인데 Public이 아니라서)
		
		CarPrivate myCar = new CarPrivate("TICO","1990");
		myCar.toString();
		myCar.toString("ccc");
		
		
	}
}
