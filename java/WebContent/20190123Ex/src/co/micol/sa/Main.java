package co.micol.sa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial();
		int result;
		
		result = f.factorial(5); //재귀함수(5x4x3x2x1)
		System.out.println(result);
		
		result = f.forFactorial(5);//반복함수(1x2x3x4x5)
		System.out.println(result);
	}							//즉 비슷하긴함
}
