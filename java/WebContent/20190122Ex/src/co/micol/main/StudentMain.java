package co.micol.main;

import co.micol.student.StudentProcess;

public class StudentMain {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Student student = new Student();
//		student.setName("홍길동"); //private member에 값을 전달한다.
//		student.setStudentID("2018911012");
//		student.setCellPhone("010-0000-0000");
//		
//		//getName으로 전달되었는지 확인 
//		System.out.println(student.getName()); //private member의 값을 가져온다.
//		//toString으로 전달되었는지 확인
//		student.toString();
		
		StudentProcess student = new StudentProcess();
		student.setName("홍길동");
		student.setStduentID("2018911012");
		student.setKorHistory(70);
		student.setPhilosophy(80);
		
		student.toString();
	}
}
