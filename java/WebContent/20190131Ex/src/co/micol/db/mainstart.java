package co.micol.db;

import java.sql.SQLException;
import java.util.Scanner;

public class mainstart {

	public void maininsert() throws SQLException {
		System.out.println("insert 할 번호적으세요.(1~8번)");
		System.out.println("1.student(학생) 2.dept(학과) 3.score(성적) ");
		System.out.println("4.subject(과목) 5.professor(교수) 6.lecture(강좌)");
		System.out.println("7.attendence(출석부 테이블) 8.attendence_master(출결관리 테이블) 9.나가기");
		System.out.println("기본키 -> 외래키(2 -> 1 / 4 -> 3 / 5,4 -> 6 / 6,1 -> 8)");
		Scanner sc = new Scanner(System.in);
		int sca = sc.nextInt();
		switch (sca) {
		case 1: //순서도 : dept(2) 테이블 -> student(1) 테이블
			studentinsert si = new studentinsert();
			si.inputStudent(); //student 테이블
			break;
		case 2: //순서도 : 
			deptinsert di = new deptinsert();
			di.inputdept(); //dept 테이블
			break;
		case 3: //순서도 : subject(4) 테이블 -> score(3) 테이블
			scoreinsert sci = new scoreinsert();
			sci.inputscore(); //score 테이블
			break;		
		case 4: //순서도 :
			subjecttinsert sui = new subjecttinsert();
			sui.inputsubject(); //subject 테이블
			break;
		case 5: //순서도 : professor(5), subject(4) 테이블 -> lecture(6) 테이블  
			professorinsert pi = new professorinsert();
			pi.inputprofessor(); //교수 테이블
			break;
		case 6: //순서도 : 
			lectureinsert li = new lectureinsert();
			li.inputlecture();
			break;
		case 7: //순서도 : 복합키
			attendenceinsert ai = new attendenceinsert();
			ai.inputattendence(); //출석부 테이블
			break;
		case 8: //순서도 : lecture(6), student(1) -> attendenceMasterinsert(8)
			attendenceMasterinsert am = new attendenceMasterinsert();
			am.attendenceMasterdence(); //출결관리 테이블
			break;
		case 9:
			System.out.println("종료");
			break;
		default:
			System.out.println("해당번호가없습니다. 다시적어주세요.");
			maininsert();
			break;
		}
	}
}


//=================================================		



//=================================================	




//=================================================	
//순서도 : attendence 테이블 -> attendencemaster 테이블  

