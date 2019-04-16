package co.micol.car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridWaterCar car = new HybridWaterCar(10, 10, 10);
		car.showCurrentGauge();
		
		System.out.println("================");
		Car car1 = new Car(20); //순수한 가솔린 차량
		car1.viewGauge();
		
		System.out.println("================");
		HybridCar car2 = new HybridCar(20,10);
		car2.viewGauge();
	}

}
