package co.micol.car;

public class Car {
	private int gasolineGuage; //가솔린 잔량
	
	public Car(int oil) {
		this.gasolineGuage = oil;
	}

	public int getGasolineGuage() {
		return gasolineGuage;
	}

	public void viewGauge() {
		System.out.println("현재 잔량 : " + gasolineGuage);
	}
}
