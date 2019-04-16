package co.micol.inheritance;

public class SubClass extends SuperClass{
	private int num;
	private int num2;
	
	public SubClass(int n, int m) {
		super(n,m);
		this.num = n;
		this.num2 = m;
//		this.n = n;
//		this.m = m;
	}
	
	public SubClass(int n , int m, int l) {
		super(n);		//상위 클래스의 매개변수 전달 생성자를 수행
		this.num = n;
		this.num2 = m;
		this.m = l;
		
	}
	
	public int mutiply() {
		return num * num2;
	}
}
