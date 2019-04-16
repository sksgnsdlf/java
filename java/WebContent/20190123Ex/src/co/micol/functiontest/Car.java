package co.micol.functiontest;

public class Car {
	private int wheel; //멤버변수(멤버필드)를 정의
	private String model;
	private String year;
	public int price;
	
	public int getWheel() { //get - 사용가능하게함
		return wheel;
	}
	public void setWheel(int wheel) { //set - 수정가능하게함
		this.wheel = wheel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	private void run() {
		System.out.println("달립니다.");
	}
	
	public void start() {
		System.out.println("시동을 겁니다.");
		run(); //내클래스에서 run 메소드를 호출하는 방법
	}

	public void stop() {
		System.out.println("시동을 끕니다.");
	}
	
	public String toString() {
		System.out.println(price);
		System.out.println(year);
		return null;
	}
}
