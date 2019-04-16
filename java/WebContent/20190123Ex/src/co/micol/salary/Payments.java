package co.micol.salary;

public class Payments {
	FullTime fulltime = new FullTime();
//	PartTime parttime = new PartTime();
	FullTime fulltime2 = new FullTime(); 
	
	
	public void fulltimePay() {
		fulltime.nomal = 1000000;
		fulltime.extraPay = 200000;
		fulltime.bouns = 300000;
		fulltime.name = "홍길동";
		
		System.out.println("정규직 급여 : " + fulltime.payF());
	}
	
	public void parttimePay() {
		fulltime2.name = "김치국";
		fulltime2.nomal = 1000000;
		fulltime2.extraPay = 300000;
		
		System.out.println("단기계약직 급여 : " + fulltime2.pay());
	}
}
