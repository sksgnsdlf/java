package co.micol.ex01;

import java.util.Scanner;

public class ScannerTest {
	Scanner sc = new Scanner(System.in);
	String name;
	int age;
	
	public void keyboardInput() {
		String name;
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("나이를 입력하세요");
		age = sc.nextInt(); //나이는 숫자니까 Int
		System.out.println("입력된 이름은 " + name + " 입니다");
		System.out.println("입력된 나이는 " + age + " 입니다");
	}
}
