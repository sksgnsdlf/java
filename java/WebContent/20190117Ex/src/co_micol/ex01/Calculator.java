package co_micol.ex01;

public class Calculator {
	public int sum(int x, int y) {
		return x+y; //Integer 형의 데이터를 돌려주는것
	}
	public void sub(int x, int y) {
		System.out.println("뺄셈 = " + (x-y));
	}
	public void mul(int x, int y) {
		System.out.println("곱셈 = " + (x*y));
	}
	public void div(int x, int y) {
		System.out.println("나눗셈 = " + (x/y));
	}
}
