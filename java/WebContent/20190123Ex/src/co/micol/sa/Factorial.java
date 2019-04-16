package co.micol.sa;

public class Factorial {
	public int factorial(int n) { //재귀함수
		if(n == 1) {
			return 1;
		}
		else 
			return n* factorial(n-1);
	}
	
	public int forFactorial(int n) { //반복함수
		int result = 1 ;
		for(int i=1; i<= n; i++) 
			result *= i;
			return result;
	}
}
