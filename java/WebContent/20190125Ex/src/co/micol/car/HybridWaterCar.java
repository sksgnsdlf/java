package co.micol.car;

public class HybridWaterCar extends HybridCar {

	private int waterGuage; //물의 잔량
	
	public HybridWaterCar(int oil, int elc, int water) {
		super(oil, elc);
		this.waterGuage = water;
		// TODO Auto-generated constructor stub
	}

	public void showCurrentGauge() {
		System.out.println("잔여 가솔린의 양 : " + getGasolineGuage());
		System.out.println("잔여 전기의 양 : " + electroicGauge);
		System.out.println("잔여 물의 양 : "+ waterGuage);
	}
}
