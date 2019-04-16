package co.micol.inheritance;

public class SuperClass {
	int n, m;
	
	public SuperClass() {
		
	}
	public SuperClass(int n) {
		this.n = n;
		sum(n);
	}
	
	
	public SuperClass(int n, int m) {
		this.n = n;
		this.m = m;
		System.out.println("두수의 뺄셈 " + sub() );
	}
	
	public int sum() {
		return n+m;
	}
	
	public void sum(int n) { //메소드 오버로딩
		System.out.println("상위클래스 매개변수 전달 합 :" + (n+100));
	}
	
	private int sub() {
		return n - m;
	}
}
