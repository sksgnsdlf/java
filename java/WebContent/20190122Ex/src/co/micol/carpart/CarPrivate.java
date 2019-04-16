package co.micol.carpart;

public class CarPrivate {
	//Class의 구성요소 3개 (Member,Construct,Method)
	//TODO Member group
	private String model;
	private String year;
	protected String company;
	
	//TODO Construct() group //생략 가능
	public CarPrivate() { //기본생성자
		 			//내용이 아무것도 없음
	}
	//생성자를 통해서 Private변수에 값을 전달
	public CarPrivate(String m, String y) {
		this.model = m; 		
		this.year = y;
	}
	
	//TODO Member Method() group
	public void zeroBack() {
		System.out.println("4.2초 입니다.");
	}
	
	public String toString() {
		System.out.println("모델은 " + model); 
		System.out.println("제조사는 " + company);
		System.out.println("연식은 " + year);
		return null;
	}
	
	public String toString(String c) {
//		System.out.println("모델은 " + model); 
		System.out.println("제조사는 " + c);
//		System.out.println("연식은 " + year);
		return null;
	}
}
