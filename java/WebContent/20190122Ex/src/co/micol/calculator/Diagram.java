package co.micol.calculator;

public class Diagram { //생성자 오버로딩
	int hight;
	int width;
	int radius;
	int h = 2;
	double PI = 3.1415;
	
	public Diagram() {	} //default construct(기본 생성자)
	
	public Diagram(int hight, int width) {
		this.hight = hight;
		this.width = width;
	}
	
	public Diagram(int radius) { //매개변수 1개를 넣으면 circle에서 실행되어 radius를 반환
		this.radius = radius;
	}
	
	public void circle() {	
		System.out.println("원의 면적은 " + PI*radius*radius);
	}
	
	public void box() {
		System.out.println("사각형의 면적은 " + hight*width);
	}
}
