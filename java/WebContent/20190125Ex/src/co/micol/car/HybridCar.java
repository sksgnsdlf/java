package co.micol.car;

public class HybridCar extends Car {
	protected int electroicGauge; //전기 잔량
	
	public HybridCar(int oil, int elc) {
		super(oil);
		this.electroicGauge = elc;
	}
	
	public void viewGauge() {
		System.out.println("오일의 양 : " +getGasolineGuage());
		System.out.println("전기의 양 : " +electroicGauge);
	}
}
