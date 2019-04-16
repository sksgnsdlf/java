package co.micol.calculator;

public class Calculator {
	public int sum(int x , int y) { //Method Overloading
		return x + y;
	}
	
	public int sum(int n) {
		int sigma = 0;
		for (int i = 0 ; i < n ; i++)
			sigma += i;
		return sigma;
	}
	
	public float sum(float x , float y) {
		return x + y;
	}
}
