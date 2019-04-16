package co.micol.functiontest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.setModel("SamSung"); //private이니까 직접접근이 안되므로
		car.setWheel(4);		 //set로 모델 날짜 등을 지정
		car.setYear("1999");
		car.price = 20000000; // public이라서 변수는 직접 값을 가져오거나 대입할 수 있음
		
		car.start();  //다른 class에서 Car class의 메소드를 호출
		
		System.out.println(car.price); //public 변수는 직접접근 가능함(11번째줄이랑 내용같음)
		System.out.println(car.getModel()); //private 변수는 getter를 통해 가져옴
											//(8번줄과 비슷)		
		car.stop();
		car.stop();
	}
}
