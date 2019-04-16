package co.micol.carpart;

public class Car {
	//Class의 구성요소 3개 (Member,Construct,Method)
	//TODO Member group
	public String model;
	public String year;
	public String company;
	
	//TODO Construct() group //생략 가능
	public Car() { //기본생성자
		 			//내용이 아무것도 없음
	}
	
	//TODO Member Method() group
	public void zeroBack() {
		System.out.println("4.2초 입니다.");
	}
	
	public String toString() {
		System.out.println("모델은 " + model); 
		System.out.println("제조사는 " + year);
		System.out.println("연식은 " + company);
		return null;
	}
}
