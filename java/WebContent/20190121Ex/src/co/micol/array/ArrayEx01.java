package co.micol.array;

public class ArrayEx01 {
	int[] num = new int[100]; // 배열선언과 초기화
	double[] dNum = { 0.1, 0.5, 0.3 }; // 배열선언과 초기화값을 지정
	char[] cstr; // 문자배열 선언

	public void doubleArrayPrintln() {
		System.out.println(dNum[0]);
		System.out.println(dNum[1]);
		System.out.println(dNum[2]);
		// System.out.println(dNum[3]); //논리적 오류
	}

	public void intArrayInput() {
		for (int i = 0; i < 100; i++) {
			num[i] = i + 2;
		}
	}

	public void intArrayPrintln() {
		for (int i = 0; i < 100; i++) {
			System.out.print(num[i] + " ");
		}
	}

	public void charArrayTest() {
		cstr = new char[20]; // 배열을 초기화
		for (int i = 0; i < 20; i++) {
			cstr[i] = (char) ('a' + i);
		}
		for (int i = 0; i < 20; i++) {
			System.out.print(cstr[i] + " ");
		}
	}
	
	public void selectionSort() {
		int [] num = {1,10,6,3,2,4,7,5,9,8};
		int min, temp;
		
		for(int i=0; i<num.length -1; i++) {
			min = i;
			for(int j=i+1; j<num.length; j++) {
				if(num[min] > num[j])
					min = j;
			}
			if(i != min) {
				temp = num[i];
				num[i] = num[min];
				num[min] = temp;
			}
		}
		for(int i = 0; i<num.length ; i++) {
			System.out.println(num[i]);
		}
	}
	
	public void forEachTest() {
		int [] nums = {1,10,6,3,2,4,7,5,9,8};
		int sum = 0 ;
		for(int num : nums) {
			sum += num;
		}
		System.out.println("배열의 합은 : " + sum + " 입니다.");
	}
}
