package co_micol.ex01;

public class ExamCal {
	
	public static int sum(int x, int y) { //stack에 저장
		return x+y; //stack에 저장
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; //heap에 저장
		int y = 5; //heap에 저장
		int result; //heap에 저장
		
		result = sum(x, y); //heap에 있는 x와y을 stack에 있는 + 를 대입한 다음 
							//cpu에서 연산하여 heap의 result에 저장
		System.out.println(result);
	}

}
