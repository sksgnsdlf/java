package co.micol.ex01;

import java.util.Scanner;

public class Test {

	Scanner sc = new Scanner(System.in);

//	 public void jump() { //가로 
//	 	int age = sc.nextInt(); 
//			 for(int i = 1; i <=9; i++){ 
//	 		System.out.print(age +"x" + i + "=" +age * i + "  "); 
//		} 
//	} 
//
//	public void jump11() { //세로
//		int age = sc.nextInt();
//		for(int i = 1; i <=9; i++) {
//			System.out.println(age +"x" + i + "=" +age * i);
//		}
//	}
//
//	 public void jump111() { //원하는 값까지 구구단 
//		 int age = sc.nextInt(); 
//		 for(int i = 1; i <= age; i++)
//		 	for(int j = 1; j <=9; j++){ 
//		 		System.out.println(i +"x" + j + "=" +i * j + "  "); 
//		 	} 
//	 } 
//
//	public void jump1() { 
//		int age = sc.nextInt();
//        int i = 2;  
//        while (i <= age) {
//            int j = 1;
//            while (j < 10) {
//                System.out.print(i + "*" + j + "=" + i * j);
//                System.out.print("\t");
//                j++;
//            }
// 
//            System.out.println();
//            i++;
//        } 
//    }
//	public void mainmenu() {
//		System.out.println("1. 입력");
//		System.out.println("2. 출력");
//		System.out.println("3. 종료");
//		System.out.println("==================");
//		System.out.println("입력,출력를 선택할 번호를 적어라");
//		int number = sc.nextInt();		
//		switch (number) { 
//		case 1:  
//			submenu();
//			break;			
//		case 2: 
//			mainmenu();
//			break;
//		default :
//			System.out.println("작업을 종료합니다.");
//		}
//	}
//	public void submenu() {
//		System.out.println("1. 성명");
//		System.out.println("2. 나이");
//		System.out.println("3. 종료"); 
//		System.out.println("==================");
//		System.out.println("성명,나이를 선택할 번호를 적어라");
//		int number2 = sc.nextInt();
//		switch(number2) {
//		case 1:
//			System.out.println("이름을 적어라.");
//			String name = sc.next();
//			System.out.println("이름은 " + name + " 입니다.");
//			submenu();
//			break;
//		case 2:
//			System.out.println("나이를 적어라.");
//			int age = sc.nextInt();
//			System.out.println("나이는 " + age + " 입니다.");
//			submenu();
//			break;
//		default :
//			mainmenu();
//		}
//}
//	public void four() {
//		int i = 2;
//		double j = 0.1;
//		while (true) {
//			j *= i;
//			System.out.println(j);
//			//if (j == 400)
//			//	break;
//		}
//	}
//	public void login1() {
//			String key = "aBcD";
//			sc.next();
//			if(key.contains("a")) {
//				System.out.println("Pass");
//			}
//			else if(key.contains("B")) {
//				System.out.println("Pass");
//			}
//			else if(key.contains("c")) {
//				System.out.println("Pass");
//			}
//			else if(key.contains("D")) {
//				System.out.println("Pass");
//			}
//			else 
//				System.out.println("Fail");
//		}
//	public void login() {
//		String key;
//		key=sc.next();
//		if(key.equals("aBcD")) {
//			System.out.println("Pass");
//		}
//		else 
//			System.out.println("Fail");
//	}
//	
	public void ABC(){
		String test= sc.next();
		if(test == test.toLowerCase()) {
			String test1 = test.toUpperCase();
			System.out.println(test1);
		}
	}
}