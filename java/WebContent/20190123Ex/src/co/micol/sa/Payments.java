package co.micol.sa;

public class Payments {
//	Salary sa = new Fulltime(); //Salary클래스를 사용하는 sa라는 인스턴스변수를 만듦
							      //(Fulltime는 초기화하는건데 의미가 없는듯하다?)
	Fulltime sa = new Fulltime();
	Parttime sa1 = new Parttime();
	
	public void bb() {
		sa.setNum(10);
		System.out.println(sa.getNum());
	}
}
